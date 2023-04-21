package ejercicios_7_8_9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Reverse {



    public static void main(String[] args) {

        //Primer metodo para voltear un texto.
        System.out.println("Ingreso su nombre? \n");
        Scanner ingreso = new Scanner(System.in );

        String nombre = ingreso.nextLine();
        System.out.println("Hola " + nombre + "! Ingrese el primer texto que desea invertir? \n");

        String hola = ingreso.nextLine();
        String revertido = voltear(hola);
        System.out.println("\t Texto volteado: " + revertido + "\n");

        System.out.println("Ingrese el siguiente texto que desea revertir: ");
        String texto2 =ingreso.nextLine();
        String revertido2 = revertirTexto(texto2);
        System.out.println("\t Texto revertido " + revertido2 );


        System.out.println("\n Ingrese el siguiente texto que desea revertir: ");
        String terceraReversion = ingreso.nextLine();
        String revertidoFor = cadenaRevertidaFor(terceraReversion);
        System.out.println(revertidoFor + "\n");

        System.out.println("\n Gracias por usar el software de reversiones. Hasta pronto!!");


    }

    //Primer enfoque para invertir texto con StringBuilder.
    public static String voltear(String texto) {
        String resultado = " ";
        StringBuilder texto_volteado = new StringBuilder(texto);
        resultado = texto_volteado.reverse().toString();
        System.out.println("\t Texto original: " + texto);
        return resultado;
    }

    public static String revertirTexto(String texto) {
        System.out.println("\t Texto inicial: " + texto);

        char[] caracter = texto.toCharArray();
        int empieza = 0;
        int termina = caracter.length - 1;

        char temporal;
        while (termina > empieza) {
            temporal = caracter[empieza];
            caracter[empieza] = caracter[termina];
            caracter[termina] = temporal;
            termina--;
            empieza++;
        }
        texto = new String(caracter);
//        System.out.println("\t texto transformado: " + texto);

        caracter.toString();
        return texto;

    }

    public static String cadenaRevertidaFor(String texto){
        String cadenaInvertida = "";
        for (int i = texto.length() -1; i >=0 ; i--) {
            cadenaInvertida += texto.charAt(i);
        }

        System.out.println("\t Texto original: " + texto);
        String devoler = "\t Texto transformado: " + cadenaInvertida;
        return devoler;

    }



}



