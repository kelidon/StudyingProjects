import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MyContainer<FirstDerivedClassRenamed> a = new MyContainer<>();
        MyContainer<SecondDerived> b = new MyContainer<>();
        Scanner s1, s2;
        System.out.print("\n____________________________________\nFirst:");
        try{
            s1 = new Scanner(new File("src\\input1.txt"));
            while(s1.hasNext())
                a.add(new FirstDerivedClassRenamed(s1.next(), s1.nextInt(), s1.nextInt()));

            a.print();
            System.out.println("\nMinimum: "+ a.min());

            MyContainer<FirstDerivedClassRenamed> aCopy = (MyContainer)a.clone();
            System.out.print("sorted: ");
            aCopy.sort(null);
            aCopy.print();
            FirstDerivedClassRenamed searched = new FirstDerivedClassRenamed("FCO_3", 3, 36);

            System.out.print("\nSearch result: ");
            System.out.print(aCopy.binarySearch(searched));

            System.out.print("\nFrequency: " + aCopy.frequency(searched));
        }
        catch(FileNotFoundException exc){
            System.out.println("file not found");
        }
        catch(MyException exc){
            System.out.print(exc.getMessage());
        }

        catch(NoSuchElementException exc){
            System.out.print("\nWrong input");
        }
///////////////////////////////////////////Second Class////////////////////////////////////////////////////////////////
        System.out.print("\n____________________________________\nSecond: ");
        try{
            s2 = new Scanner(new File("src\\input2.txt"));
            while(s2.hasNext())
                b.add(new SecondDerived(s2.next(), s2.nextInt(), s2.next()));

            b.print();
            System.out.println("\nMinimum: "+ b.min());

            MyContainer<SecondDerived> bCopy = (MyContainer)b.clone();
            System.out.print("sorted: ");
            bCopy.sort(null);
            bCopy.print();
            SecondDerived searchedB = new SecondDerived("SCO_3", 30, "orange");

            System.out.print("\nSearch result: ");
            System.out.print(bCopy.binarySearch(searchedB));

            System.out.print("\nFrequency: " + bCopy.frequency(searchedB));
        }
        catch(FileNotFoundException exc){
            System.out.println("file not found");
        }
        catch(MyException exc){
            System.out.print(exc.getMessage());
        }
        catch(NoSuchElementException exc){
            System.out.print("\nWrong input");
        }
        System.out.println("\n____________________________________");
    }
}
