package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> salaryMap = new HashMap<>();

        //Adding values
        salaryMap.put("Bob", 900);
        salaryMap.put("John", 900);
        salaryMap.put("Kate", 1900);

        System.out.println(salaryMap);

        //Get value from key
        System.out.println("Johns salary " + salaryMap.get("John"));

        //Get all key values
        System.out.println(salaryMap.keySet());

        //size
        System.out.println(salaryMap.size());

        //check if map contains value
        System.out.println(salaryMap.containsValue(900));
        System.out.println(salaryMap.containsKey("Katya"));

        //Remove key/value
        salaryMap.remove("Bob");
        System.out.println(salaryMap);

        //Example

        Map<String,String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia", "Tallinn");
        capitalCity.put("Finland","Helsinki");
        capitalCity.put("Latvia","Riga");

        System.out.println(capitalCity.get("Finland"));

        for(Map.Entry<String,String> entry: capitalCity.entrySet()){
            System.out.println(entry.getKey() + " has a capital city of " + entry.getValue());
        }
    }
}
