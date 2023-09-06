import java.util.Scanner;

public class Calculatrice {

    public static double somme(double num1, double num2) {
        return num1 + num2;
    }

    public static double diff(double num1, double num2) {
        return num1 - num2;
    }

    public static double prod(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Entrez le premier nombre: ");
        double num1 = scan.nextInt();

        System.out.printf("Entrez le deuxième nombre: ");
        double num2 = scan.nextInt();

        System.out.println("Somme: " + Calculatrice.somme(num1, num2));
        System.out.println("Différence: " + Calculatrice.diff(num1, num2));
        System.out.println("Produit: " + Calculatrice.prod(num1, num2));
        System.out.println("Division: " + Calculatrice.div(num1, num2));
    }
}