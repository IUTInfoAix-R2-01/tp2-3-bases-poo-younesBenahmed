package td2New;

public class Personne {
	
	private String Nom;
	private String Prenom;
	
	public Personne(String nom, String prenom) {
        this.Nom = nom;
        this.Prenom = prenom;
    }
	
	public String getNom() {
		return Nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public String toString() {
        return "C2(" + Nom + ", " + Prenom + ")";
    }
}
