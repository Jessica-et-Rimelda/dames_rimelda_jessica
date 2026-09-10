package cstjean.mobile.dames;

import java.util.LinkedList;

/**
 * Représente un damier du jeu de dames.
 * Le damier possède 50 positions pouvant contenir des pions.
 *
 * @author Jessica Karelle Fanguem Tchikapa
 * @author Patricelie Rimelda Njoh Ngueng
 * @author Aminata Diao
 */
public class Damier {

    /**
     * Liste contenant les positions des pions sur le damier.
     */
    private final LinkedList<Pion> listePions;

    /**
     * Crée un damier contenant 50 positions vides.
     */
    public Damier() {
        listePions = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            listePions.add(null);
        }
    }

    /**
     * Ajoute un pion à une position donnée du damier.
     *
     * @param position la position où placer le pion
     * @param pion le pion à ajouter
     */
    public void ajouterPion(int position, Pion pion) {
        listePions.set(position - 1, pion);
    }

    /**
     * Retourne le pion situé à une position donnée du damier.
     *
     * @param position la position du pion à récupérer
     * @return le pion situé à la position demandée
     */
    public Pion getPion(int position) {
        return listePions.get(position - 1);
    }

    /**
     * Retourne le nombre de pions présents sur le damier.
     *
     * @return le nombre de pions présents
     */
    public int getNombrePions() {
        int nombrePions = 0;

        for (Pion pion : listePions) {
            if (pion != null) {
                nombrePions++;
            }
        }

        return nombrePions;
    }
}