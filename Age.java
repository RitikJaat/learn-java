import java.util.*;

public class Age {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Name :-");
        String name = sc.nextLine();
        
        System.out.print("Birth Year :- ");
        int age = sc.nextInt();
        
        // Scanner a = new Scanner(System.in); // way 2 of doing;
        // int age = a.nextInt();
        
        System.out.print("Currnt Year :- ");
        int date = sc.nextInt(); // taking 1st value

        int yrold = date - age; // calculation;

        
        if (yrold > 18) {
            System.out.println(name + " is a Adult and " + yrold + " years old.");
        } else {
            System.out.println(name + " is not a Adult and " + yrold + " years old.");
        }
        sc.close();
    }
}
