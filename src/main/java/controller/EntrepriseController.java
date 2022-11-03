package controller;

import factory.EmployeFactory;
import model.*;


public class EntrepriseController {
    public Entreprise entreprise = new Entreprise();
    public EmployeFactory employeFactory = new EmployeFactory();

    public void ajouterEmploye(String nom, String prenom, String profession){
        Personne employe = employeFactory.getPersonne(nom, prenom, profession);
        try {
            entreprise.addEmploye(employe);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
