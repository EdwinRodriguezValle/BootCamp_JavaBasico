package Tipo_datos;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList1 {
    public static void main(String[] args) {

        //A diferencia de vector el ArrayList solo crece el 50% mientras que un vector se dobla al ser desbordado en su tamano
        ArrayList<String> lista = new ArrayList<>();

        // Añadir elementos
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        System.out.println("Contenido de la lista: " + lista);

        System.out.println("Tamaño: " + lista.size());

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Uno");
        lista2.add("Tres");

        if (lista.equals(lista2)) {
            System.out.println("Las dos listas son equivalentes");
            System.out.println("    -> lista: " + lista);
            System.out.println("    -> lista2: " + lista2);
        }

        String []array = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }

        for (String elemento : array) {
            System.out.println("Elemento de la lista convertida en array es: " + elemento);
        }

        for (Object arrayObjeto : lista.toArray()) {
            System.out.println("Elemento de la lista convertida en array es: " + arrayObjeto.toString());
        }

        LinkedList<String> listaEnlazada = new LinkedList<>();

    }

}
