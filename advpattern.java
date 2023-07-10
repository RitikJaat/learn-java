
/**
 * Source code of Advance Patterns.
 * further files will be more detailed.
 * @author (M0NSTER)
 * @version (alpha)
 */
import java.util.*;

public class advpattern {
    public static void main(String args[]) {
        System.out.println("-----------------------------------");
        System.out.println("Source code written by M0NSTER for advance patterns using loops in java.");
        System.out.println("-----------------------------------");
        System.out.println("@author = M0NSTER");
        System.out.println("@version = Alpha");
        System.out.println("-----------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Choose one of the Given options :");
        System.out.println("-----------------------------------");
        System.out.println("1) ButterFly");
        System.out.println("2) Solid Rombus");
        System.out.println("3) Hollow Rombus");
        System.out.println("4) Number Pyramid");
        System.out.println("5) Palindromic Pattern");
        System.out.println("6) Diamond Pattern");
        System.out.println("-----------------------------------");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a Numer : ");
                int num = sc.nextInt();

                // upper part
                // 1st step
                for (int i = 1; i <= num; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // spaces inbetween
                    int spaces = 2 * (num - i);
                    for (int j = 1; j <= spaces; j++) {
                        System.out.print(" ");
                    }
                    // 2nd step
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
                // lower
                for (int i = num; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // spaces inbetween
                    int spaces = 2 * (num - i);
                    for (int j = 1; j <= spaces; j++) {
                        System.out.print(" ");
                    }
                    // 2nd step
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
                break;

            case 2:
                System.out.print("Enter a Number : ");
                int num2 = sc.nextInt();
                for (int i = 1; i <= num2; i++) {
                    // spaces
                    for (int j = 1; j <= num2 - i; j++) {
                        System.out.print(" ");
                    }
                    // stars
                    for (int j = 1; j <= num2; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 3:
                // int i, j;
                System.out.print("Enter a Number : ");
                int rows = sc.nextInt();
                for (int i = 1; i <= rows; i++) {
                    // Print trailing spaces
                    for (int j = 1; j <= rows - i; j++)
                        System.out.print(" ");

                    // Print stars after spaces
                    // Print stars for each solid rows
                    if (i == 1 || i == rows)
                        for (int j = 1; j <= rows; j++)
                            System.out.print("*");

                    // stars for hollow rows
                    else
                        for (int j = 1; j <= rows; j++)
                            if (j == 1 || j == rows)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                    // Move to the next line/row
                    System.out.println();
                }
                break;

            case 4:
                System.out.print("Enter a Number : ");
                int num3 = sc.nextInt();
                // spaces
                for (int i = 1; i <= num3; i++) {
                    for (int j = 1; j <= num3 - i; j++) {
                        System.out.print(" ");
                    }
                    // Numbers
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
                break;

            case 5:
                System.out.print("Enter a Number : ");
                int num4 = sc.nextInt();

                for (int i = 1; i <= num4; i++) {
                    // spaces
                    for (int j = 1; j <= num4 - i; j++) {
                        System.out.print(" ");
                    }
                    // 1st half numbers
                    for (int j = i; j >= 1; j--) {
                        System.out.print(j);
                    }
                    // 2nd half numbers
                    for (int j = 2; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;

            case 6:
                System.out.print("Enter a Number : ");
                int num5 = sc.nextInt();
                // upper half
                for (int i = 1; i <= num5; i++) {
                    // spaces
                    for (int j = 1; j <= num5 - i; j++) {
                        System.out.print(" ");
                    }
                    // stars
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                // lower half
                for (int i = num5; i >= 1; i--) {
                    // spaces
                    for (int j = 1; j <= num5 - i; j++) {
                        System.out.print(" ");
                    }
                    // stars
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                break;
            default:
                System.out.println("Plese Enter a Valid Value. ");
                main(args);
                break;
        }
        sc.close();
    }
}
