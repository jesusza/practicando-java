import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Calcular la media de los dos números
        double media = calcularMedia(numero1, numero2);

        // Mostrar la media por pantalla
        System.out.println("La media de " + numero1 + " y " + numero2 + " es: " + media);

        // Cerrar el objeto Scanner para evitar posibles fugas de recursos
        scanner.close();
    }

    // Método para calcular la media de dos números enteros
    public static double calcularMedia(int num1, int num2) {
        return (double) (num1 + num2) / 2;
    }
}

