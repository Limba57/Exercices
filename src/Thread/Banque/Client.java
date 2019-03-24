package Thread.Banque;

public class Client {

    String nom;
    Sexe sexe;
    String adresse;
    CompteBanquaire compte;

    //Constructeur avec un solde direct pour le compte
    public Client (String nom, Sexe sexe,String adresse,int solde){

        this.nom=nom;
        this.sexe = sexe;
        this.adresse = adresse;
        compte = new CompteBanquaire(solde);

    }

    public String toString(){
        return "\nNom : "+this.nom+"\nSexe : "+this.sexe+"\nAdresse : "+this.adresse+this.compte;
    }
}
