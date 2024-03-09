import java.util.Scanner;
public class Exercice6 {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Entrez le poids en kg : ");
                    double poids = scanner.nextDouble();
                    System.out.print("Entrez la taille en mètres : ");
                    double taille = scanner.nextDouble();
                    double imc = poids / (taille * taille);
                    System.out.println("L'IMC est : " + imc);
                    String etatPoids = determinerEtatPoids(imc);
                    System.out.print("Entrez le sexe (F pour femme, H pour homme) : ");
                    char sexe = scanner.next().charAt(0);

                    if (sexe == 'F' || sexe == 'f') {
                        System.out.println("État de poids pour une femme : " + etatPoids);
                    } else if (sexe == 'H' || sexe == 'h') {
                        System.out.println("État de poids pour un homme : " + etatPoids);
                    } else {
                        System.out.println("Sexe non reconnu.");
                    }

                    scanner.close();
                }

                private static String determinerEtatPoids(double imc) {
                    if (imc < 19) {
                        return "Maigreur";
                    } else if (imc >= 19 && imc <= 24) {
                        return "Poids normal";
                    } else if (imc > 24 && imc <= 30) {
                        return "Surcharge pondérale";
                    } else if (imc > 30 && imc <= 40) {
                        return "Adiposité";
                    } else {
                        return "Obésité";
                    }
                }

}




