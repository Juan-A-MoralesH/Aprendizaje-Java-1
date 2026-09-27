package clasificadorDePh;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Por favor ingresa el pH de la muestra: ");
            scanner.useLocale(Locale.US);
            double pH = scanner.nextDouble();

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
        
       // Pregunta al usuario si desea ingresar otra muestra
        System.out.println("¿Deseas ingresar otra muestra? (si/no): ");
        String respuesta = scanner.next();
        continuar = respuesta.equalsIgnoreCase("si");

        } scanner.close();
    }
}
