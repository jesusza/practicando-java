class probandounderflow {
    public static void main(String[] args) { 

            /* Desbordamiento (Underflow) - Ocurre cuando sobrepasamos el limite minimo de nuestras primitivas */
            int i = Integer.MIN_VALUE;
            int j = i - 1;  // Cuando un entero se desborda, vuelve al valor mínimo y comienza a contar desde allí.
            System.out.println("Valor minimo entero: " + i + " Operación desbordada " + j); // La variable 'j' volverá a -2147483648
            
            double d = Double.MIN_VALUE;
            double o = d - 1; // Los números en coma flotante se desbordan devolviendo el valor minimo
            System.out.println("Valor minimo double: " + d + " Operación desbordada " + o);  // La variable 'o' será el valor minimo

           

        }
    }