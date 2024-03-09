import java.util.Scanner;
public class Exercice2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez l'heure (0-23) : ");
            int heure = scanner.nextInt();
            System.out.print("Entrez les minutes (0-59) : ");
            int minutes = scanner.nextInt();
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                heure = (heure + 1) % 24;
            }
            System.out.println("Heure suivante : " + heure + " heure(s) " + minutes + " minute(s)");

            scanner.close();
        }
    }


