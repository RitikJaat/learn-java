import java.util.*;
/*so basically its like a tree of options
 *        abc
 *  all these three have 2 choices and so does the output of these two choices
 */

public class BackTracking {

    public static void print(String str, String permutation, int index) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            print(newStr, permutation + currChar, index + 1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        print(str, "", 0);
    }

}
