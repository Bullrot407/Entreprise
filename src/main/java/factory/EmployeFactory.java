package factory;

import model.*;
import model.Personne;

public class EmployeFactory {

    public Personne getDirecteur(String profession, String nom, String prenom, Float portefeuille) {
        if (profession == null) {
            return null;
        }
        if (profession.equalsIgnoreCase("directeur")) {
            return new Directeur(nom, prenom, portefeuille);
        }
        return null;
    }

    public Personne getPersonne(String nom, String prenom,String profession) {
        if (profession == null) {
            return null;
        } else if (profession.equalsIgnoreCase("comptable")) {
            return new Comptable(nom, prenom);
        } else if (profession.equalsIgnoreCase("contremaitre")) {
            return new Contremaitre(nom, prenom);
        } else if (profession.equalsIgnoreCase("maçon")) {
            return new Macon(nom, prenom);
        } else if (profession.equalsIgnoreCase("maçon qualifié")) {
            return new MaconQualifie(nom, prenom);
        } else if (profession.equalsIgnoreCase("manoeuvre")) {
            return new Manoeuvre(nom, prenom);
        } else if (profession.equalsIgnoreCase("secretaire")) {
            return new Secretaire(nom, prenom);
        }
        return null;
    }


}
