package controller;

import Exceptions.EntrepriseException;
import factory.EmployeFactory;
import model.*;

import java.sql.SQLException;


public class EntrepriseController {
    public Entreprise entreprise = new Entreprise();
    public EmployeFactory employeFactory = new EmployeFactory();

    public void ajouterEmploye(String nom, String prenom, String profession) throws EntrepriseException {
        Personne personne = employeFactory.getPersonne(nom, prenom, profession);
        try {
            entreprise.ajouterEmploye(personne);
        } catch (EntrepriseException ex) {
            throw ex;
        }


    }
}
