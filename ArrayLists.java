import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<>();


        // adding elements in intergers arraylist
        // it add elements at last alwyas 
        list.add(0);
        list.add(2);
        list.add(5);

        System.out.println("_________List After Add___________");
        System.out.println(list);
        
        // get elements;
        int element = list.get(2); // index starts from 0;
        System.out.println("_____Printing single element from arraylist_______");
        System.out.println(element);
        
        // add element inbetwwen
        list.add(1,1); // it works like (index, value to add)
        list.add(3,3);
        list.add(4,6);
        System.out.println("_________List After Adding inbetween___________");
        System.out.println(list);
        
        // set element
        list.set(4,4); // same( index, value)
        list.set(0,7); // same( index, value)
        System.out.println("_________List After set___________");
        System.out.println(list);
        
        // delete element
        list.remove(5); // (index) to delete
        System.out.println("_________List After remove/delete___________");
        System.out.println(list);

        // size of arraylist
        int size = list.size();
        System.out.println("_______Size of Arrylist_______");
        System.out.println(size);

        // loops
        System.out.println("____Using for loop_____");
        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();


        // sorting
        Collections.sort(list);
        System.out.println("_____Arraylist after sort_______");
        System.out.println(list);   
    }
}
