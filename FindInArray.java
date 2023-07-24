import java.util.*;

public class FindInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of Columns : ");
        int cols = sc.nextInt();
        int number[][] = new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter numbers for " + i + " Row : ");
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        // output

        // System.out.println();
        // for(int i = 0; i<rows ; i++){
        // for (int j=0; j<cols ; j++){
        // System.out.print(number[i][j]+ " ");
        // }
        // System.out.println();
        // }

        // to Find value in array;
        System.out.print("Enter a Number to find int the Array : ");
        int x = sc.nextInt();

        // Outputing value found at ?
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(number[i][j]== x){
                    System.out.print("Number found at ("+i+","+ j+")");
                }
            }
        }

        sc.close();
    }
}