import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyContainer<T extends MyAbstract> extends ArrayList<T> {
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
            System.out.print(elem);
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
            throw new MyException("No such element");
        return get(indexOfSearched);
    }

}
