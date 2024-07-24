package pkg2.pkg1.visite.de.la.mine;

import java.util.Scanner;
import java.util.Stack;

public class VisiteDeLaMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire le nombre total de déplacements
        System.out.println("Veuillez saisir le nombre total de déplacements (maximum 1000) : ");
        int nbDep = scanner.nextInt();

        // Vérifier que le nombre de déplacements est valide
        if (nbDep <= 0 || nbDep > 1000) {
            System.out.println("Le nombre de déplacements doit être entre 1 et 1000.");
            return;
        }

        // Utiliser une pile pour stocker les déplacements
        Stack<Integer> deplacements = new Stack<>();

        // Lire chaque déplacement
        System.out.println("Veuillez saisir les déplacements : ");
        for (int i = 0; i < nbDep; i++) {
            int dep = scanner.nextInt();
            deplacements.push(dep);
        }

        // Afficher la séquence inverse des déplacements
        System.out.println("Séquence inverse des déplacements : ");
        while (!deplacements.isEmpty()) {
            int dep = deplacements.pop();
            switch (dep) {
                case 1: // Aller à gauche -> revenir à droite
                    System.out.println(2);
                    break;
                case 2: // Aller à droite -> revenir à gauche
                    System.out.println(1);
                    break;
                case 3: // Aller tout droit -> revenir en arrière (tout droit)
                    System.out.println(3);
                    break;
                case 4: // Monter -> redescendre
                    System.out.println(5);
                    break;
                case 5: // Descendre -> remonter
                    System.out.println(4);
                    break;
                default:
                    System.out.println("Déplacement inconnu : " + dep);
            }
        }

        // Fermer le scanner
        scanner.close();
    }
}






/*
L'un des produits nécessaires pour la fabrication de l'onguent magique, un minerai très rare, ne se trouve qu'en un seul endroit sur la planète, au fond de la plus vieille mine existante, jadis exploitée par le peuple nain. Désormais seuls quelques uns d'entre eux sont encore sur place, afin de guider les voyageurs (commerçants et touristes) au sein de ce dédale de cavernes et galeries.

Après avoir engagé un guide, il vous mène jusqu'à l'endroit prévu mais un petit désaccord sur le paiement de ses services le pousse à vous laisser sur place, sans aucune chance de retrouver la sortie. Heureusement votre robot à conservé en mémoire la suite des déplacements qui vous ont amené de l'entrée jusqu'à votre position actuelle, il ne vous reste plus qu'à suivre le chemin inverse !

Ce que doit faire votre programme :
Il existe 5 types de déplacements, représentés par 5 entiers différents : aller à gauche (1), aller à droite (2), aller tout droit (3), monter (4) et descendre (5).

Le premier entier à lire est le nombre total de déplacements (1000 au maximum). Ensuite, chaque déplacement (représenté par un entier) est indiqué sur sa propre ligne.

Vous devez afficher la suite des déplacements à faire pour aller de votre position actuelle à la sortie.

EXAMPLE
input:

6
1
3
2
4
4
5
output:

4
5
5
1
3
2
 */