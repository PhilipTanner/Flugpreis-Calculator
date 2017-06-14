package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import dto.Destination;
import logic.DataBridge;
import logic.Economy;
import logic.Flug;

public class Userinput extends JFrame implements ActionListener{
	
	DataBridge db = new DataBridge();
	//Labels
	JLabel name = new JLabel ("Flugpreisabfrage");
	JLabel von = new JLabel ("Von:");
	JLabel nach = new JLabel ("Nach:");
	JLabel person = new JLabel ("Personen");
	JLabel hinrueck = new JLabel ("Hin- und R�ckflug");
	JLabel economy = new JLabel ("Economy");
	JLabel business = new JLabel ("Business");
	JLabel firstclass = new JLabel ("First Class");
	JLabel east = new JLabel("");
	JLabel west = new JLabel("");
	JLabel north = new JLabel("");
	JLabel south = new JLabel("");
	JLabel space = new JLabel("");
	JLabel space2 = new JLabel("");
	JLabel space3 = new JLabel("");
	JLabel space4 = new JLabel("");
	
	//Button (OK)
	JButton berechnen = new JButton("OK");
	
	//Checkbox f�r Hin- und R�ckflug Option
	JCheckBox hinrueckButton = new JCheckBox("");
	
	JRadioButton economyButton = new JRadioButton("");
	JRadioButton businessButton = new JRadioButton("");
	JRadioButton firstclassButton = new JRadioButton("");
	ButtonGroup radiogroup = new ButtonGroup();
	
	//Schriftgr�sse f�r das Titel
	Font myFont = new Font("San-Serif", Font.BOLD, 35);
	
	//Dropdowns
	JComboBox<Destination> startort = new JComboBox<Destination>();
	
	JComboBox<Destination> zielort = new JComboBox<Destination>();

	JComboBox<String> anzperson = new JComboBox<String>();
	
	

	//Panels
	JPanel main = new JPanel();
	JPanel titel = new JPanel();
	JPanel top = new JPanel(); 		// von, nach, Anzahlpersonen, Hin- und R�ckflug
	JPanel bottom = new JPanel();	// 
	JPanel core = new JPanel();
	
	public Userinput(){
	
	setLayout(new BorderLayout());
	
	main.setLayout(new BorderLayout());
	top.setLayout(new GridLayout(4,2));
	bottom.setLayout(new GridLayout(6,2));
	core.setLayout(new GridLayout(2,1));
	
	north.setPreferredSize(new Dimension(25,25));
	south.setPreferredSize(new Dimension(25,25));
	west.setPreferredSize(new Dimension(100,100));
	east.setPreferredSize(new Dimension(100,100));
	space.setPreferredSize(new Dimension(100,100));
	space2.setPreferredSize(new Dimension(100,100));
	space3.setPreferredSize(new Dimension(100,100));
	space4.setPreferredSize(new Dimension(100,100));
	name.setPreferredSize(new Dimension(300,80));
	
	
	name.setFont(myFont);
	
	getContentPane().setBackground(Color.WHITE);
	top.setBackground(Color.WHITE);
	bottom.setBackground(Color.WHITE);
	core.setBackground(Color.WHITE);
	titel.setBackground(Color.WHITE);
	hinrueckButton.setBackground(Color.WHITE);
	economyButton.setBackground(Color.WHITE);
	businessButton.setBackground(Color.WHITE);
	firstclassButton.setBackground(Color.WHITE);
	
	
	main.add(titel);
	main.add(core);
	core.add(top);
	core.add(bottom);
	add(north);
	add(south);
	add(east);
	add(west);
	
	radiogroup.add(economyButton);
	radiogroup.add(businessButton);
	radiogroup.add(firstclassButton);
	
	titel.add(name);
	top.add(von);
	top.add(startort);
	top.add(nach);
	top.add(zielort);
	top.add(person);
	top.add(anzperson);
	top.add(hinrueck);
	top.add(hinrueckButton);
	
	bottom.add(space);
	bottom.add(space2);
	bottom.add(economy);
	bottom.add(economyButton);
	bottom.add(business);
	bottom.add(businessButton);
	bottom.add(firstclass);
	bottom.add(firstclassButton);
	bottom.add(space3);
	bottom.add(space4);
	bottom.add(berechnen);
	
	add(main, BorderLayout.CENTER);
	add(north, BorderLayout.NORTH);
	add(south, BorderLayout.SOUTH);
	add(west, BorderLayout.WEST);
	add(east, BorderLayout.EAST);
	add(titel, BorderLayout.NORTH);
	add(core, BorderLayout.CENTER);
	
	hinrueckButton.setMnemonic(KeyEvent.VK_C); 
    hinrueckButton.setSelected(false);
	
	economyButton.setMnemonic(KeyEvent.VK_B);
	economyButton.setActionCommand("");
	economyButton.setSelected(true);
	businessButton.setMnemonic(KeyEvent.VK_B);
	businessButton.setActionCommand("");
	firstclassButton.setMnemonic(KeyEvent.VK_B);
	firstclassButton.setActionCommand("");
	
	Destination[] test = new Destination[db.getDestinations().size()];
	startort.setModel(new DefaultComboBoxModel<Destination>(db.getDestinations().toArray(test)));
	
	
	setTitle("Fluglinien");
	setVisible(true);
	setSize(600,500);
	
	economyButton.setActionCommand("Economy");
	businessButton.setActionCommand("Business");
	firstclassButton.setActionCommand("First");
	berechnen.addActionListener(this);

	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*if(e.getSource()== berechnen){
			anzperson = anzperson.getSelectedItem();
			if(radiogroup.getSelection().getActionCommand().equals("Economy")){
				Economy eco = new Economy(startort.getSelectedItem(), zielort.getSelectedItem(), anzperson.getSelectedItem(), hinrueckButton);
			}else if(radiogroup.getSelection().getActionCommand().equals("Business")){
				
			}else{
				
			}
			
			
		}*/
		
		if(e.getSource()== berechnen){
		     Object des = startort.getSelectedItem();
		}
	}

}
