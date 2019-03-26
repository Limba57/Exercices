package Thread.BanqueDeux;

public class Client {

    private String nom;
    private String adresse;
    private String sexe;
    private Compte compte;

    public Client(String nom, String adresse, String sexe, Compte compte) {

        this.nom = nom;
        this.adresse = adresse;
        this.sexe = sexe;
        this.compte = compte;

    }

    public Compte getCompte() {
        return compte;
    }

}
