import java.util.*;

public class Recurssion {
    public static void printFrom(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printFrom(n - 1);
    };

    public static void printTo(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    };

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
        System.out.println(i);
    };

    public static int calcFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calcFactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    };

    public static void printFibbonachi(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibbonachi(b, c, n - 1);

    };

    public static int calcPower(int x, int n) {
        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 0;
        }
        int xpow1 = calcPower(x, n - 1); // work
        int xpown = x * xpow1;
        return xpown;
    };

    public static int calcPower1(int x, int n) {
        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 0;
        }
        // if n is even
        if (n % 2 == 0) {
            return calcPower1(x, n/2) * calcPower1(x, n);
        }
        else {
            // n is odd
            return calcPower1(x, n/2) * calcPower1(x, n/2) * x;
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose from options below :\n");
        System.out.print("1) From to \n");
        System.out.print("2) To from \n");
        System.out.print("3) Print Sum \n");
        System.out.print("4) Calc. Factorial \n");
        System.out.print("5) Fibbonachi Series till n \n");
        System.out.print("6) Print x^n(Stack height = n) \n");
        System.out.print("7) Print x^n(Stack height = logn) \n");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter a value : ");
                int n = sc.nextInt();
                printFrom(n);
                break;

            case 2:
                System.out.print("Enter a value : ");
                int n1 = sc.nextInt();
                printTo(n1);
                break;

            case 3:
                System.out.print("Enter a value : ");
                int i = sc.nextInt();
                System.out.print("Enter times to add : ");
                int n2 = sc.nextInt();
                int sum = 0;
                printSum(i, n2, sum);
                break;

            case 4:
                System.out.print("Enter a value : ");
                int f = sc.nextInt();
                int ans = calcFactorial(f);
                /*
                 * example using 5;
                 * factorial of 5 or 5!;
                 * 5 * 4 * 3 * 2 * 1
                 * multiply all values till one.
                 */
                System.out.println("Factorial of " + f + " is " + ans);
                break;

            case 5:
                int a = 0, b = 1;
                System.out.print("Print Fibbonachi series till nth number : ");
                int terms = sc.nextInt();
                System.out.println(a);
                System.out.println(b);
                printFibbonachi(a, b, terms - 2);
                break;

            case 6:
                System.out.print("Enter value of x : ");
                int x = sc.nextInt();
                System.out.print("Enter value of n : ");
                int n3 = sc.nextInt();
                int ans1 = calcPower(x, n3);
                System.out.println(ans1);
                break;
            case 7:
                System.out.print("Enter value of x : ");
                int x1 = sc.nextInt();
                System.out.print("Enter value of n : ");
                int n4 = sc.nextInt();
                int ans2 = calcPower(x1, n4);
                System.out.println(ans2);
                break;



            default:
                System.out.println("Enter valid option.");
                main(args);
                break;
        }
        sc.close(); // scaneer closed.

    }
}
