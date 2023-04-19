import oop.herencia.Herencia.SmartDivice;
import oop.herencia.Herencia.SmartPhone;
import oop.herencia.Herencia.SmartWatch;

public class MainSmartDivice {
    public static void main(String[] args) {

        /** llamando e imprimiendo SmartDivice**/

        SmartDivice artefactoInteligente1 = new SmartDivice();
        SmartDivice artefactoInteligente2 = new SmartDivice("Nombre1", "modelo_a", 23.4, 45);
        SmartDivice artefactoInteligente3 = new SmartDivice("Nombre2", "modelo_b", 45.4, 100);

        System.out.println(artefactoInteligente1);
        System.out.println(artefactoInteligente2);
        System.out.println(artefactoInteligente3);

        /**Llamando e imprimeindo las clases hijas y usando el polimorfismo**/

        SmartPhone telefonoInteligente1 = new SmartPhone();
        SmartPhone telefonoInteligente2 = new SmartPhone("Nombre", "marca", 34.3, 56, "Marca", "Casio", 45.2);
        SmartDivice telefonoInteligente3 =new SmartPhone("Nombre", "marca", 34.3, 56, "Marca", "Casio", 45.2);

        System.out.println("Imprimiendo los telefonos inteligentes: ");


        System.out.println(telefonoInteligente1 + "\n"  + telefonoInteligente2);
        System.out.println(telefonoInteligente2);
        System.out.println(telefonoInteligente3);

        System.out.println("Imprimiendo los relojes inteligentes:");
        SmartWatch SmartWatch1 = new SmartWatch();
        SmartDivice SmartWatch2  = new SmartWatch("Nombre", "marca", 34.3, 56, "Marca", "Casio", 45555543);
        SmartDivice SmartWatch3  =new SmartWatch("Nombre", "marca", 34.3, 56, "Marca", "Casio", 454628648);

        System.out.println(SmartWatch1 + "\n"  + SmartWatch2);
        System.out.println(SmartWatch2);
        System.out.println(SmartWatch3);


    }
}