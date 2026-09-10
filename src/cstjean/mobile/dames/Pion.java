package cstjean.mobile.dames;

/**
 * Représente un pion du jeu de dames.
 * Un pion possède une couleur.
 *
 * @author Jessica Karelle Fanguem Tchikapa
 * @author Patricelie Rimelda Njoh Ngueng
 * @author Aminata Diao
 */
public class Pion {

    /**
     * Couleur du pion.
     */
    private final String couleur;

    /**
     * Crée un pion avec la couleur spécifiée.
     *
     * @param couleur la couleur du pion
     */
    public Pion(String couleur) {
        this.couleur = couleur;
    }

    /**
     * Crée un pion blanc par défaut.
     */
    public Pion() {
        this("blanc");
    }

    /**
     * Retourne la couleur du pion.
     *
     * @return la couleur du pion
     */
    public String getCouleur() {
        return couleur;
    }
}