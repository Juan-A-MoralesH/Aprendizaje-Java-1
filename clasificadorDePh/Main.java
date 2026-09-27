package Clase2;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingresa el pH de la muestra: ");
        double pH = scanner.nextDouble();
        scanner.useLocale(Locale.US);

        if (pH < 0 || pH > 14) {
            System.out.println("Valor de pH no válido");
        } else if (pH < 7 && pH >= 3) {
            System.out.println("La Muestra es menos acida");
        } else if (pH < 3) {
            System.out.println("La Muestra es muy acida");
        } else if (pH > 7 && pH < 11) {
            System.out.println("La Muestra es basica");
        } else if (pH >= 11 && pH <= 14) {
            System.out.println("La Muestra es muy basica");
        } 
        else {
            System.out.println("La Muestra es neutra");
        }
        scanner.close();

    }
}
