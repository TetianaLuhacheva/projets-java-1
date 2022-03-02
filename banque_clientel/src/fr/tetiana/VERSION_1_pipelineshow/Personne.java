package fr.tetiana.VERSION_1_pipelineshow;

public class Personne {
	private String nom;
	private int age;
	private Genre genre;
	private Civilite civ;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Civilite getCiv() {
		return civ;
	}
	public void setCiv(Civilite civ) {
		this.civ = civ;
	}
	public Personne() {
		super();
	}
	public String perField() throws Exception {		
		if ((civ == Civilite.Monsieur) && (genre == Genre.F)
				|| (civ == Civilite.Madame) && (genre == Genre.M)
				|| (civ == Civilite.Madesoiselle) && (genre == Genre.M)
				|| (civ == Civilite.Signeur) && (genre == Genre.F)){
			
			throw new Exception("Cette combinaison n'est pas valide");			
		}
		return toString();
	}
	@Override
	public String toString() {
		return " Personne:\n| Genre\t=\t" + genre + "\n| Civilité\t=\t" + civ + "\nsont enregistrés ! ";
	}
	
}
