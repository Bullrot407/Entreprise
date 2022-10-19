package controller;

import factory.EmployeFactory;
import model.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnterpriseControllerTest {
    EntrepriseController entCont;
    @BeforeEach
            void entrepriseControler(){
        entCont = new EntrepriseController();
    }





    @BeforeAll
    void testFactory(){






    }

    @Test
    void ajouterDirecteur(){
        entCont.ajouterEmploye("LeMacon", "Bob", "Macon");
    }
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
/*
    @Test
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

    @Test
    void listerPersonnel() {
    }
}