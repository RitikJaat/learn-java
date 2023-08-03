import java.util.*;

public class RecurrsionAdv {

    public static void printPermutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // "abc" -> "ab" or "bc" or "ac"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newStr, permutation + currentChar);
        }
    };

    public static int countPath(int i, int j, int n, int m) {
        if(i==n || j==m){
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // move downwards
        int downPaths = countPath(i + 1, j, n, m);

        // move right
        int rightPath = countPath(i, j + 1, n, m);

        return downPaths + rightPath;
    };

    public static void main(String[] args) {
        // Permutation

        // String str = "abc";
        // printPermutations(str, "");

        // count paths

        int n = 3, m = 3;
        int total = countPath(0, 0, n, m);
        System.out.println(total);
    }

}
