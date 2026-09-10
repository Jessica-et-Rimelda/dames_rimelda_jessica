package cstjean.mobile.dames;

import junit.framework.TestCase;

/**
 * Contient les tests unitaires de la classe Pion.
 *
 * @author Jessica Karelle Fanguem Tchikapa
 * @author Patricelie Rimelda Njoh Ngueng
 * @author Aminata Diao
 */
public class TestPion extends TestCase {

    /**
     * Vérifie la création des pions et leur couleur.
     * Vérifie également que le constructeur sans paramètre
     * crée un pion blanc par défaut.
     */
    public void testCreer() {
        Pion pionNoir = new Pion("noir");
        Pion pionBlanc = new Pion("blanc");
        Pion pionParDefaut = new Pion();

        assertEquals("noir", pionNoir.getCouleur());
        assertEquals("blanc", pionBlanc.getCouleur());
        assertEquals("blanc", pionParDefaut.getCouleur());
    }
}