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

import logic.Economy;
import logic.Flug;

public class Output extends JFrame implements ActionListener{
	
	//Labels
	JLabel name = new JLabel ("Flugpreisabfrage");
	JLabel von = new JLabel ("Von:");
	JLabel startort = new JLabel("test");
	JLabel nach = new JLabel ("Nach:");
	JLabel zielort = new JLabel("test");
	JLabel person = new JLabel ("Personen:");
	JLabel anzperson = new JLabel("1");
	JLabel hinrueck = new JLabel ("Hin- und R�ckflug:");
	JLabel hinrueckButton = new JLabel ("ja");
	JLabel preis = new JLabel ("Preis:");
	JLabel preisausgabe = new JLabel("25");
	JLabel east = new JLabel("");
	JLabel west = new JLabel("");
	JLabel north = new JLabel("");
	JLabel south = new JLabel("");
	JLabel klasse = new JLabel("Klasse:");
	JLabel ausgewaehlteklasse = new JLabel("economy");

	
	//Schriftgr�sse f�r das Titel
	Font nameFont = new Font("San-Serif", Font.BOLD, 35);
	Font preisFont = new Font("San-Serif", Font.BOLD, 15);
	

	//Panels
	JPanel main = new JPanel();
	JPanel titel = new JPanel();
	JPanel core = new JPanel();
	
	
	public Output(){
	
	setLayout(new BorderLayout());
	
	main.setLayout(new BorderLayout());
	core.setLayout(new GridLayout(6,2));
	
	north.setPreferredSize(new Dimension(25,25));
	south.setPreferredSize(new Dimension(25,25));
	west.setPreferredSize(new Dimension(100,100));
	east.setPreferredSize(new Dimension(100,100));
	name.setPreferredSize(new Dimension(300,80));
	
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
	
	
	
	setTitle("Fluglinien");
	setVisible(true);
	setSize(600,500);

	
	}
	
	public static void main(String[] args) {
		Output op = new Output();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

