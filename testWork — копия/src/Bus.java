import java.util.Objects;

public class Bus extends Vehicle {
    private int seatsNumber, doorsNumber;

    public Bus(String name, String color, Fuel fuel, int seatsNumber, int doorsNumber) {
        super(name, color, fuel);
        this.seatsNumber = seatsNumber;
        this.doorsNumber = doorsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return seatsNumber == bus.seatsNumber &&
                doorsNumber == bus.doorsNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seatsNumber, doorsNumber);
    }

    @Override
    public String toString() {
        return super.toString() + "\t-\t"+ seatsNumber + "\t-\t"+doorsNumber;
    }


}
