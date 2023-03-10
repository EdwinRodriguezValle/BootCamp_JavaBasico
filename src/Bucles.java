public class Bucles {
    public static void main(String[] args) {

        //Bucle while
        int numero = 0;

        while (numero < 10){
            numero ++;
            if(numero == 3){

                System.out.println("Soy un numero cool!!");
                //continue;
                //break;

            }
            System.out.println("Soy menos que 10 " + numero);


        }


        //  Bucle forEach
        String [] nombres = {"Edwin", "Sofia", "Claudia", "Gilberto"};

        for (String resultadoNombres : nombres) {
            System.out.println(resultadoNombres);
        }

    }
}
