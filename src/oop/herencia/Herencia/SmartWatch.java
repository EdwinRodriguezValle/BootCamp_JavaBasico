package oop.herencia.Herencia;

public class SmartWatch extends SmartDivice{
    private String nombre;
    private String model;
    private int serie;


    //Constructors
    public SmartWatch(){}

    public SmartWatch(String nombre, String model, int serie) {
        this.nombre = nombre;
        this.model = model;
        this.serie = serie;
    }

    public SmartWatch(String name, String model, double price, int memoryCacpacity, String nombre, String model1, int serie) {
        super(name, model, price, memoryCacpacity);
        this.nombre = nombre;
        this.model = model1;
        this.serie = serie;
    }

    //Getters and setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }


}
