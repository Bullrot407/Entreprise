package controller;

import factory.EmployeFactory;
import model.*;


public class EntrepriseController {
    public Entreprise entreprise = new Entreprise();
    public EmployeFactory employeFactory = new EmployeFactory();
    public void ajouterDirecteur(String nom, String prenom, float portefeuille){
      //  TabPersonnels[0]  = new Directeur(nom,prenom,portefeuille);

    }
    public void ajouterEmploye(String nom, String prenom, String profession){
        Personne employe = employeFactory.getPersonne(nom, prenom, profession);
        entreprise.addEmploye(employe);
    }

    public void listerPersonnel(Personne[] personnels){

       /* for(Personne personne : TabPersonnels)
        {
            System.out.println(personne.toString());
        }*/

    }
}
