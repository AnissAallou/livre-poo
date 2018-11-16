package book;

public class Livre {
	public int id;
	public String titre;
	public String auteur;
	public int prix;
	public static int count;
	
	
	public int getId(int id) {
		return id;
	}
	
	public String getTitre(String titre) {
		return titre;
	}
	
	public String getAuteur(String auteur) {
		return auteur;
	}
	
	public int getPrix(int prix) {
		return prix;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public Livre(String titre, String auteur, int prix) {
		this.id = ++count;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	
	public String toString() {
		return "Le prix du livre " + this.titre + " de l'auteur " + this.auteur
				+ " est :" + this.prix + " €";
	}


}
