package interfaces;

public class Coche {
    String marca;
    int  serie;
    double precio;
    boolean disponibilidad_stock;

    //Constructor vacio

    public Coche (){}

    public Coche(String marca, int serie, double precio, boolean disponibilidad_stock) {
        this.marca = marca;
        this.serie = serie;
        this.precio = precio;
        this.disponibilidad_stock = disponibilidad_stock;
    }

    //Metodos


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", serie=" + serie +
                ", precio=" + precio +
                ", disponibilidad_stock=" + disponibilidad_stock +
                '}';
    }
}
