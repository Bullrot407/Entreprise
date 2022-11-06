package factory;

import Exceptions.EntrepriseException;
import model.*;

public class EmployeFactory {

    public Personne getPersonne(String nom, String prenom, String profession) throws EntrepriseException {
        if (profession == null) {
            throw new EntrepriseException("La profession ne peut pas etre NULL");
        } else if (profession.equalsIgnoreCase("Directeur")) {
            return new Directeur(nom,prenom);
        } else if (profession.equalsIgnoreCase("comptable")) {
            return new Comptable(nom, prenom);
        } else if (profession.equalsIgnoreCase("contremaitre")) {
            return new Contremaitre(nom, prenom);
        } else if (profession.equalsIgnoreCase("maçon")) {
            return new Macon(nom, prenom);
        } else if (profession.equalsIgnoreCase("maçonqualifié")) {
            return new MaconQualifie(nom, prenom);
        } else if (profession.equalsIgnoreCase("manoeuvre")) {
            return new Manoeuvre(nom, prenom);
        } else if (profession.equalsIgnoreCase("secretaire")) {
            return new Secretaire(nom, prenom);
        } else {
            throw new EntrepriseException("La profession \"" + profession + "\" demandée n'existe pas!!!");
        }
    }

    public Personne getPersonne(String nom, String prenom, String profession, Float portefeuille) {
        if (profession == null) {
            return null;
        } else if (profession.equalsIgnoreCase("Directeur")) {
            return new Directeur(nom, prenom, portefeuille);
        }
        return null;
    }
}
