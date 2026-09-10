package cstjean.mobile.dames.affichage;

import cstjean.mobile.dames.Damier;
import cstjean.mobile.dames.Pion;

/**
 * Permet de créer l'affichage textuel d'un damier.
 *
 * @author Jessica Karelle Fanguem Tchikapa
 * @author Patricelie Rimelda Njoh Ngueng
 * @author Aminata Diao
 */
public class AffichageDamier {

    /**
     * Bordure utilisée dans l'affichage du damier.
     */
    private static final String BORDURE = "------------------------------";

    /**
     * Saut de ligne utilisé dans l'affichage.
     */
    private static final String SAUT_LIGNE = System.lineSeparator();

    /**
     * Retourne une représentation textuelle des pions présents sur le damier.
     *
     * @param damier le damier à afficher
     * @return la représentation textuelle du damier
     */
    public static String afficherDamier(Damier damier) {

        StringBuilder affichage = new StringBuilder();

        affichage.append(BORDURE);
        affichage.append(SAUT_LIGNE);
        affichage.append("État du damier");
        affichage.append(SAUT_LIGNE);
        affichage.append(BORDURE);
        affichage.append(SAUT_LIGNE);
        affichage.append(SAUT_LIGNE);

        for (int position = 1; position <= 50; position++) {
            Pion pion = damier.getPion(position);

            if (pion != null) {
                affichage.append("Position ");
                affichage.append(position);
                affichage.append(" : ");
                affichage.append(pion.getCouleur());
                affichage.append(SAUT_LIGNE);
            }
        }

        affichage.append(SAUT_LIGNE);
        affichage.append("Total : ");
        affichage.append(damier.getNombrePions());
        affichage.append(SAUT_LIGNE);
        affichage.append(BORDURE);

        return affichage.toString();
    }
}