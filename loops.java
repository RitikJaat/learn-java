import java.util.*;

public class loops {
    public static void main(String args[]){
        Scanner options = new Scanner(System.in);
        System.out.println("Choose from the given Loops ");
        System.out.println("1). For Loop");
        System.out.println("2). While Loop");
        System.out.println("3). Do While Loop");
        System.out.println("4). Nested For Loop Stars");
        System.out.println("5). Table");
        int option = options.nextInt();

        switch (option) {
            case 1 : 
                System.out.print("run loop till ?");
                Scanner forl = new Scanner(System.in);
                int forloop = forl.nextInt();

                for(int i = 0; i <= forloop; i++){
                    System.out.println(i);
                }
                break;
                
                case 2 :System.out.print("Run this loop until?");
                // Scanner whil = new Scanner(System.in);
                int whilloop =  options.nextInt();

                int j = 0;
                while (j < whilloop) {
                    j++;
                    System.out.println(j);
                }
                break;

                case 3:System.out.print("Counter ?");
                Scanner dowh = new Scanner(System.in);
                int dowhil = dowh.nextInt();
                
                int k = 1;
                do{
                    System.out.println(k);
                } while( k < dowhil ); {
                    k++;
                    System.out.println(k);
                }// in do while we need ; to end.
                break;

                case 4:System.out.print("Enter no of Stars ");
                Scanner star = new Scanner(System.in);
                int stars = star.nextInt();

                for(int row = 1; row <= stars ; row++){
                    for(int n = 1; n <= row; n++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

                case 5: System.out.print("Plese enter the of Table you would like ");
                Scanner tabl = new Scanner(System.in);
                int table = tabl.nextInt();

                for (int t = 1; t<=10 ; t++){
                    System.out.println(t * table);
                }
                break;

            default:
            System.out.println("Plese choose a Valid option.");
                break;
        }
        options.close();
    }
    
}
