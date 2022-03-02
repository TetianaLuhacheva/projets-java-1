package fr.tetiana.VERSION_1_pipelineshow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.FlowLayout;
//import javax.swing.JFrame;
//import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setTitle("Formulaire");
		window.setLayout(new FlowLayout());

		JTextField field = new JTextField(15);
		JComboBox boxGenre = new JComboBox(Genre.values());
		JComboBox boxCivilite = new JComboBox(Civilite.values()); 

		JButton buttonEnrigister= new JButton("Enregistrer");




		window.setSize(600,400);
		window.setVisible(true);

		window.getContentPane().add(field);
		window.getContentPane().add(boxGenre);
		window.getContentPane().add(boxCivilite);
		window.getContentPane().add(buttonEnrigister);
		//window.setLocation(arg0);
		
		
		
		buttonEnrigister.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ClickG) { 
				Personne per = new Personne();
				per.setCiv(Civilite.valueOf(boxCivilite.getSelectedItem().toString()));
				per.setGenre(Genre.valueOf(boxGenre.getSelectedItem().toString()));	
				
				String reponse;
				
				try {
					reponse = per.perField();
					JOptionPane.showMessageDialog(buttonEnrigister, reponse);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(buttonEnrigister, e.getMessage());
				}
				
				
				//JOptionPane.showMessageDialog(window, per.perField());
				
			}
		});
		
	}

}
