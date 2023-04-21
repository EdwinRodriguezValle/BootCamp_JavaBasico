package ejercicios_7_8_9.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Excepciones {
    //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante
    // (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
    public static void main(String[] args) {

        //Gestionar errores
        double numero = gestionErrors(10, 0);
        System.out.println(numero);


        // 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".



    }

    public static int gestionErrors(int numero1, int numero2) throws ArithmeticException{
       int calculo = 0;
        try {
            calculo = numero1 / numero2;
        } catch (ArithmeticException e) {

            throw new ArithmeticException("No se puede dividir un numero entero por cero: " + e.getMessage());
        }
        return calculo;

    }

    public static void lectorDeCarpetas() throws IOException{
        try{
            InputStream carpeta = new FileInputStream("D:\\final");
            try {
                byte []datos = new byte[5];
                int data = carpeta.read(datos);

                while (data != -1) {
                    System.out.println("Leido: '" + (char)data + "' que es el código " + data);
                    data = carpeta.read();
                }

            } catch (IOException e) {
                System.out.println("Error al leer: " + e.getMessage());
            }
        }catch (IOException e){
            throw new IOException("No se puede leer el archivo, asegurese de que la ruta se correcta: " + e.getMessage());
        }
    }
}

