import java.util.Objects;

abstract public class MyAbstract implements Comparable<MyAbstract> {
    private String word;
    private Integer number;

    public MyAbstract() {
        word = "empty";
        number = 0;
    }

    public MyAbstract(String word, Integer number) {
        this.word = word;
        this.number = number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getNumber() {
        return number;
    }

    public String getWord() {
        return word;
    }

    @Override
    public int compareTo(MyAbstract o) {
        if (!word.equals(o.word))
            return word.compareTo(o.word);
        else return number - o.number;
    }

    @Override
    public String toString() {
        return "\n"+word + "\t" + "-\t" + number;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyAbstract that = (MyAbstract) o;
        return Objects.equals(word, that.word) &&
                Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, number);
    }
}
