package model;

import java.util.Objects;

public abstract class Personne implements IPersonne {

    public String nom;
    public String prenom;
    public String profession;

    public Personne() {

    }

    @Override
    public String toString() {
        return "PROFESSION: " + profession +
                " / NOM: " + nom +
                " / PRENOM: " + prenom  +
                " / TRAVAIL: " + travail() +
                " / LOISIR: " + loisir();

    }


    public Personne(String nom, String prenom, String profession) {
        this.nom = nom;
        this.prenom = prenom;
        this.profession = profession;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personne personne = (Personne) o;

        if (!nom.equals(personne.nom)) return false;
        if (!prenom.equals(personne.prenom)) return false;
        return profession.equals(personne.profession);
    }

    @Override
    public int hashCode() {
        int result = nom.hashCode();
        result = 31 * result + prenom.hashCode();
        result = 31 * result + profession.hashCode();
        return result;
    }
}