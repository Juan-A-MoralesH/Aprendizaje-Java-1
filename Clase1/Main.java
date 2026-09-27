import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una nota: ");
        int nota = teclado.nextInt();
        
        if(nota < 1 || nota > 7) {
            System.out.println("Nota inválida, pusiste " + nota);
        } else if(nota < 4) {
            System.out.println("Reprobado");
        } else {
            System.out.println("Aprobado");
        }
    }
}