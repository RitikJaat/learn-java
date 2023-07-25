import java.util.*;

public class Sorting {
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        int array[] = sc.nextInt(); 
        // deafult used { 7, 8, 3, 1, 2 };

        // bubble sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[i] > array[i + 1]) {
                    // swap values
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

}
