import java.util.Scanner;

    public class EjercicioFizz {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese un número entre 1 y 100: "); //Manda por pantalla que el usuario ingrese un numero entre el 1 y el 100

        int numero = scanner.nextInt();


        if (numero % 3 == 0 && numero % 5 == 0) {

            System.out.println("FizzBuzz");

        } 
        else if (numero % 3 == 0) { //Si el numero es divisible entre 3 sacara por pantalla Fizz

            System.out.println("Fizz");

        } else if (numero % 5 == 0) { // Si el numero es divisible entre 5 sacara port pantalla Buzz

            System.out.println("Buzz");

        } else {

            System.out.println(numero);

        }
        scanner.close();
}
}
