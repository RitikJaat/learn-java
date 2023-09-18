import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashingMap {
    public static void main(String[] args) {
        HashMap<String, Integer> country = new HashMap<>();
        country.put("Bharat", 120);
        country.put("China", 150);
        country.put("USA", 30);
        // prints in reverse order

        System.out.println(country);

        country.put("China", 180);
        System.out.println(country);

        // search
        if (country.containsKey("Italy")) {
            System.err.println("Present in the map");
        } else {
            System.err.println("Key is not present in the map");
        }

        System.out.println(country.get("China"));
        System.out.println(country.get("Russia"));

        System.out.println();
        int arr[]= {12,13,18};
        // for(int i = 0; i<3;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        for(int val: arr){
            System.out.print(val + " " );
        }
        System.out.println();

        for( Map.Entry<String, Integer> e : country.entrySet()){ 
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println();

        Set<String> keys = country.keySet();
        for(String key : keys){
            System.out.println(key+ " "+ country.get(key));
        }

        // remove element
        country.remove("China");
        System.out.println(country);
    }
}
