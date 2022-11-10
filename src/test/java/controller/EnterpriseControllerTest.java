package controller;

import Exceptions.EntrepriseException;
import model.Personne;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

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

        Iterator<Personne> it = entCont.entreprise.listeEmploye.get("Secretaire").iterator();
        Personne sec1 = it.next();
        assertEquals(sec1.getPrenom(), "Bobile");
        assertEquals(sec1.getNom(), "Lebic");
        assertEquals(sec1.getProfession(), "Secretaire");
        Personne sec2 = it.next();
        assertEquals(sec2.getNom(), "Lebrun");
        assertEquals(sec2.getPrenom(), "Jule");
        assertEquals(sec2.getProfession(), "Secretaire");
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