package fr.tetiana.casino;

public class User {

	private long userId;
	private String email;
	private String password;
	
	private String prenom;
	private String nom;
	
	private String adress;
	private String city;
	private String country;
	private String socialNumber;
	private String telNumber;
	
	private String companyName;
	
	private CompteGeneral accountGeneral;
	private CompteEpargne accountEpargne;
	
	public User() { 
	}
	
	public User(long userId, String email, String password, String prenom, String nom, String adress, String city,
			String country, String socialNumber, String telNumber, String companyName, CompteGeneral accountGeneral,
			CompteEpargne accountEpargne) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.prenom = prenom;
		this.nom = nom;
		this.adress = adress;
		this.city = city;
		this.country = country;
		this.socialNumber = socialNumber;
		this.telNumber = telNumber;
		this.companyName = companyName;
		this.accountGeneral = accountGeneral;
		this.accountEpargne = accountEpargne;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSocialNumber() {
		return socialNumber;
	}
	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public CompteGeneral getAccountGeneral() {
		return accountGeneral;
	}
	public void setAccountGeneral(CompteGeneral accountGeneral) {
		this.accountGeneral = accountGeneral;
	}
	public CompteEpargne getAccountEpargne() {
		return accountEpargne;
	}
	public void setAccountEpargne(CompteEpargne accountEpargne) {
		this.accountEpargne = accountEpargne;
	}
}
