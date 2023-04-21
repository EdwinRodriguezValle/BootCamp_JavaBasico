package ejercicios_7_8_9;

import jdk.dynalink.NamedOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class EjercicoArrays {
    public static void main(String[] args) {

        //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

       int numeros = 10;
       int array[] = new int[numeros];
        for (int i = 0; i < numeros; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }

        //Recorrer el array con bucle for
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Estos son los datos del array: " + array[i]);
        }

        System.out.println();
        String [] nombres = {"Edwin", "Carlos", "Carlota", "Gregorio", "Xams"};

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Estos son los valores: " + nombres[i]);
      }
        //bucle forEAch
        System.out.println();
        for(String matriz : nombres){
            System.out.println("Esto en con el bucle forEach: " + matriz);
        }

        //bucle while
        String[] nombres1 = {"Idania", "Rosa", "Carlota", "Sista", "Celeste"};

        int contador = 0;
        while(contador < nombres.length){
            System.out.println("Esto en con el bucle while: " + nombres1[contador]);
            contador ++;
        }

        // 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

        System.out.println("\n ARRAY BIDIMENCIONAL\n ");

        String[][] nombresBidimencional = new String[2][5];
        nombresBidimencional[0][0] = "Edwin";
        nombresBidimencional[0][1] = "Irma";
        nombresBidimencional[0][2] = "Elizabeth";
        nombresBidimencional[0][3] = "Jesus";
        nombresBidimencional[0][4] = "Rufino";

        nombresBidimencional[1][0] = "Rodriguez";
        nombresBidimencional[1][1] = "Gonzales";
        nombresBidimencional[1][2] = "Lopez";
        nombresBidimencional[1][3] = "Gimenez";
        nombresBidimencional[1][4] = "Alarcon";

        for (int i = 0; i < nombresBidimencional.length; i++) {
            for (int j = 0; j < nombresBidimencional[i].length; j++) {

                System.out.println(nombresBidimencional[i] [j]);

            }
        }

    }
}

