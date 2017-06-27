package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dto.Destination;
import logic.Business;
import logic.Economy;
import logic.First;
import logic.Flug;

public class Output extends JFrame implements ActionListener {

	// Labels
	JLabel name = new JLabel("Flugpreisabfrage");
	JLabel von = new JLabel("Von:");
	JLabel startort = new JLabel("");
	JLabel nach = new JLabel("Nach:");
	JLabel zielort = new JLabel("");
	JLabel person = new JLabel("Personen:");
	JLabel anzperson = new JLabel("");
	JLabel hinrueck = new JLabel("Hin- und Rückflug:");
	JLabel hinrueckButton = new JLabel("");
	JLabel preis = new JLabel("Preis:");
	JLabel preisausgabe = new JLabel("");
	JLabel east = new JLabel("");
	JLabel west = new JLabel("");
	JLabel north = new JLabel("");
	JLabel south = new JLabel("");
	JLabel klasse = new JLabel("Klasse:");
	JLabel ausgewaehlteklasse = new JLabel("");

	// Schriftgr�sse f�r das Titel
	Font nameFont = new Font("San-Serif", Font.BOLD, 30);
	Font preisFont = new Font("San-Serif", Font.BOLD, 15);

	// Panels
	JPanel main = new JPanel();
	JPanel titel = new JPanel();
	JPanel core = new JPanel();

	public Output(Destination deststart, Destination destziel, int persons, boolean returnFlight,
			String selectedclass) {

		setLayout(new BorderLayout());

		main.setLayout(new BorderLayout());
		core.setLayout(new GridLayout(6, 2));

		north.setPreferredSize(new Dimension(25, 25));
		south.setPreferredSize(new Dimension(25, 25));
		west.setPreferredSize(new Dimension(100, 100));
		east.setPreferredSize(new Dimension(100, 100));
		name.setPreferredSize(new Dimension(300, 80));

		name.setFont(nameFont);
		preis.setFont(preisFont);
		preisausgabe.setFont(preisFont);

		getContentPane().setBackground(Color.WHITE);
		core.setBackground(Color.WHITE);
		titel.setBackground(Color.WHITE);

		main.add(titel);
		main.add(core);
		add(north);
		add(south);
		add(east);
		add(west);

		titel.add(name);
		core.add(von);
		core.add(startort);
		core.add(nach);
		core.add(zielort);
		core.add(person);
		core.add(anzperson);
		core.add(hinrueck);
		core.add(hinrueckButton);

		core.add(klasse);
		core.add(ausgewaehlteklasse);
		core.add(preis);
		core.add(preisausgabe);

		add(main, BorderLayout.CENTER);
		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
		add(west, BorderLayout.WEST);
		add(east, BorderLayout.EAST);
		add(titel, BorderLayout.NORTH);
		add(core, BorderLayout.CENTER);

		startort.setText(deststart.getName());
		zielort.setText(destziel.getName());
		anzperson.setText(String.valueOf(persons));

		if (returnFlight == false) {
			hinrueckButton.setText("NEIN");
		} else if (returnFlight == true) {
			hinrueckButton.setText("JA");
		}

		if (selectedclass.equals("Economy")) {
			ausgewaehlteklasse.setText("Economy");
			Flug eco = new Economy(deststart, destziel, persons, returnFlight);
			preisausgabe.setText(String.valueOf(Math.round(100.0 * eco.calcPrice() / 100.0)) + " CHF");
		} else if (selectedclass.equals("Business")) {
			ausgewaehlteklasse.setText("Business");
			Flug busi = new Business(deststart, destziel, persons, returnFlight);
			preisausgabe.setText(String.valueOf(Math.round(100.0 * busi.calcPrice() / 100.0)) + " CHF");
		} else {
			ausgewaehlteklasse.setText("First");
			Flug frst = new First(deststart, destziel, persons, returnFlight);
			preisausgabe.setText(String.valueOf(Math.round(100.0 * frst.calcPrice() / 100.0)) + " CHF");
		}

		setTitle("Fluglinien");
		setVisible(true);
		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
