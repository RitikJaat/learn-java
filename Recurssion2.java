/*
 * ^ means default 
 */

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
            // arra is unsorted (2nd way)
            return false;
        }
        return sortedOrNot(array, index + 1);
    };

    public static void moveAllX(String str, int index, int count, String newStr) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == 'X' || currentChar == 'x') {
            count++;
            moveAllX(str, index + 1, count, newStr);
        } else {
            newStr += currentChar;
            moveAllX(str, index + 1, count, newStr);
        }

    };

    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int index, String newString) {

        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        // if (map[currentChar - 'a'] == true){ //both way are right. ^true
        if (map[currentChar - 'a']) {
            removeDuplicate(str, index + 1, newString);
        } else {
            newString += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicate(str, index + 1, newString);
        }
    };

    public static void subSequence(String str, int index, String newString) {

        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        // to be
        subSequence(str, index + 1, newString + currentChar);
        // to not to be
        subSequence(str, index + 1, newString);
    };

    public static void usubSequence(String str, int index, String newString, HashSet<String> set) {

        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar = str.charAt(index);
        // to be
        usubSequence(str, index + 1, newString + currentChar, set);
        // to not to be
        usubSequence(str, index + 1, newString, set);
    };

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printTKeypad(String str, int index, String combination) {
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(index);
        String mapping = keypad[currentChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printTKeypad(str, index + 1, combination + mapping.charAt(i));
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Tower of Hanoi (count steps required to move disks) : ");
        System.out.println("2) Reverse String : ");
        System.out.println("3) Find Occurance in the String : ");
        System.out.println("4) Check array is sorted or not(Strictly increasing) : ");
        System.out.println("5) Move All X : ");
        System.out.println("6) Remove all Duplicate : ");
        System.out.println("7) Print all Subsequences of String : ");
        System.out.println("8) Print all Unique Subsequences of String : ");
        System.out.println("9) T-Keypad all Subsequences: ");
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
                int array[] = { 1, 3, 3 };
                System.out.println(sortedOrNot(array, 0));
                break;

            case 5:
                String str2 = sc.next(); // axbcxxd
                moveAllX(str2, 0, 0, "");
                break;

            case 6:
                String str3 = sc.next(); // ^ abbccda
                removeDuplicate(str3, 0, "");
                break;

            case 7:
                String str4 = sc.next(); // ^ abc
                subSequence(str4, 0, "");
                break;
            case 8:
                String str5 = sc.next(); // ^ aaa
                HashSet<String> set = new HashSet<>();
                usubSequence(str5, 0, "", set);
                break;

            case 9:
            String str6 = sc.next(); // ^ 23
            printTKeypad(str6, 0, "");
                break;
            default:
                main(args);
                break;
        }
        sc.close();
    }

}
