package model;

public class Comptable extends Personne {


    public Comptable(String nom, String prenom) {
        super(nom, prenom, "Comptable");
    }


    @Override
    public String travail() {
        return "J'aime compter les sous! ";
    }

    @Override
    public String loisir() {
        return "j'aime jouer au monopoly !";
    }

}