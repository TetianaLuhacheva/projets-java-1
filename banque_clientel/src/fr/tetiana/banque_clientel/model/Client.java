package fr.tetiana.banque_clientel.model;

public class Client {
	
	float numeroClient;
	String nomClient;
	String typesClient;
	double montant;
	
	public Client(float numeroClient, String nomClient, double montant) {
		super(); 
	}
	public float getNumeroClient() {
		return numeroClient;
	}
	public void setNumeroClient(float numeroClient) {
		this.numeroClient = numeroClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getTypesClient() {
		return typesClient;
	}
	public void setTypesClient(String typesClient) {
		this.typesClient = typesClient;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
	
}
