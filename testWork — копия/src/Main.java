import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MyContainer<Car> a = new MyContainer<>();
        MyContainer<Bus> b = new MyContainer<>();
        Scanner s1, s2;
        System.out.print("\n____________________________________\nFirst:");
        try{
            s1 = new Scanner(new File("src\\input1.txt"));
            while(s1.hasNext()) {
                String name = s1.next(), color = s1.next();
                Fuel fuel = Fuel.valueOf(s1.next());
                SeatMaterial seatMaterial = SeatMaterial.valueOf(s1.next());
                a.add(new Car(name, color, fuel, seatMaterial));
            }

            a.print();
            System.out.println("\nMaximum: "+ a.max());

            MyContainer<Car> aCopy = (MyContainer)a.clone();
            System.out.print("sorted: ");
            aCopy.sort(null);
            aCopy.print();

            Car searched = new Car("For", "red", Fuel.GAS, SeatMaterial.PLASTIC);

            System.out.print("\n\nSearch result: ");
            System.out.print("\nFrequency of searched = " + aCopy.frequency(searched));
            //if(aCopy.binarySearch(searched)!=null)
                System.out.print(aCopy.binarySearch(searched) + "\t(found)");
            //else
              //  System.out.print("\nNo such element");
        }
        catch(NullPointerException exc){
            System.out.print("npe");
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
        catch(IllegalArgumentException exc){
            System.out.print("Wrong Input(possibly wrong enum variable)");
        }

///////////////////////////////////////////Second Class////////////////////////////////////////////////////////////////
        System.out.print("\n____________________________________\nSecond: ");
        try{
            s2 = new Scanner(new File("src\\input2.txt"));
            while(s2.hasNext()) {
                String name = s2.next(), color = s2.next();
                Fuel fuel = Fuel.valueOf(s2.next());
                int seatsNumber = s2.nextInt(), doorsNumber = s2.nextInt();
                b.add(new Bus(name, color, fuel, seatsNumber, doorsNumber));
            }

            b.print();
            System.out.println("\nMaximum: "+ b.max());

            MyContainer<Bus> bCopy = (MyContainer)b.clone();
            System.out.print("sorted: ");
            bCopy.sort(null);
            bCopy.print();
            Bus searchedB = new Bus("MZ", "green", Fuel.GAS, 12,12);

            System.out.print("\n\nSearch result: ");
            System.out.print("\nFrequency of searched = " + bCopy.frequency(searchedB));
            System.out.print(bCopy.binarySearch(searchedB) + "\t(found)");

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
        catch(IllegalArgumentException exc){
            System.out.print("Wrong Input(possibly wrong enum variable)");
        }
        System.out.println("\n____________________________________");
    }
}
