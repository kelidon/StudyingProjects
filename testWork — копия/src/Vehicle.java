import java.util.Objects;

abstract public class Vehicle implements Comparable<Vehicle> {
    private String name, color;
    private Fuel fuel;


    Vehicle() {
        name = "empty";
    }

    public Vehicle(String name, String color, Fuel fuel) {
        this.name = name;
        this.color = color;
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    @Override
    public int compareTo(Vehicle o) {
        if (!name.equals(o.name))
            return name.compareTo(o.name);
        else return o.fuel.toString().compareTo(fuel.toString());
    }

    @Override
    public String toString() {
        return "\n"+ name + "\t-\t" + color + "\t-\t" + fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(name, vehicle.name) &&
                Objects.equals(color, vehicle.color) &&
                fuel == vehicle.fuel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, fuel);
    }
}
enum Fuel{
    GAS, DIESEL;
        }
