package cstjean.mobile.dames;

import cstjean.mobile.dames.affichage.TestAffichageDamier;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Regroupe tous les tests unitaires du projet.
 *
 * @author Jessica Karelle Fanguem Tchikapa
 * @author Patricelie Rimelda Njoh Ngueng
 * @author Aminata Diao
 */
public class TestComplet {

    /**
     * Crée la suite complète des tests du projet.
     *
     * @return la suite contenant tous les tests
     */
    public static Test suite() {
        TestSuite suite = new TestSuite();

        suite.addTestSuite(TestPion.class);
        suite.addTestSuite(TestDamier.class);
        suite.addTestSuite(TestAffichageDamier.class);

        return suite;
    }
}