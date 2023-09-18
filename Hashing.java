import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        
        System.out.println("Printing whole set "+set);
        System.out.println("Size of set "+set.size());
        //  search
        if(set.contains(1)){
            System.out.println("Contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Does not contains");
        }

        // delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contains ");
        }

        //  size
        System.out.println("Size of set "+set.size());

        // print all set
        System.out.println("Printing whole set "+set);

        // Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // hasNext
        // prints T/F only (false only at last element)
        // next
        //  print elements as it is (still not guranted that all elements will be printed in order)
    }
}
