import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

        //Tened en cuenta que los textos pueden venir de un array de tipo String.

        //1. Concatenar con un texto.

        String[] nombres = {"Edison", "Jose", "Irma", "Ronald"};

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("\n" + nombres[i] + " en parte del equipo profesional!!!");

        }

//        //Arreglo oficos con 4 elementos;
        String[] oficios = {"Carpintero", "Carnicero", "Campesino", "Herrero"};
        for (String oficio : oficios){
            System.out.println( "\n Soy un " + oficio);
        }

        String[] dias = {"Lunes",  "Martes", "Miercoles" ,"Jueves", "Viernes","Sabado", "Domingo"};

        for (int i = 0; i < dias.length; i++) {
            while (dias[i] == "Lunes" || dias[i] == "Martes" || dias[i] == "Miercoles" || dias[i] == "Jueves" || dias[i] == "Viernes"){
                System.out.println( dias[i] + " soy un dia laborable");
                break;

            }
            while (dias[i] == "Sabado" || dias[i] == "Domingo"){
                System.out.println(dias[i] + " soy un dia no laborable");
                break;

            }

        }





//
//        String [] mezcla = new String[nombres + oficios]
//
//
//
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println(nombres[i]);
//
//        }
//
//        for (int i = 0; i < oficios.length; i++) {
//            System.out.println(oficios[i]);
//        }
//
//
//        String[] nombreOficios = " ";
//        String j = "";
//
//        for (int i = 0; true; i++) {
//            nombreOficios[j] = nombreOficios[i];
//            j ++;
//            nombreOficios[j] = oficios[i];
//            j++;
//        }
//
//        System.out.println("\n el arreglo c es igual a : ");
//        for (int i = 0; i < nombreOficios.length; i++) {
//            System.out.println(nombreOficios[i] + " " );
//
//        }
//
////
//
//        Scanner input = new Scanner(System.in);
//        int a[], b[], c[];
//        a = new int[4];
//        b = new int[4];
//        c = new int[8];
//
//        System.out.println("digite el primer arreglo?");
//        for (int i = 0; i < 4; i++) {
//            System.out.println((i + 1) + " Digite un numero: ");
//            a[i] = input.nextInt();
//
//        }
//        System.out.println("\n Digite el segundo arreglo?");
//        for (int i = 0; i < 4; i++) {
//            System.out.println((i + 1) + " Digite un numero: ");
//            b[i] = input.nextInt();
//        }
//
//        //Vamos a mezclar dos arreglos en el arreglo c
//
//        //contador i para los arreglos a, b
//        int j = 0;
//        for (int i = 0; i < 4; i++) {
//            c[j] = a[i];
//            j++;
//            c[j] = b[i];
//            j++;
//
//        }
//
//
//
//        // Imprimir
//        System.out.println("\n el arreglo c es igual a : ");
//        for (int i = 0; i < 8; i++) {
//            System.out.println(c[i] + " " );
//
//        }
//
//
//
//
//



    }

}