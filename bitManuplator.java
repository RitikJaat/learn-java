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
                break;
            default:
                System.out.println("Enter a valid option.");
                main(args);
                break;
        }
    }
}