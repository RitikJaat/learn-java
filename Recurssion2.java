import java.util.*;

public class Recurssion2 {
    public static void towerOfHanoi(int n, String s, String h, String d) {
        if (n == 1) {
            System.out.println("Transfering Disk " + n + " from " + s + " to " + d);
            return;
        }
        towerOfHanoi(n - 1, s, d, h);
        System.out.println("Transfering Disk " + n + " from " + s + " to " + d);
        towerOfHanoi(n - 1, h, s, d);
    };

    public static void reverseString(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        reverseString(str, index - 1);
    };

    public static int first = -1; // .
    public static int last = -1; // .

    public static void findOccurance(String str, int index, char element) { // .
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccurance(str, index + 1, element);
    };

    public static boolean sortedOrNot(int array[], int index) {
        if (index == array.length - 1) {
            return true;
        }
        if (array[index] < array[index + 1]) {
            // arra is sorted till now
            return sortedOrNot(array, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Tower of Hanoi (count steps required to move disks) : ");
        System.out.println("2) Reverse String : ");
        System.out.println("3) Find Occurance in the String : ");
        System.out.println("4) Check array is sorted or not(Strictly increasing) : ");
        int options = sc.nextInt();
        switch (options) {
            case 1:
                System.out.print("Enter number od Disks : ");
                int n = sc.nextInt(); // default used 3
                towerOfHanoi(n, "Source", "Helper", "Destination");
                break;

            case 2:
                String str = sc.next();// ^ abcd
                reverseString(str, str.length() - 1);
                break;

            case 3:
                String str1 = sc.next(); // ^ abaacdaefaah
                System.out.println("Enter a element to find.");
                char findEle = sc.next().charAt(0);
                findOccurance(str1, 0, findEle);
                break;

            case 4:
            int array[] = {1,3,3};
            System.out.println(sortedOrNot(array, 0));
                break;

                
            default:
                main(args);
                break;
        }
        sc.close();
    }

}
