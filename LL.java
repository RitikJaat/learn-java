import java.util.*;

public class LL {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();
        
        list.add( "a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("This");
        list.addLast("LinkedList");
        System.out.println(list);

        System.out.println("Size of the list is "+list.size());


        if(list.get(1)=="a"){
            System.out.println("lol");
        }else{}

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> "); 
        }
        System.out.println("null");
    }
}
