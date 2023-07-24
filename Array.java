
import java.util.*;

public class Array {



    public static void main(String args[]) {
        int arrayindex = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int size = sc.nextInt();

        // Array Array[] = new Array[size]; // Array name[] = new Arrat[size]
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Value at " + arrayindex + " : ");
            arrayindex++;
            numbers[i] = sc.nextInt();
        }
        // output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        // find value at x using linear search(algo);
        System.out.println("Type a Value Present in Array.");
        int x = sc.nextInt();

        for (int i =0; i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("Number found at "+i);
            }
        }
        sc.close();
    }
}
