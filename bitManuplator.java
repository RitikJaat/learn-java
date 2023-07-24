import java.util.*;

public class bitManuplator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from the given options below : ");
        System.out.println("1) Get Bit : ");
        System.out.println("2) Set Bit : ");
        System.out.println("3) Clear Bit : ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter a value for bit");
                int n = sc.nextInt();// 5
                System.out.println("Enter the postion you would like to get");
                int p = sc.nextInt();// 2
                int bitMask = 1 << p;

                if ((bitMask & n) == 0) {
                    System.out.println("bit was zero.");
                } else {
                    System.out.println("bit was not zero.");
                }
                break;

            case 2:

                System.out.println("Enter a value for bit");
                int n1 = sc.nextInt();// 5
                System.out.println("Enter the postion you would like to set");
                int p1 = sc.nextInt();// 2
                int bitMask1 = 1 << p1;
                /*
                 * example
                 * n1 = 5 ; in bits-> 0101
                 * p1 = 1 ; in bits-> 0111
                 * used | to do OR
                 * 0 1 0 1
                 * 0 0 1 0
                 * =0 1 1 1
                 */

                int newNumber = bitMask1 | n1;
                System.out.println(newNumber);
                break;
            case 3:
                System.out.println("Enter a value for bit");
                int n2 = sc.nextInt(); // default number used 5
                System.out.println("Enter the postion you would like to clear");
                int p2 = sc.nextInt(); // default number used 2
                int bitMask2 = 1 << p2;
                int notBitMask = ~(bitMask2); // ~(bitmask) did made all bits opposite.
                /*
                 * example
                 * bitmask 2 = 0100
                 * ~bitmask -> 1011
                 */
                int newNumber1 = notBitMask & n2;
                System.out.println(newNumber1);
                break;
            default:
                System.out.println("Enter a valid option.");
                main(args);
                break;
        }
    }
}