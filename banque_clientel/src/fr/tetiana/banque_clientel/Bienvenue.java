package fr.tetiana.banque_clientel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
 
import fr.tetiana.banque_clientel.model.Client;

public class Bienvenue {

	public Bienvenue() {

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
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// --------------------------------------------------------------------------
		
		
		// MENU :

		Out.w(" ______________________________________");
		Out.w("|                                      |");
		Out.w("|       Bienvenue ?? la banque !        |");
		Out.w("|______________________________________|");
		Out.w("\n Please, log in :");
		
		// CLIENT :
		
		Out.wc("\t\tN??: \t\t");
		float numeroClient = Out.rFloat();
		Out.w("Num??ro est confirm??, merci !");


		Out.wc("\t\tNom: \t");
		String nomClient = Out.r();
		Out.w("Nom est confirm??, merci !");
		
		float montant = 0;
		
		// CLient
		Client client = new Client(numeroClient, nomClient, montant);
		

		Out.w(" ______________________________________");
		Out.w("|                                      |");
		Out.w("|     Merci ! Vous est autoris?? !      |");
		Out.w("|                                      |");
		Out.w("|            Qu'est-ce que             |");
		Out.w("|        vous voudriez faire ?         |");
		Out.w("|______________________________________|");
		Out.w("\n");
		
		Out.w("1 - Creer un compte"); 
		
		
		

		// --------------------------------------------------------------------------
		

		Out.wc("\t\tnumeroClient: \t");
		float numClient = Out.rFloat();
		Out.w("Numero est confirm??, merci !");
		 
		Out.wc("\t\tnumeroCompteBancaire: \t");
		float numeroCompteBancaire = Out.rFloat();
		Out.w("numeroCompteBancaire est confirm??, merci !");
		
		String typeCompteBancaire;
		//Compte compteBancaire = new Compte(numeroCompteBancaire, numClient); 
		
		// effectuer des versements ou des retraits
		
		
		
		// --------------------------------------------------------------------------
		
		
		
		
		
		/*
		 * 	Une application des comptes bancaires
		 ???	Permettra la cr??ation des comptes qui appartiennent a des clients
		 ???	Un client peut poss??der plusieurs compte		
		 ???	Les comptes sont types (Courant et Epargne)
		 ???	Lis peuvent ??tre de types morales (entreprise) ou  physique.
		 *	Un client de TYPE MORALE :
		  		doit renseigner son repr??sentant :
		  		 	qui une personne physique;
		  		 	qui a un nom, 
		  		 	son N?? de s??curit?? sociale, 
		  		 	le t??l??phone, etc.
		 *	L???application doit permettre d???effectuer des versements ou des retraits
		 * 	Chaque transaction doit avoir une date, une r??f??rence,  le num??ro de compte concern?? ainsi que le montant
		 *	Lors de la  cr??ation des comptes de types d?????pargne, un montant initial est requis.
		    de 100 euro

		 */

		
		
		


	}
	
}
