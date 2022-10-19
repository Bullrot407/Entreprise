package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Entreprise {

    private static final int NB_DIRECTEUR = 1;
    private static final int NB_SECRETAIRE = 2;
    private static final int NB_COMPTABLE = 1;
    private static final int NB_MACONQUALIFIE = 2;
    private static final int NB_MACON = 3;
    private static final int NB_MANOEUVRE = 4;
    private static final int NB_CONTREMAITRE = 1;

    public HashMap <String, HashSet <Personne>> listeEmploye;
    public Entreprise() {
        this.listeEmploye = InitialisationEntreprise();
    }

    private HashMap<String, HashSet<Personne>> InitialisationEntreprise() {
        listeEmploye = new HashMap<String, HashSet<Personne>>();
        listeEmploye.put("Directeur", new HashSet<Personne>(NB_DIRECTEUR));
        listeEmploye.put("Secretaire", new HashSet<Personne>(NB_SECRETAIRE));
        listeEmploye.put("Comptable", new HashSet<Personne>(NB_COMPTABLE));
        listeEmploye.put("Maçon Qualifié", new HashSet<Personne>(NB_MACONQUALIFIE));
        listeEmploye.put("Maçon", new HashSet<Personne>(NB_MACON));
        listeEmploye.put("Manoeuvre", new HashSet<Personne>(NB_MANOEUVRE));
        listeEmploye.put("Contremaitre", new HashSet<Personne>(NB_CONTREMAITRE));

        return null;
    }

    public String listEmployeParProfession(String profession){
        return listeEmploye.get(profession).toString();
    }

    public void addEmploye(Personne personne){
        switch (personne.profession){
            case "Directeur": listeEmploye.get("Directeur").add(personne);
            case "Secretaire": listeEmploye.get("Secretaire").add(personne);
            case "Comptable": listeEmploye.get("Comptable").add(personne);
            case "Maçon Qualifié": listeEmploye.get("Maçon Qualifié").add(personne);
            case "Macon": listeEmploye.get("Macon").add(personne);
            case "Manoeuvre": listeEmploye.get("Manoeuvre").add(personne);
            case "Contremaitre": listeEmploye.get("Contremaitre").add(personne);
        }
    }

--
}
