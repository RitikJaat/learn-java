import java.util.*;

public class Sorting {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    };

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 7, 8, 3, 1, 2 };
        // deafult used { 7, 8, 3, 1, 2 };

        System.out.println("Choose a Sort Type.");
        System.out.println("1) Bubble Sort.");
        System.out.println("2) Selection Sort");
        System.out.println("3) Insertion Sort");
        int choice = sc.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                // bubble sort
                // assending order
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = 0; j < array.length - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            // swap values
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
                printArray(array);
                break;

            case 2:
                // Selection Sort
                for (int i = 0; i < array.length - 1; i++) {
                    int smallest = i;
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[smallest] > array[j]) {
                            smallest = j;
                        }
                    }
                    int tempp = array[smallest];
                    array[smallest] = array[i];
                    array[i] = tempp;
                }
                printArray(array);
                break;

            case 3:
                // insertion sort
                for (int i = 1; i < array.length; i++) {
                    int current = array[i];
                    int j = i - 1;
                    while (j >= 0 && current < array[j]) {
                        array[j + 1] = array[j];
                        j--;
                    }
                    // placement
                    array[j+1]= current;
                }
                printArray(array);
                break;

            default:
                System.out.println("Choose a valid option");
                main(args);
                break;
        }

        sc.close();
    }

}
