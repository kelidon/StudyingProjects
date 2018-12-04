import java.util.Objects;

public class SecondDerived extends MyAbstract {
    private String secondClassExtra;

    public SecondDerived(String word, Integer number, String secondClassExtra) {
        super(word, number);
        this.secondClassExtra = secondClassExtra;
    }

    public String getSecondClassExtra() {
        return secondClassExtra;
    }

    public void setSecondClassExtra(String secondClassExtra) {
        this.secondClassExtra = secondClassExtra;
    }

    @Override
    public String toString() {
        return super.toString() + "\t-\t"+ secondClassExtra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SecondDerived that = (SecondDerived) o;
        return Objects.equals(secondClassExtra, that.secondClassExtra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secondClassExtra);
    }
}
