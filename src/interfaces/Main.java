package interfaces;

import java.util.List;

public class Main {
    //Declarando una variable general
    static CocheCRUD cocheCRUD = new CocheCRUDImplement();

    public static void main(String[] args) {
        //Creando objetos o coches

        Coche coche1 = new Coche("Toyota", 4532, 46.7, true);
        Coche coche2 = new Coche("Yaris", 4532, 46.7, true);
        Coche coche3 = new Coche("Datsum", 4532, 46.7, true);
        Coche coche4 = new Coche("Volvo", 4532, 46.7, true);
        Coche coche5 = new Coche("Michigan", 4532, 46.7, true);

        //Guardando coches
        cocheCRUD.save(coche1);
        cocheCRUD.save(coche2);
        cocheCRUD.save(coche3);
        cocheCRUD.save(coche4);
        cocheCRUD.save(coche5);

        System.out.println(coche1 + "\n" + coche2 + "\n" + coche3 + "\n" + coche4 + "\n" + coche5);

        //La forma para que te devuelva en una lista todos los coches
        List<Coche> misUltimosCohes = cocheCRUD.findAll();

        System.out.println("Esto seria la manera de encontrarlos \n: " + misUltimosCohes);

        //Borrar un choche

       cocheCRUD.delete(coche1);




    }

}
