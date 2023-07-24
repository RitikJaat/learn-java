import java.util.*;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter First Name : ");
        // String name = sc.next();
        // System.out.print("Enter Last Name : ");
        // String lName = sc.next();
        // // Concatenation.
        // String fname = name + " " + lName;
        // System.out.println(fname);
        // // lenght()
        // System.out.println("Length of full name is " + fname.length());
    
        // charAT()
        // for(int i = 0; i<fname.length();i++){
        //     System.out.print(fname.charAt(i));
        // }

        // compare 
        // 1.  string1 > string2 : postive value(can be anything)
        // 2.  string1 == string2 : 0
        // 3.  string1 < string2 : negetive value
    
        // if(name.compareTo(fname)==0){
        //     System.out.println("Strings are equal.");
        // }else {
        //     System.out.println("Strings are not equal.");
        // }

        // Substream;
        String Sentance = "This is a Sentance";
        String test = Sentance.substring(10, Sentance.length());
        // String test = Sentance.substring(10); // same as above. ending to last by default
        System.out.println(test);
        sc.close();
    }
}
