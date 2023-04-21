package Tipo_datos;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<Integer>(20, 10);
        vector.add(1);
        vector.add(2);
        vector.add(3);


        System.out.println("Tamano: " + vector.size() + "\n" + "Capacidad: " + vector.capacity());

        Vector<Integer> vector2 = new Vector<>(20, 10);
        vector2.add(10);
        vector2.add(20);
        vector2.add(30);

        //recorrer un vector con el formato forEach
        for (int hola: vector2){
            System.out.println(hola);
        }

        //Recorrer un vector con el formato for
        for (int i = 0; i < vector2.size(); i++) {
            System.out.println("Valor en la posicion: " + i + " del vector " + vector2.get(i));
        }

        if(vector.equals(vector2)){
            System.out.println("Los vectores comparados");
            System.out.println(vector);
            System.out.println(vector2);
        }

//        Vector<String> stringVector = new Vector<>();
//        stringVector.add("Quien es?");
//        stringVector.add("Hola");
//        stringVector.add("Como estas");
//        stringVector.add("Lamame");
//        stringVector.remove(0);
//        stringVector.clear();
//
//        System.out.println(stringVector);

    }
}
