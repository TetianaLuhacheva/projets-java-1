package fr.tetiana.pharmacie;

import java.util.ArrayList;

public class Menu {
	ArrayList<Produit> allProduits = new ArrayList(); 
	
	public Menu() {
		super();

		boolean continuer = true; 

		while(continuer){			
			Out.r("\n__________________________________________\n");
			Out.r("\n              Bienvenue!\n");
			Out.r("__________________________________________\n");
			
			Out.r("1.	Saisie des produits"); 
			Out.r("2.	Consulter les produits"); 
			Out.r("3.	Mise en stock des produits"); 
			Out.r("4.	Vente des produits"); 
			Out.r("5.	Quittez"); 

			Out.r("__________________________________________\n");
			Out.rc("\nVotre choix : "); 
			
			int choix = Out.rInt();
					  
			
			switch(choix) {
				case 1 :					 
					
					Produit p = Produit.saisirProduits();						
					allProduits.add(p);
										
					break;
					
				case 2 :
					Out.r("2. Consulter les produits : "); 
					Out.r("Description :\nLa consultation de produit permet d’afficher les produits ainsi que leur stock.\n");
					
					for(Produit produit : allProduits) {						
						Out.w(produit.toString());
					} 
					
					break;
					
				case 3 :
					Out.r("3. Mise en stock des produits :");  
					Out.r("Description :\nLa mise en stock permet d’ajouter un produit en stock.");					
					
					Produit.stocker(allProduits);					
					
					break;
					
				case 4 :
					Out.r("4. Vente produit :"); 
					Out.r("La vente des produits permet de demander à un client non enregistré d’acheter les produits");
					
					Produit.retirerDuStock(allProduits);
					
					break;
					
				case 5 :
					Out.r("À bientôt !"); 
					continuer = false; 
					break;
					
				default:
					Out.r("Saisissez 1, 2, 3, 4 ou 5:"); 				
					break;
			} 

		
		}
		
	} 
}
