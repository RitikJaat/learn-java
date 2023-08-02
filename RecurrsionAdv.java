import java.util.*;

public class RecurrsionAdv {
    public static void printPermutations(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            // "abc" -> "ab" or "bc" or "ac"
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutations(newStr, permutation+currentChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");

    }

}
