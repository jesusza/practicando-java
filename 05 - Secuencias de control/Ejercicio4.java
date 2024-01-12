import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese el primer número entero:");

        int num1 = scanner.nextInt();

        System.out.println("Por favor, ingrese el segundo número entero:");

        int num2 = scanner.nextInt();


        if (num1 > num2) {

            System.out.println("El mayor número es: " + num1);

        } else if (num1 < num2) {

            System.out.println("El mayor número es: " + num2);

        } else {

            System.out.println("Los dos números son iguales.");

        }


        scanner.close();

    }

}
    

