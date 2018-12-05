import java.util.Objects;

public class Car extends Vehicle {
    private SeatMaterial seatMaterial;

    public Car(String name, String color, Fuel fuel, SeatMaterial seatMaterial) {
        super(name, color, fuel);
        this.seatMaterial = seatMaterial;
    }

    public SeatMaterial getSeatMaterial() {
        return seatMaterial;
    }

    public void setSeatMaterial(SeatMaterial seatMaterial) {
        this.seatMaterial = seatMaterial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return seatMaterial == car.seatMaterial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seatMaterial);
    }

    @Override
    public String toString() {
        return super.toString() + "\t-\t"+ seatMaterial;
    }


}
enum SeatMaterial{
    LEATHER, WOOD, PLASTIC;
}
