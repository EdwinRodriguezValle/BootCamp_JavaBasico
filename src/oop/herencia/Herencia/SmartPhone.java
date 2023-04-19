package oop.herencia.Herencia;

public class SmartPhone extends SmartDivice{
    private String marca;
    private String fabricante;
    private double precio_de_venta;

    //Constructores
    public SmartPhone(){};

    public SmartPhone(String marca, String fabricante, double precio_de_venta) {
        this.marca = marca;
        this.fabricante = fabricante;
        this.precio_de_venta = precio_de_venta;
    }

    public SmartPhone(String name, String model, double price, int memoryCacpacity, String marca, String fabricante, double precio_de_venta) {
        super(name, model, price, memoryCacpacity);
        this.marca = marca;
        this.fabricante = fabricante;
        this.precio_de_venta = precio_de_venta;
    }

    //Getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPrecio_de_venta() {
        return precio_de_venta;
    }

    public void setPrecio_de_venta(double precio_de_venta) {
        this.precio_de_venta = precio_de_venta;
    }
}
