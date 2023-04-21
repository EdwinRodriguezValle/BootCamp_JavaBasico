package errores;

import java.io.IOException;
import java.util.Scanner;

public class error_tiempo {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que numeros quieres dividir?");

        System.out.println("Ingrese un numero entero: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese otro numero entero : ");
        int b = scanner.nextInt();

        try{
        int salida = divide(a, b);
            System.out.println(salida);
        } catch (Exception e){
            System.out.println("Upsss, Algo no funciona bien!!!");
            throw new IOException("La puta que te pario, porque quieres dividir un entero entre cero huevon, burro eso no se puede!!!");
        }


//        try{
//            double resultado = a / b;
//            System.out.println(resultado);
//        }catch (Exception e){
//            System.out.println(" no seas bruto, no se puede dividir " + a + "entre " + b + ": " + e.getClass() + "No seas burro carajo!!!!");
//
//        }


    }

    public static int divide(int a, int b) throws ArithmeticException, IOException {
        int resultado = 0;
        try {
            resultado = a / b;
        } catch (Exception e) {
            System.out.println("Estos numeros no se puede dividir!!!!");
            throw new IOException("No sea burro, no se puede dividir dos enteros entre cero.");
        }
        return resultado;
    }
}
