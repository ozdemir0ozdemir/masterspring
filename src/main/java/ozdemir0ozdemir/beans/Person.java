package ozdemir0ozdemir.beans;

import org.springframework.stereotype.Component;


public class Person {

    private String name;
    private Vehicle vehicle;

    public Person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    // GETTER & SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override public String toString() {
        return String.format("[Person { name: %s, vehicle: %s }]", getName(), getVehicle());
    }
}
