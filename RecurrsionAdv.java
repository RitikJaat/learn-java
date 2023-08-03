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
        if (i == n || j == m) {
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

    public static int printTiles(int n, int m) {

        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertically place
        int vPlace = printTiles(n - m, m);

        // herizontal placement
        int hPLace = printTiles(n - 1, m);
        return vPlace + hPLace;
    };

    public static int callGuest(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int way1 = callGuest(n - 1);

        // pair
        int way2 = callGuest(n - 1) * callGuest(n - 2);
        return way1 + way2;
    }; 

    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        // if added
        subset.add(n);
        findSubsets(n-1, subset);

        // if not added
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }

    public static void main(String[] args) {
        // Permutation
        // String str = "abc";
        // printPermutations(str, "");

        // count paths
        // int n = 3, m = 3;
        // int total = countPath(0, 0, n, m);
        // System.out.println(total);

        // tiles placement
        // int n = 4, m = 2;
        // System.out.println(printTiles(n, m));

        // call guests in pairs or alone
        // int n = 4;
        // System.out.println(callGuest(n));

        // Set of natural n numbers
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);

    }

}
