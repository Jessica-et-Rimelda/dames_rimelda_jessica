package cstjean.mobile.dames.affichage;

import cstjean.mobile.dames.Damier;
import cstjean.mobile.dames.Pion;
import junit.framework.TestCase;

/**
 * Contient les tests unitaires de la classe AffichageDamier.
 *
 * @author Jessica Karelle Fanguem Tchikapa
 * @author Patricelie Rimelda Njoh Ngueng
 */
public class TestAffichageDamier extends TestCase {

    /**
     * Damier utilisé pour le test d'affichage.
     */
    private Damier damier;

    /**
     * Prépare un damier contenant quelques pions avant chaque test.
     */
    public void setUp() {
        damier = new Damier();

        Pion pion1 = new Pion("noir");
        damier.ajouterPion(2, pion1);

        Pion pion2 = new Pion();
        damier.ajouterPion(23, pion2);

        Pion pion3 = new Pion("noir");
        damier.ajouterPion(32, pion3);
    }

    /**
     * Vérifie que l'affichage du damier correspond au résultat attendu.
     */
    public void testAffichage() {
        String sautLigne = System.lineSeparator();
        String bordure = "------------------------------";

        String affichage =
                bordure + sautLigne +
                        "État du damier" + sautLigne +
                        bordure + sautLigne +
                        sautLigne +
                        "Position 2 : noir" + sautLigne +
                        "Position 23 : blanc" + sautLigne +
                        "Position 32 : noir" + sautLigne +
                        sautLigne +
                        "Total : 3" + sautLigne +
                        bordure;

        assertEquals(affichage, AffichageDamier.afficherDamier(damier));
    }
}