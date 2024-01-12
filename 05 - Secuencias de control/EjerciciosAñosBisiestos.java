public class EjerciciosAñosBisiestos{
    public static void main(String[] args) {
         // Ingresa el año que quieres verificar
         int año = 2024;

         if (esBisiesto(año)) {
             System.out.println(año + " es un año bisiesto.");// Saca por pantalla si es bisiesto
         } else {
             System.out.println(año + " no es un año bisiesto.");// Saca por pantalla si el año no es bisiesto
         }
     }
 
     // Función para verificar si un año es bisiesto
     public static boolean esBisiesto(int año) {
         if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
             return true;
         } else {
             return false;
         }
     }
 }
