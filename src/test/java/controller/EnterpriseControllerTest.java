package controller;

import Exceptions.EntrepriseException;
import model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class EnterpriseControllerTest {
    EntrepriseController entCont;

    @BeforeEach
            void entrepriseControler(){

        entCont = new EntrepriseController();
    }

    @BeforeAll
    static void testFactory(){

    }
/*    @Test
    void ajouterDirecteur() {
        //verifie si tableau existe
        assertNotNull(entCont.TabPersonnels);


        entCont.ajouterDirecteur("Boss", "Jean",1520);
        //vérifie si c'est bien un directeur qui est ajouté en 0
        assertEquals( Directeur.class, entCont.TabPersonnels[0].getClass() );

        assertEquals(entCont.TabPersonnels[0].profession,"model.Directeur.Directeur");
        assertEquals(entCont.TabPersonnels[0].nom,"Boss");
        assertEquals(entCont.TabPersonnels[0].prenom,"Jean");
        Assertions.assertEquals(((Directeur)entCont.TabPersonnels[0]).porteFeuille, 1520);
        //verifie si la valeur existe dans tableau
        assertNotNull(entCont.TabPersonnels[0]);
        assertTrue(entCont.TabPersonnels.length > 0);
        assertEquals(7, entCont.TabPersonnels.length);

    }*/



    @Test
    void testDirecteur() throws EntrepriseException {
        entCont.ajouterEmploye("LeMacon", "Bob", "Directeur");
        assertEquals(entCont.entreprise.listeEmploye.get("Directeur").iterator().next().getPrenom(), "Bob" );
        assertEquals(entCont.entreprise.listeEmploye.get("Directeur").iterator().next().getNom(), "LeMacon" );
        assertEquals(entCont.entreprise.listeEmploye.get("Directeur").iterator().next().getProfession(), "Directeur" );
    }
    @Test
    void testSecretaire() throws EntrepriseException {
        entCont.ajouterEmploye("Lebic", "Bobile", "Secretaire");
        entCont.ajouterEmploye("Lebrun", "Jule", "Secretaire");
        //entCont.ajouterEmploye("Ruelle", "Max", "Secretaire");

        Iterator<Personne> it = entCont.entreprise.listeEmploye.get("Secretaire").iterator();
        Personne sec1 = it.next();
        assertEquals(sec1.getPrenom(), "Bobile" );
        assertEquals(sec1.getNom(), "Lebic" );
        assertEquals(sec1.getProfession(), "Secretaire" );
        Personne sec2 = it.next();
        assertEquals(sec2.getNom(), "Lebrun" );
        assertEquals(sec2.getPrenom(),"Jule");
        assertEquals(sec2.getProfession(), "Secretaire" );
        /*Personne sec3 = it.next();
        assertEquals(sec3.nom, "Ruelle" );
        assertEquals(sec3.prenom,"Max");
        assertEquals(sec3.profession, "Secretaire" );*/
    }
    @Test
    void testComptable()  throws EntrepriseException{
        entCont.ajouterEmploye("Lebic", "Bobile", "Comptable");
        entCont.ajouterEmploye("Lebrun", "Jule", "Comptable");
        //entCont.ajouterEmploye("Ruelle", "Max", "Secretaire");

        Iterator<Personne> it = entCont.entreprise.listeEmploye.get("Comptable").iterator();
        Personne sec1 = it.next();
        assertEquals(sec1.getPrenom(), "Bobile" );
        assertEquals(sec1.getNom(), "Lebic" );
        assertEquals(sec1.getProfession(), "Comptable" );
        Personne sec2 = it.next();
        assertEquals(sec2.getNom(), "Lebrun" );
        assertEquals(sec2.getPrenom(),"Jule");
        assertEquals(sec2.getProfession(), "Comptable" );
        /*Personne sec3 = it.next();
        assertEquals(sec3.nom, "Ruelle" );
        assertEquals(sec3.prenom,"Max");
        assertEquals(sec3.profession, "Secretaire" );*/
    }
    @Test
    void testSecretaire2() throws EntrepriseException{
        entCont.ajouterEmploye("Lebic", "Bobile", "Secretaire");
        entCont.ajouterEmploye("Lebrun", "Jule", "Secretaire");
        //entCont.ajouterEmploye("Ruelle", "Max", "Secretaire");

        Iterator<Personne> it = entCont.entreprise.listeEmploye.get("Secretaire").iterator();
        Personne sec1 = it.next();
        assertEquals(sec1.getPrenom(), "Bobile" );
        assertEquals(sec1.getNom(), "Lebic" );
        assertEquals(sec1.getProfession(), "Secretaire" );
        Personne sec2 = it.next();
        assertEquals(sec2.getNom(), "Lebrun" );
        assertEquals(sec2.getPrenom(),"Jule");
        assertEquals(sec2.getProfession(), "Secretaire" );
        /*Personne sec3 = it.next();
        assertEquals(sec3.nom, "Ruelle" );
        assertEquals(sec3.prenom,"Max");
        assertEquals(sec3.profession, "Secretaire" );*/
    }
    @Test
    void testSecretaire3() throws EntrepriseException{
        entCont.ajouterEmploye("Lebic", "Bobile", "Secretaire");
        entCont.ajouterEmploye("Lebrun", "Jule", "Secretaire");
        //entCont.ajouterEmploye("Ruelle", "Max", "Secretaire");

        Iterator<Personne> it = entCont.entreprise.listeEmploye.get("Secretaire").iterator();
        Personne sec1 = it.next();
        assertEquals(sec1.getPrenom(), "Bobile" );
        assertEquals(sec1.getNom(), "Lebic" );
        assertEquals(sec1.getProfession(), "Secretaire" );
        Personne sec2 = it.next();
        assertEquals(sec2.getNom(), "Lebrun" );
        assertEquals(sec2.getPrenom(),"Jule");
        assertEquals(sec2.getProfession(), "Secretaire" );
        /*Personne sec3 = it.next();
        assertEquals(sec3.nom, "Ruelle" );
        assertEquals(sec3.prenom,"Max");
        assertEquals(sec3.profession, "Secretaire" );*/
    }
    @Test
    void testSecretaire4() throws EntrepriseException{
        entCont.ajouterEmploye("Lebic", "Bobile", "Secretaire");
        entCont.ajouterEmploye("Lebrun", "Jule", "Secretaire");
        //entCont.ajouterEmploye("Ruelle", "Max", "Secretaire");

        Iterator<Personne> it = entCont.entreprise.listeEmploye.get("Secretaire").iterator();
        Personne sec1 = it.next();
        assertEquals(sec1.getPrenom(), "Bobile" );
        assertEquals(sec1.getNom(), "Lebic" );
        assertEquals(sec1.getProfession(), "Secretaire" );
        Personne sec2 = it.next();
        assertEquals(sec2.getNom(), "Lebrun" );
        assertEquals(sec2.getPrenom(),"Jule");
        assertEquals(sec2.getProfession(), "Secretaire" );
        /*Personne sec3 = it.next();
        assertEquals(sec3.nom, "Ruelle" );
        assertEquals(sec3.prenom,"Max");
        assertEquals(sec3.profession, "Secretaire" );*/
    }

    @Test
    void testTooManyEmployee() throws EntrepriseException{
        entCont.ajouterEmploye("Lebic", "Bobile", "Secretaire");
        entCont.ajouterEmploye("Lebrun", "Jule", "Secretaire");
        EntrepriseException ex = assertThrows(EntrepriseException.class,() -> {entCont.ajouterEmploye("Ruelle", "Max", "Secretaire");});
        assertEquals("Plus de place dans la profession: Secretaire", ex.getMessage());
    }

    @Test
    void testProfessionInconnue() throws EntrepriseException{
        EntrepriseException ex = assertThrows(EntrepriseException.class,() -> {entCont.ajouterEmploye("Ruelle", "Max", "Brol");});
        assertEquals("La profession \"Brol\" demandée n'existe pas!!!", ex.getMessage());
    }
/*
    void ajouterSecretaire(){
        entCont.ajouterEmploye("LeMacon", "Bob", "Macon");
    }
    void ajouterMacon(){
        entCont.ajouterEmploye("LeMacon", "Bob", "Macon");
    }
    void ajouterMacon(){
        entCont.ajouterEmploye("LeMacon", "Bob", "Macon");
    }
    void ajouterMacon(){
        entCont.ajouterEmploye("LeMacon", "Bob", "Macon");
    }
    void ajouterMacon(){
        entCont.ajouterEmploye("LeMacon", "Bob", "Macon");
    }



    int i;
    @Test

    void ajouterPersonne() {
        assertNotNull(entCont.TabPersonnels);

        entCont.ajouterPersonne("Pol", "Mirabelle","model.Contremaitre.Contremaitre");
        assertEquals( Contremaitre.class, entCont.TabPersonnels[1].getClass() );
        entCont.ajouterPersonne("Finance", "Michel","Comptable.Comptable");
        assertEquals( Comptable.class, entCont.TabPersonnels[2].getClass() );
        entCont.ajouterPersonne("Mur", "Jean", "model.Macon.Macon");
        assertEquals( Macon.class, entCont.TabPersonnels[3].getClass() );
        entCont.ajouterPersonne("Beaumur", "Albert", "model.MaconQualifie.MaconQualifie");
        assertEquals( MaconQualifie.class, entCont.TabPersonnels[4].getClass() );
        entCont.ajouterPersonne("Conduit", "Kevin","model.Manoeuvre.Manoeuvre");
        assertEquals( Manoeuvre.class, entCont.TabPersonnels[5].getClass() );
        entCont.ajouterPersonne("Ecrit", "Arnaud", "model.Secretaire.Secretaire");
        assertEquals( Secretaire.class, entCont.TabPersonnels[6].getClass() );

        assertEquals(entCont.TabPersonnels[1].profession,"model.Contremaitre.Contremaitre");
        assertEquals(entCont.TabPersonnels[1].nom,"Pol");
        assertEquals(entCont.TabPersonnels[1].prenom,"Mirabelle");

        assertEquals(entCont.TabPersonnels[2].profession,"Comptable.Comptable");
        assertEquals(entCont.TabPersonnels[2].nom,"Finance");
        assertEquals(entCont.TabPersonnels[2].prenom,"Michel");

        assertEquals(entCont.TabPersonnels[3].profession,"model.Macon.Macon");
        assertEquals(entCont.TabPersonnels[3].nom,"Mur");
        assertEquals(entCont.TabPersonnels[3].prenom,"Jean");

        assertEquals(entCont.TabPersonnels[4].profession,"model.MaconQualifie.MaconQualifie");
        assertEquals(entCont.TabPersonnels[4].nom,"Beaumur");
        assertEquals(entCont.TabPersonnels[4].prenom,"Albert");

        assertEquals(entCont.TabPersonnels[5].profession,"model.Manoeuvre.Manoeuvre");
        assertEquals(entCont.TabPersonnels[5].nom,"Conduit");
        assertEquals(entCont.TabPersonnels[5].prenom,"Kevin");

        assertEquals(entCont.TabPersonnels[6].profession,"model.Secretaire.Secretaire");
        assertEquals(entCont.TabPersonnels[6].nom,"Ecrit");
        assertEquals(entCont.TabPersonnels[6].prenom,"Arnaud");

        for(i=1;i<6;i++) {
            assertNotNull(entCont.TabPersonnels[i]);
        }
        assertTrue(entCont.TabPersonnels.length > 0);
        assertEquals(7, entCont.TabPersonnels.length);
        }*/
}