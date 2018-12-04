import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class FirstDerivedClassRenamed extends MyAbstract {
    private int firstClassExtra;

    FirstDerivedClassRenamed(String word, Integer number, int firstClassExtra) {
        super(word, number);
        this.firstClassExtra = firstClassExtra;
    }

    public int getFirstClassExtra() {
        return firstClassExtra;
    }

    public void setFirstClassExtra(int firstClassExtra) {
        this.firstClassExtra = firstClassExtra;
    }

    @Override
    public String toString() {
        return super.toString() + "\t-\t"+ firstClassExtra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FirstDerivedClassRenamed that = (FirstDerivedClassRenamed) o;
        return firstClassExtra == that.firstClassExtra;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstClassExtra);
    }
}
