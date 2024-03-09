import java.util.Scanner;
public class Exercice4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez le premier entier : ");
            int n = scanner.nextInt();

            System.out.print("Entrez le deuxième entier : ");
            int m = scanner.nextInt();
            if (sontAmis(n, m)) {
                System.out.println(n + " et " + m + " sont des nombres amis.");
            } else {
                System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
            }

            scanner.close();
        }

        private static boolean sontAmis(int n, int m) {
            return (sommeDiviseurs(n) == m) && (sommeDiviseurs(m) == n);
        }

        private static int sommeDiviseurs(int nombre) {
            int somme = 0;
            for (int i = 1; i <= nombre / 2; i++) {
                if (nombre % i == 0) {
                    somme += i;
                }
            }
            return somme;
        }

}
