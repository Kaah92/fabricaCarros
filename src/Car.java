public class Car {

    private String brand;
    private String color;
    private int numPorts;

    public Car(String marca, String cor, int qntdPortas) {
        this.brand = marca;
        this.color = cor;
        this.numPorts = qntdPortas;
    }

    public String getBrand() { return brand; }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumPorts() {
        return numPorts;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

}
