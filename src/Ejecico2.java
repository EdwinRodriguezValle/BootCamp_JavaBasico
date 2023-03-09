import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Ejecico2 {
    public static final double tasaIgv = 0.18;


    public static void main(String[] args) {

    //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

        //1. Calcular el 18% de IGV que se graba a un valor neto:
        Scanner input = new Scanner(System.in);
        System.out.println("Ingreso el valor neto para calcular el IGV del 18%.");

        double valorNeto = input.nextDouble();

       double elIGV =  calculadorDelIGV(valorNeto);
        System.out.println("El 18% de igv a pagar de " + valorNeto + " es: " + elIGV );
        System.out.println("Gracias por usar nuestro app");

        //2. Calculador del valor total a pagar sobre un valor neto
        System.out.println("\nVALOR TOTAL A PAGAR SOBRE UN VALOR NETO CON UNA TASA DEL 18% DEL IGV");
        System.out.println("Ingrese el valor neto?");
        double valorNeto1 = input.nextDouble();
        double valorTotal = valorTotalIGV(valorNeto1);
        System.out.println("El monto total a pagar incluido el IGV es de: " + valorTotal);

        //3. Calculador del IGV a partir de un valor total que incluye el IGV.
        System.out.println("\n Calcule el valor neto a partir de un valor total que incluye el 18% del igv.");
        System.out.println("Ingrese el valor total");
        double valorTotal2 = input.nextDouble();
        double valorTotal3 = desgloseDelIGV(valorTotal2);
        System.out.println("El neto sin impuesto de " + valorTotal2 + " es de: " + valorTotal3);
        System.out.println("Gracias por usar nuestro app");




    }

    //Calculador del 18% del igv sobre un monto neto.
    public static double calculadorDelIGV(double valorNeto){
        double resultado =  valorNeto * tasaIgv;
        return resultado;
    }

    //Calculador de valor total incluido el impuesto general a las ventas

    public static double valorTotalIGV(double valorNeto){
        double resultado = valorNeto * (1 + tasaIgv);
        return resultado;
    }

    //Calculador de un valor neto a parti de un valor total
    public static double desgloseDelIGV(double valorTotal){
        double resultado = valorTotal/ (1 + tasaIgv);
        return resultado;

    }



}
