import cstjean.mobile.dames.Damier;
import cstjean.mobile.dames.Pion;
import cstjean.mobile.dames.affichage.AffichageDamier;

/**
 * Point d'entrée permettant de tester la création d'un damier
 * et l'ajout de quelques pions.
 *
 * @author Jessica Karelle Fanguem Tchikapa
 * @author Patricelie Rimelda Njoh Ngueng
 * @author Aminata Diao
 */
void main() {

    Damier damier = new Damier();

    Pion pion1 = new Pion("noir");
    Pion pion2 = new Pion();
    Pion pion3 = new Pion("noir");

    damier.ajouterPion(2, pion1);
    damier.ajouterPion(23, pion2);
    damier.ajouterPion(32, pion3);

    System.out.println(AffichageDamier.afficherDamier(damier));
}