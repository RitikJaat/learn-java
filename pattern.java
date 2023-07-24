import java.util.*;

public class pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one of the following Pattern to display.");
        System.out.println("1) Box of Stars.");
        System.out.println("2) Hollow Rectangle.");
        System.out.println("3) Half Pyramid.");
        System.out.println("4) Inverted Half Pyramid.");
        System.out.println("5) Inverted Half Pyramid.(180 degree)");
        System.out.println("6) Numbers Half-Pyramid.");
        System.out.println("7) Inverted Numbers Half-Pyramid.");
        System.out.println("8) Floyds Triangle.");
        System.out.println("9) 0-1 Triangle.");
        System.out.println("10) Exit.");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.print("Number of rows : ");
                int a = sc.nextInt();
                System.out.print("Number of columns : ");
                int b = sc.nextInt();

                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= b; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.print("Number of rows : ");
                int c = sc.nextInt();
                System.out.print("Number of columns : ");
                int d = sc.nextInt();

                for (int i = 1; i <= c; i++) {
                    for (int j = 1; j <= d; j++) {
                        // cell(i,j) ->(1,1)
                        if (i == 1 || j == 1 || i == c || j == d) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.print("No. of Rows : ");
                int e = sc.nextInt();

                for (int i = 1; i <= e; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 4:
                System.out.print("No. of Rows : ");
                int f = sc.nextInt();

                for (int i = f; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 5:
                System.out.print("No. of Rows : ");
                int g = sc.nextInt();

                for (int i = 1; i <= g; i++) {
                    // this inner loop for spaces.
                    for (int j = 1; j <= g - i; j++) {
                        System.out.print(" ");
                    }
                    // another inner loop for stars.
                    for (int l = 1; l <= i; l++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 6:
                System.out.print("Enter a Number : ");
                int num = sc.nextInt();

                for (int i = 1; i <= num; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;

            case 7:
                System.out.print("Enter a Number : ");
                int num1 = sc.nextInt();

                for (int i = 1; i <= num1; i++) {
                    for (int j = 1; j <= num1 - i + 1; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;

            case 8:
                System.out.print("Enter a Number : ");
                int num3 = sc.nextInt();
                int number = 1;
                for (int i = 1; i <= num3; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(number + " ");
                        number++;
                    }
                    System.out.println();
                }
                break;

            case 9:
                System.out.print("Enter number of rows you want : ");
                int num2 = sc.nextInt();
                
                for (int i=1;i<=num2;i++){
                    for(int j=1;j<=i;j++){
                        int sum = i+j;
                        if(sum % 2 == 0){
                            System.out.print(" 1 ");
                        }  else{
                            System.out.print(" 0 ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 10:
                System.out.println("Thanks for trying this program");
                break;
            default:
                System.out.print("Enter a valid input.");
                System.out.println();
                main(args);
                break;
        }
        sc.close();
    }
}
