package fr.whale.version02.models;

import java.util.ArrayList;

public class User {
	private long userId;
	private String email;
	private String password;
	
	private String prenom;
	private String nom;
	
	private String adress;
	private String companyName;
	 
	private ArrayList<Project> projects = new ArrayList<Project>();	
	private ArrayList<Compte> comptes = new ArrayList<Compte>();

	public long getUserId() {
		userId ++;
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public ArrayList<Project> getProjects() {
		return projects;
	}
	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
	
	/*
	 * Comptes 
	 */	

	public ArrayList<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(ArrayList<Compte> comptes) {
		this.comptes = comptes;
	}
	
	/*
	 * Juste afficher 
	 */

	public String infoComptes() {
		return "User comptes = " + comptes;
	} 
	public String infoGetComptes() {
		return "User getComptes() =" + getComptes();
	}

	public String infoGetClass() {
		return "User getClass() =" + getClass();
	}
	public String infoHashCode() {
		return "User hashCode()=\t" + hashCode();
	}
	public String toString() {
		return "User" + super.toString();
	}
	 
	 
	
}
