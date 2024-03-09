import java.util.Scanner;
public class Exercice3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Saisie d'un entier
            System.out.print("Entrez un entier positif : ");
            int n = scanner.nextInt();

            // Vérification si le nombre est parfait
            int sommeDiviseurs = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sommeDiviseurs += i;
                }
            }
            if (sommeDiviseurs == n) {
                System.out.println(n + " est un nombre parfait.");
            } else {
                System.out.println(n + " n'est pas un nombre parfait.");
            }

            scanner.close();
        }
    }



