import java.util.Scanner;
public class Exercice1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un entier positif : ");
            int nombre = scanner.nextInt();
            int nombreDiviseurs = 0;
            int sommeDiviseurs = 0;
            System.out.print("Diviseurs : ");
            for (int i = 1; i <= nombre / 2; i++) {
                if (nombre % i == 0) {
                    System.out.print(i + " ");
                    nombreDiviseurs++;
                    sommeDiviseurs += i;
                }
            }
            System.out.println("\nNombre de diviseurs : " + nombreDiviseurs);
            System.out.println("Somme des diviseurs : " + sommeDiviseurs);

            scanner.close();
        }
    }


