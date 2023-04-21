package ejercicios_7_8_9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ArrayList_ {
    public static void main(String[] args) {
        //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Edwin");
        listaNombres.add("Lazzy");
        listaNombres.add("Carlos");
        listaNombres.add("Teresa");

        for (String nombres : listaNombres) {
            System.out.println(nombres);
        }

        LinkedList<String> nombreCopias = new LinkedList<>(listaNombres);
        for (String nombres : nombreCopias) {
            System.out.println("Estos son las copias de ArrayList: " + nombres);

        }

        for (int i = 0; i < nombreCopias.size(); i++) {
            System.out.println("Yo voy a ser imprimido por for: " + nombreCopias.get(i));

        }
        // 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        // con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> numeros10 = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            numeros10.add(i);
        }
        System.out.println("A mi me han ingresado con un for loop: " + numeros10);
        System.out.println("Yo tengo el tamano de : " + numeros10.size());

        for (int i = 1; i < numeros10.size(); i++) {
            if (numeros10.get(i) % 2 == 0) {
                numeros10.remove(i);
                i--;
            }
        }
        System.out.println("Me han quitado mis numeros pares: " + numeros10);


        ArrayList<Integer> mis_numeros = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            mis_numeros.add(i);

        }
        for (int i = 0; i < mis_numeros.size(); i++) {
            if (mis_numeros.get(i) % 2 != 0) {
                mis_numeros.remove(i);
                i--;
            }
        }

        System.out.println("Ahora me han devuelto mis numeros pares: " + mis_numeros);


        HashMap<Integer, String> clave_Nombre = new HashMap<>();

        clave_Nombre.put(1, "Edwin");
        clave_Nombre.put(2, "Julio");
        clave_Nombre.put(3, "Tania");
        clave_Nombre.put(4, "Judith");
        clave_Nombre.put(5, "Christina");

        System.out.println(clave_Nombre.get(1));
        System.out.println(clave_Nombre);

        clave_Nombre.replace(5, "Carmela");
        System.out.println(clave_Nombre);






    }
}