package fr.tetiana.pharmacie;

import java.util.ArrayList;

public class Produit {
	private int code;
	private int stock = 0;	
	private String designation;
	

	// GETTERS et SETTERS
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	// OUR CUSTOM FONCTIONS
	public static Produit saisirProduits() {
		Produit produit = new Produit();

		Out.r("__________________________________________\n");
		Out.r("\n              PRODUIT !\n");

		Out.r("(On va saisir le nombre de produit \nà stocker dans notre pharmacie)");
		Out.r("__________________________________________\n");
		Out.r("Les données de votre produit à saisir : ");
		
		// code
		Out.rc("Code produit: ");
		int codeProduit = Out.rInt();			
		Out.r("Confirmé : " + codeProduit);
		produit.setCode(codeProduit);

		// designation
		Out.r("");
		Out.rc("Designation: ");
		String designationProduit = Out.r();	
		Out.r("Confirmé : " + designationProduit);
		
		// stock
		produit.setDesignation(designationProduit);		
		
 
		Out.r(produit.toString());		
		Out.r("\nBien ajouté !\n");	 
		
		return produit;
	}
	
	@Override
	public String toString() {
		return "Acrticle N°" + code + "\t\t|\t total : " + stock + " \t\t|\t Nom = " + designation + "\t|";
	}
	
	public static void stocker(ArrayList<Produit> listProduits) { 
		Out.r("__________________________________________\n");
		Out.r("\n              STOCK !\n");

		Out.r("(Choisissez quel produit on va garder)");
		Out.r("__________________________________________\n"); 
		
		// code
		Out.rc("Code produit existant: ");
		int code = Out.rInt();			
		Out.r("Confirmé : " + code); 
		
		// quentité
		Out.rc("Quentité: ");
		int quantity = Out.rInt();			
		Out.r("Confirmé : " + quantity);	
		
		for (int i = 0; i < listProduits.size(); i++) {
			if (listProduits.get(i).getCode() == code){
				listProduits.get(i).setStock(listProduits.get(i).getStock() + quantity);
			}
		}
		
		// resultat
		Out.r("");
		Out.r("Le resultat : ");
		Out.r("Code : \t\t" + code);
		Out.r("Confirmé : \t" + quantity);	
		Out.r("\nBien ajouté !\n");	 
		 
	}
	
	public static void retirerDuStock(ArrayList<Produit> listProduits) {

		// code
		Out.rc("Code produit existant: ");
		int code = Out.rInt();			
		Out.r("Confirmé : " + code); 
		
		// quentité
		Out.rc("Quentité: ");
		int quantity = Out.rInt();			
		Out.r("Confirmé : " + quantity);
		
		for (int i = 0; i < listProduits.size(); i++) {
			if (listProduits.get(i).getCode() == code){
				listProduits.get(i).setStock(listProduits.get(i).getStock() - quantity);
			}
		}
		Out.r("\nBien vendu !\n");
		
		
		
	}
	
	
	
	
	
	
}
