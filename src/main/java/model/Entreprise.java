package model;

import Exceptions.EntrepriseException;

import java.util.ArrayList;
import java.util.HashMap;

public class Entreprise {

    private static final int NB_DIRECTEUR = 1;
    private static final int NB_SECRETAIRE = 2;
    private static final int NB_COMPTABLE = 1;
    private static final int NB_MACONQUALIFIE = 2;
    private static final int NB_MACON = 3;
    private static final int NB_MANOEUVRE = 4;
    private static final int NB_CONTREMAITRE = 1;

    public HashMap<String, ArrayList<Personne>> listeEmploye;

    public Entreprise() {
        InitialisationEntreprise();
        getTailleProfession();
    }

    private void InitialisationEntreprise() {
        listeEmploye = new HashMap<String, ArrayList<Personne>>();
        listeEmploye.put("Directeur", new ArrayList<Personne>());
        listeEmploye.put("Secretaire", new ArrayList<Personne>());
        listeEmploye.put("Comptable", new ArrayList<Personne>());
        listeEmploye.put("Maçon Qualifié", new ArrayList<Personne>());
        listeEmploye.put("Maçon", new ArrayList<Personne>());
        listeEmploye.put("Manoeuvre", new ArrayList<Personne>());
        listeEmploye.put("Contremaitre", new ArrayList<Personne>());
    }

    public HashMap<String, Integer> tailleProfession;

    private void getTailleProfession() {
        tailleProfession = new HashMap<String, Integer>();
        tailleProfession.put("Directeur", NB_DIRECTEUR);
        tailleProfession.put("Secretaire", NB_SECRETAIRE);
        tailleProfession.put("Comptable", NB_COMPTABLE);
        tailleProfession.put("Maçon Qualifié", NB_MACONQUALIFIE);
        tailleProfession.put("Maçon", NB_MACON);
        tailleProfession.put("Manoeuvre", NB_MANOEUVRE);
        tailleProfession.put("Contremaitre", NB_CONTREMAITRE);
    }

    public void ajouterEmploye(Personne personne) throws EntrepriseException {
        if (peuxAjouterEmploye(personne.getProfession())) {
            listeEmploye.get(personne.getProfession()).add(personne);
        } else {
            throw new EntrepriseException(String.format("Une erreur inatendue est survenur avec la profession: %s", personne.getProfession()));
        }
    }
    public boolean peuxAjouterEmploye(String profession) throws EntrepriseException {
        if (controleProfessionExiste(profession));
        if (listeEmploye.get(profession).size() < tailleProfession.get(profession)) {
            return true;
        } else {
            throw new EntrepriseException(String.format("Plus de place dans la profession: %s", profession));
        }
    }
    public boolean controleProfessionExiste(String profession) throws EntrepriseException {
        if (listeEmploye.containsKey(profession)) {
            return true;
        } else throw new EntrepriseException(String.format("Mauvaise profession: %s", profession));
    }

    public void supprimerEmploye(String nom, String prenom, String profession) throws EntrepriseException {
        if (controleProfessionExiste(profession)) {
            listeEmploye.get(profession).remove(nom);
            listeEmploye.get(profession).remove(prenom);
        } else {
            throw new EntrepriseException(String.format("Impossible de supprimer la profession: %s", profession));
        }
    }



    public String listEmployeParProfession(String profession) {
        return listeEmploye.get(profession).toString();
    }


}
