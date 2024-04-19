package ozdemir0ozdemir.beans;

public class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // GETTER & SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return String.format("[Vehicle { name: %s }]", getName());
    }
}
