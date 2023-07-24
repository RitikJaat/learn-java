import java.util.*;

public class bitManuplator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from the given options below : ");
        System.out.println("1) Get Bit : ");
        System.out.println("2) Set Bit : ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter a value for bit");
                int n = sc.nextInt();
                System.out.println("Enter the postion you would like to get");
                int p = sc.nextInt();
                int bitMask = 1 << p;

                if ((bitMask & n) == 0) {
                    System.out.println("bit was zero.");
                } else {
                    System.out.println("bit was not zero.");
                }
                break;

            case 2:
                System.out.println("Enter a value for bit");
                int n1 = sc.nextInt();
                System.out.println("Enter the postion you would like to get");
                int p1 = sc.nextInt();
                int bitMask1 = 1 << p1;
                /*example
                 * n1 = 5 ; in bits-> 0101
                 * p1 = 1 ; in bits-> 0111
                 * used | to do OR
                 *  0 1 0 1
                 *  0 0 1 0
                 * =0 1 1 1
                 */

                int newNumber = bitMask1 | n1;
                System.out.println(newNumber);
                break;
            default:
                System.out.println("Enter a valid option.");
                main(args);
                break;
        }
    }
}