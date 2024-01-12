import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una velocidad (en km/h): ");

     int velocidad = scanner.nextInt();
         if (velocidad > 120) {
            System.out.println("Multa por velocidad!");
            } 
            scanner.close();
        }
}
