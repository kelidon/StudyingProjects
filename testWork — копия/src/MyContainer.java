import java.util.ArrayList;
import java.util.Collections;

public class MyContainer<T extends Vehicle> extends ArrayList<T> {
    public MyContainer(){
        super();
    }
    public T min() throws MyException{
        if(isEmpty())
            throw new MyException("Container's empty");
        return Collections.min(this);
    }
    public T max() throws MyException{
        if(isEmpty())
            throw new MyException("Container's empty");
        return Collections.max(this);
    }
    public void print(){
        for(T elem:this){
            System.out.print(elem.toString());
        }
    }
    public int frequency(T o) {
        return Collections.frequency(this, o);
    }
    public T binarySearch(T o)throws MyException{
        MyContainer temp = (MyContainer)this.clone();
        temp.sort(null);
        int indexOfSearched = Collections.binarySearch(temp,o);
        if(indexOfSearched<0)
            return null;
        else
            return get(indexOfSearched);
    }

}
