import java.util.*;

public class Functions {
    public static void printName(String name) {
        System.out.println("Your name is " + name);
        return;
    };

    public static int ave(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println("Average of given 3 numbers is " + avg);
        return avg;
    };

    public static int odd(int x) {
        int sum = 0;

        for (int i = 0; i <= x; i++) {
            if ((i % 2) == 1) {
                sum += i;
            }
        }
        System.out.println("Sum of all odds from 0 to " + x + " is " + sum);
        return sum;
    };

    public static void greater(int a, int b) {
        if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else if (a == b) {
            System.out.println(a + " and " + b + " both are equal.");
        } else {
            System.out.println(a + " is greater than " + b);
        }
        return;
    };

    public static void radiusToCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle is " + circumference);
        return;
    };

    public static void Eligibility(int age) {
        if (age >= 18) {
            System.out.println("You are Eligible to Vote");
        } else {
            System.out.println("You are not Eligible to Vote.");
        }
    };

    public static void infinity(int value) {
        do {
            value++;
            System.out.println(value);
        } while (value > 1);
    };

    public static void input() {

        Scanner console = new Scanner(System.in);

        int number,
                countPositive = 0,
                countNegative = 0,
                countZero = 0;

        char choice;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
        console.close();

    };

    public static void power(int x, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power = power * x;
        }
        System.out.println(power);
    };

    public static void GCD(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        System.out.println("Greatest Divisor of " + x + " and " + y + " is " + gcd);
    }

    public static void Fibonachi(int tillOrTimes) {
        int a = 0, b = 1, sum = 0;
        System.out.print(a + " " + b);
        for (int i = 2; i <= tillOrTimes; ++i) {
            sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one option : ");
        System.out.println("1) Print Name : ");
        System.out.println("2) Calculate Average : ");
        System.out.println("3) Sum of all odds till given number : ");
        System.out.println("4) Which one of the given value is greater than another : ");
        System.out.println("5) Circumference of cirle using radius : ");
        System.out.println("6) Eligibility to vote checker : ");
        System.out.println("7) Infinity using do while : ");
        System.out.println("8) Input till user Satisfied : ");
        System.out.println("9) X to power of N : ");
        System.out.println("10) Greatest Common Divisor : ");
        System.out.println("11) Fibonachi Series : ");
        int options = sc.nextInt();

        switch (options) {
            case 1:

                System.out.print("What is your name : ");
                String name = sc.next();
                printName(name);
                break;

            case 2:

                System.out.println("Enter 3 Numbers : ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                ave(a, b, c);
                break;

            case 3:
                System.out.println("Enter a number ");
                int d = sc.nextInt();
                odd(d);
                break;

            case 4:
                System.out.println("Enter two values");
                int e = sc.nextInt();
                int f = sc.nextInt();
                greater(e, f);
                break;

            case 5:
                System.out.println("Enter the  alue of radius ");
                int radi = sc.nextInt();
                radiusToCircumference(radi);
                break;

            case 6:
                System.out.println("Enter your Age : ");
                int age = sc.nextInt();
                Eligibility(age);
                break;

            case 7:
                System.out.println("Enter any value : ");
                int val = sc.nextInt();
                infinity(val);
                break;

            case 8:
                input();
                break;

            case 9:
                System.out.println("Enter value of X : ");
                int x = sc.nextInt();
                System.out.println("Enter value of N : ");
                int n = sc.nextInt();

                power(x, n);

                break;

            case 10:
                System.out.println("Enter 1st Value");
                int firsr = sc.nextInt();
                System.out.println("Enter 2nd Value");
                int seconf = sc.nextInt();
                GCD(firsr, seconf);
                break;

            case 11:
                System.out.println("Run Series till which count ? ");
                int till = sc.nextInt();
                Fibonachi(till);
                break;
            default:
                System.out.println("Choose a Valid option.");
                main(args);
                break;
        }

        sc.close();
    }
}
