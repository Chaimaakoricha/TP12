import java.util.Scanner;
public class Exercice5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] buts = new int[22];
            for (int i = 0; i < buts.length; i++) {
                System.out.print("Entrer le nombre de buts pour le joueur " + (i + 1) + " : ");
                buts[i] = scanner.nextInt();
            }
            int maxButeur = 0;
            int maxButs = buts[0];
            for (int i = 1; i < buts.length; i++) {
                if (buts[i] > maxButs) {
                    maxButeur = i;
                    maxButs = buts[i];
                }
            }
            System.out.println("Le buteur de l'équipe est le joueur " + (maxButeur + 1) + " avec " + maxButs + " buts.");
            int totalButs = 0;
            for (int but : buts) {
                totalButs += but;
            }
            System.out.println("Le nombre total de buts inscrits par l'équipe est : " + totalButs);
            int joueursSansBut = 0;
            for (int but : buts) {
                if (but == 0) {
                    joueursSansBut++;
                }
            }
            System.out.println("Le nombre de joueurs qui n'ont pas marqué de but est : " + joueursSansBut);
            System.out.print("Le joueur n°9 vient d’inscrire 2 buts. ");
            buts[8] += 2;
            System.out.println("Tableau mis à jour :");
            for (int i = 0; i < buts.length; i++) {
                System.out.println("Joueur " + (i + 1) + " : " + buts[i] + " buts");
            }

            scanner.close();
        }
    }


