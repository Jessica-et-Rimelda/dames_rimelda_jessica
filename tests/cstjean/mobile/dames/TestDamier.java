package cstjean.mobile.dames;

import junit.framework.TestCase;

/**
 * Contient les tests de la classe Damier.
 *
 * @author Jessica Karelle Fanguem Tchikapa
 * @author Patricelie Rimelda Njoh Ngueng
 * @author Aminata Diao
 */
public class TestDamier extends TestCase {

    /**
     * Damier utilisé pour les tests.
     */
    private Damier damier;

    /**
     * Premier pion utilisé pour les tests.
     */
    private Pion pion1;

    /**
     * Deuxième pion utilisé pour les tests.
     */
    private Pion pion2;

    /**
     * Prépare un nouveau damier et les pions avant chaque test.
     */
    public void setUp() {
        damier = new Damier();
        pion1 = new Pion("noir");
        pion2 = new Pion();
    }

    /**
     * Vérifie qu'aucun pion n'est présent sur le damier
     * lors de sa création.
     */
    public void testCreer() {
        assertEquals(0, damier.getNombrePions());
    }

    /**
     * Vérifie l'ajout de pions sur le damier ainsi que
     * le nombre de pions présents après chaque ajout.
     */
    public void testAjouterPion() {
        damier.ajouterPion(38, pion1);

        assertEquals(1, damier.getNombrePions());

        damier.ajouterPion(20, pion2);

        assertEquals(2, damier.getNombrePions());
    }

    /**
     * Vérifie que les pions ajoutés sont récupérés
     * aux bonnes positions et possèdent la bonne couleur.
     */
    public void testGetPion() {
        damier.ajouterPion(38, pion1);

        assertEquals(1, damier.getNombrePions());
        assertEquals(pion1, damier.getPion(38));
        assertEquals("noir", damier.getPion(38).getCouleur());

        damier.ajouterPion(20, pion2);

        assertEquals(2, damier.getNombrePions());
        assertEquals(pion2, damier.getPion(20));
        assertEquals("blanc", damier.getPion(20).getCouleur());
    }
}