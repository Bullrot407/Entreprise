package controller;

import Exceptions.EntrepriseException;
import model.Personne;
import model.Secretaire;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;



class EnterpriseControllerTest {
    EntrepriseController entCont;

    @BeforeEach
    void entrepriseControler() {

        entCont = new EntrepriseController();
    }

    @BeforeAll
    static void testFactory() {

    }

    @Test
    void testTropDEmployee() throws EntrepriseException {
        entCont.ajouterEmploye("Lebic", "Bobile", "Secretaire");
        entCont.ajouterEmploye("Lebrun", "Jule", "Secretaire");
        EntrepriseException ex = assertThrows(EntrepriseException.class, () -> {
            entCont.ajouterEmploye("Ruelle", "Max", "Secretaire");
        });
        assertEquals("Plus de place dans la profession: Secretaire", ex.getMessage());
    }
    @Test
    void testSuppDEmployee() throws EntrepriseException {
        entCont.supprimerEmploye("Lebic", "Bobile", "Secretaire");

    }

    @Test
    void testProfessionInconnue() throws EntrepriseException {
        EntrepriseException ex = assertThrows(EntrepriseException.class, () -> {
            entCont.ajouterEmploye("Importe", "Jean", "Brol");
        });
        assertEquals("La profession \"Brol\" demandée n'existe pas!!!", ex.getMessage());
    }

    @Test
    void testDirecteur() throws EntrepriseException {
        entCont.ajouterEmploye("LeMacon", "Bob", "Directeur");
        assertEquals(entCont.entreprise.listeEmploye.get("Directeur").iterator().next().getPrenom(), "Bob");
        assertEquals(entCont.entreprise.listeEmploye.get("Directeur").iterator().next().getNom(), "LeMacon");
        assertEquals(entCont.entreprise.listeEmploye.get("Directeur").iterator().next().getProfession(), "Directeur");
    }

    @Test
    void testSecretaire() throws EntrepriseException {
        entCont.ajouterEmploye("Lebic", "Bobile", "Secretaire");
        entCont.ajouterEmploye("Lebrun", "Jule", "Secretaire");

//        Iterator<Personne> it = entCont.entreprise.listeEmploye.get("Secretaire").iterator();
//        Personne sec1 = it.next();
//        assertEquals(sec1.getPrenom(), "Bobile");
//        assertEquals(sec1.getNom(), "Lebic");
//        assertEquals(sec1.getProfession(), "Secretaire");
//        Personne sec2 = it.next();
//        assertEquals(sec2.getNom(), "Lebrun");
//        assertEquals(sec2.getPrenom(), "Jule");
//        assertEquals(sec2.getProfession(), "Secretaire");

        List<Secretaire> expectedSecretaireList = Arrays.asList(
            new Secretaire("Lebic", "Bobile"),
            new Secretaire("Lebrun", "Jule")
        );

        ArrayList<Personne> actualSecretaireList = entCont.entreprise.listeEmploye.get("Secretaire");
        assertEquals( expectedSecretaireList, actualSecretaireList );
    }

    @Test
    void testSecretaireHamcrest() throws EntrepriseException {
        entCont.ajouterEmploye("Lebic", "Bobile", "Secretaire");
        entCont.ajouterEmploye("Lebrun", "Jule", "Secretaire");

//        Iterator<Personne> it = entCont.entreprise.listeEmploye.get("Secretaire").iterator();
//        Personne sec1 = it.next();
//        assertEquals(sec1.getPrenom(), "Bobile");
//        assertEquals(sec1.getNom(), "Lebic");
//        assertEquals(sec1.getProfession(), "Secretaire");
//        Personne sec2 = it.next();
//        assertEquals(sec2.getNom(), "Lebrun");
//        assertEquals(sec2.getPrenom(), "Jule");
//        assertEquals(sec2.getProfession(), "Secretaire");

        ArrayList<Personne> actualSecretaireList = entCont.entreprise.listeEmploye.get("Secretaire");

        assertThat( actualSecretaireList, contains(
                allOf(
                    hasProperty("prenom", equalTo("Bobile")),
                    hasProperty("nom", equalTo("Lebic")),
                    hasProperty("profession", equalTo("Secretaire"))
                ),
                allOf(
                        hasProperty("prenom", equalTo("Jule")),
                        hasProperty("nom", equalTo("Lebrun")),
                        hasProperty("profession", equalTo("Secretaire"))
                )
        ) );


    }

    @Test
    void testComptable() throws EntrepriseException {
        entCont.ajouterEmploye("Lebic", "Bobile", "Comptable");

        Iterator<Personne> it = entCont.entreprise.listeEmploye.get("Comptable").iterator();
        Personne comp1 = it.next();
        assertEquals(comp1.getPrenom(), "Bobile");
        assertEquals(comp1.getNom(), "Lebic");
        assertEquals(comp1.getProfession(), "Comptable");

    }


}