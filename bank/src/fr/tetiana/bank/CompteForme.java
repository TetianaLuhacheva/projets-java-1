package fr.tetiana.bank;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class CompteForme extends JFrame {
	public CompteForme() {
		this.setSize(600, 600);
		setTitle("Affichage");
		setLayout(new FlowLayout());
		
		
		final JFrame frame = new JFrame("Exemple de JTable");
		 
        //En-têtes pour JTable 
        String[] columns = new String[] {
            "Id", "Nom", "Adresse", "Taux horaire", "A temps partiel"
        };
         
        //données pour JTable dans un tableau 2D
        Object[][] data = new Object[][] {
            {1, "Thomas", "Paris", 20.0, true },
            {2, "Jean", "Marseille", 50.0, false },
            {3, "Yohan", "Lyon", 30.0, true },
            {4, "Emily", "Toulouse", 60.0, false },
            {5, "Alex", "Nice", 10.0, false },
        };
 
        //crée un JTable avec des données
        JTable table = new JTable(data, columns);
    
        JScrollPane scroll = new JScrollPane(table);
        table.setFillsViewportHeight(true);
 
        JLabel labelHead = new JLabel("Liste des employes");
        labelHead.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));
 
        //frame.getContentPane().add(labelHead,BorderLayout.PAGE_START);
        //ajouter la tabl

		
		
	}
}
