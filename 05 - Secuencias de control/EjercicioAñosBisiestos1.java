public class EjercicioAñosBisiestos1 {
    public static void main(String[] args) {

        int año = 1974;


        if (año % 4 == 0) {

            if (año % 100 == 0) {

                if (año % 400 == 0) {

                    System.out.println(año + " es un año bisiesto.");

                } else {

                    System.out.println(año + " no es un año bisiesto.");

                }

            } else {

                System.out.println(año + " es un año bisiesto.");

            }

        } else {

            System.out.println(año + " no es un año bisiesto.");

        }

    }

}

