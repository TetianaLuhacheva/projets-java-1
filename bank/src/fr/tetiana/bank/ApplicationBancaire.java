package fr.tetiana.bank;

import javax.swing.JMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ApplicationBancaire {
	public static void main(String[] args) {
		
		
		JMenuBar menuBar=new JMenuBar();
		JFrame frame=new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		JMenu fichier=new JMenu("Fichier");
		JMenuItem quitter=new JMenuItem("Quitter l'application");
		fichier.add(quitter);
		quitter.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
					System.exit(0);				
			}
		});

		
		menuBar.add(fichier);
		JMenu traitement = new JMenu("Traitement");
		
		JMenu compte = new JMenu("Compte");
		JMenuItem addCompte = new JMenuItem("Ajouter Compte");
		JMenuItem rechercherCompte=new JMenuItem("Rechercher Compte");
		rechercherCompte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CompteForme formulairRechercheCompte = new CompteForme();
				formulairRechercheCompte.setVisible(true);
				
			}
		});
		
		
		compte.add(addCompte);
		compte.add(rechercherCompte);
		traitement.add(compte);
		JMenu operation=new JMenu("Operation");
		JMenuItem addOperation=new JMenuItem("Ajouter Operation");
		JMenuItem rechercherOperation=new JMenuItem("Rechercher Operation");
		
		operation.add(addOperation);
		operation.add(rechercherOperation);
		traitement.add(operation);
		
		menuBar.add(traitement);
		JMenu help=new JMenu("?");
		menuBar.add(help);
		
		frame.setJMenuBar(menuBar);
		frame.setSize(1000, 800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	
	}
}
