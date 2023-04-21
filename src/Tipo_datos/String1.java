package Tipo_datos;

public class String1 {

    public static void main(String[] args) {
//        String hola = "Edwin";
//        for (int i = 0; i < hola.length(); i++) {
//            char reverso_edwin = hola.charAt(i);
//            System.out.println(reverso_edwin);
//        }


        int [][] arrayBidimencional = new int[2][5]; // el primer array son filas y la segunda columnas, y los numeros muestran el tamano de los arrays.
        //Completar las filas
        arrayBidimencional [0][0] = 1;
        arrayBidimencional [0][1] = 2;
        arrayBidimencional [0][2] = 3;
        arrayBidimencional [0][3] = 4;
        arrayBidimencional [0][4] = 5;

        //Completar columnas
        arrayBidimencional [1][0] = 10;
        arrayBidimencional [1][1] = 20;
        arrayBidimencional [1][2] = 30;
        arrayBidimencional [1][3] = 40;
        arrayBidimencional [1][4] = 50;

        //El primer for muestra las filas.
        for (int i = 0; i < arrayBidimencional.length; i++) {
            for (int j = 0; j < arrayBidimencional[i].length; j++) {
                System.out.println(arrayBidimencional[i][j]);
            }

        }



    }
}
