package fr.tetiana.casino;

public class Transaction {
	private double montantTransaction;
	private String moyantPayement;
	private Caisse typeCaisse;
	private String nomOperateur;
	
	
	public Transaction() {
		super();
	}
	
	public double getMontantTransaction() {
		return montantTransaction;
	}
	public void setMontantTransaction(double montantTransaction) {
		this.montantTransaction = montantTransaction;
	}
	public String getMoyantPayement() {
		return moyantPayement;
	}

	public void setMoyantPayement(String moyantPayement) {
		this.moyantPayement = moyantPayement;
	}
	public Caisse getTypeCaisse() {
		return typeCaisse;
	}
	public void setTypeCaisse(Caisse typeCaisse) {
		this.typeCaisse = typeCaisse;
	}
	public String getNomOperateur() {
		return nomOperateur;
	}
	public void setNomOperateur(String nomOperateur) {
		this.nomOperateur = nomOperateur;
	}
}
