


package ejercicios_7_8_9;

public class Vector {

    public static void main(String[] args) {

        //3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        // Un vector es similar a un array, pero puede (de)crecer dinámicamente.
        java.util.Vector<String> vector = new java.util.Vector<>();

        // Añadir elementos
        vector.add("Ramon");
        vector.add("Tarzan");
        vector.add("Luca");
        vector.add("Yessica");
        vector.add("Camilo");
        System.out.println("Contenido completo del vector: " + vector);

        // QEliminando el segundo y tercero:
        vector.remove(1);
        vector.remove(2);
        System.out.println("vector con dos entradas eliminadas: " + vector);

        //4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        //Copia todos el array y va quitar memoria en la computadora

    }

}