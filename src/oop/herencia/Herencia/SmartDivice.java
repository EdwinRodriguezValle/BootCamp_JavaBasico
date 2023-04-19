package oop.herencia.Herencia;

public class SmartDivice {
    private String name;
    private String model;
    private double price;
    private int memoryCapacity;

    //Constructor
    public SmartDivice(){};

    public SmartDivice(String name, String model, double price, int memoryCacpacity) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.memoryCapacity = memoryCacpacity;
    }

    //Getter and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    @Override
    public String toString() {
        return "SmartDivice{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", memoryCapacity=" + memoryCapacity +
                '}';
    }
}
