package fr.whale.version02.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserPage {
	static JPanel inscriptionPanel = new JPanel();  
    static JFrame inscriptionFrame = new JFrame(); 

	public JPanel userPanel() {
	    
	    // Panel
	    inscriptionPanel.setBackground(new Color(30,22,71,255));
	    inscriptionPanel.setBounds(0,0,381,513);
	    inscriptionFrame.getContentPane().add(inscriptionPanel);
	    inscriptionPanel.setLayout(null);
	    
	    // Prenom
	    JLabel labelPrenom = new JLabel("Prenom :");
	    labelPrenom.setForeground(new Color(218,236,250,255));
	    labelPrenom.setBounds(10, 14, 84, 14);
	    inscriptionPanel.add(labelPrenom);
	    
	    JTextField fieldPrenom = new JTextField();
	    fieldPrenom.setBounds(104, 11, 205, 20);
	    inscriptionPanel.add(fieldPrenom);
	    fieldPrenom.setColumns(10);
	    	    
	    //Nom
	    JLabel labelNom = new JLabel("Nom :");
	    labelNom.setForeground(new Color(218,236,250,255));
	    labelNom.setBounds(10, 45, 84, 14);
	    inscriptionPanel.add(labelNom);
	    

	    JTextField fieldNom = new JTextField();
	    fieldNom.setBounds(104, 42, 205, 20);
	    inscriptionPanel.add(fieldNom);
	    fieldNom.setColumns(10);
	    
	    // Email
	    JLabel labelEmail = new JLabel("Email :");
	    labelEmail.setForeground(new Color(218,236,250,255));
	    labelEmail.setBounds(10, 75, 84, 14);
	    inscriptionPanel.add(labelEmail);

	    JTextField fieldEmail = new JTextField();
	    fieldEmail.setBounds(104, 75, 205, 20);
	    inscriptionPanel.add(fieldEmail);
	    fieldEmail.setColumns(10);

	    // Sexe
	    
	    JLabel labelSexe = new JLabel("Sexe :");
	    labelSexe.setForeground(new Color(218,236,250,255));
	    labelSexe.setBounds(10, 105, 84, 14);
	    inscriptionPanel.add(labelSexe);
	    
	    JTextField fieldSexe = new JTextField();
	    fieldSexe.setBounds(104, 105, 205, 20);
	    inscriptionPanel.add(fieldSexe);
	    fieldSexe.setColumns(10);
	    
	    
	    // Button Creer Compte
	    JButton buttonCompte = new JButton("Creer le compte");
	    buttonCompte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String prenom = fieldPrenom.getText();
				String nom = fieldNom.getText();
				String email = fieldEmail.getText();
				String sexe = fieldSexe.getText();
				
				
				   
			}
		});	     
	    inscriptionPanel.add(buttonCompte);
	    buttonCompte.setBounds(56, 215, 125, 23); 
	    

	    // Button Creer Compte
	    JButton annulerCompte = new JButton("Annuler");
	    annulerCompte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { 
			}
		});	     
	    //inscriptionPanel.add(annulerCompte); 
	    annulerCompte.setBounds(56, 245, 125, 23); 

 
	    return inscriptionPanel;
 
	} 
	
	public static JFrame userFrame() {
 
		UserPage inscrPanel = new UserPage();
		JPanel inPanel = inscrPanel.userPanel();

		inPanel.setBackground(new Color(30,22,71,255));
		inscriptionFrame.add(inPanel); 
	    // Frame for Inscription panel 
	    inscriptionFrame.getContentPane().setLayout(null); // добавляет лайаут на фрєйм
	    inscriptionFrame.setBounds(100,100,381,513); // определяем позицию на фрєйме кнопки, её ширину и длинну
	    
	    
	    JButton buttonCloseCompte = new JButton("Exit");
	    buttonCloseCompte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				inscriptionFrame.setVisible(false);
			}
		});	    
	    
	    buttonCloseCompte.setBounds(206, 245, 75, 23);  
	    inscriptionFrame.getContentPane().add(buttonCloseCompte);
	    
	    return inscriptionFrame;
		
	}
 
	

}
