import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Hashmap{
    public static void main(String args []){
        HashMap<String, Integer > map = new HashMap<>();
        map.put("India",120);
        map.put("USA", 200);
        map.put("China", 150); 
        System.out.println(map);
        map.put("India", 130);
        System.out.println(map);

        //search
         if(map.containsKey("England")){
            System.out.println("Key is present in the map");
         }else{
            System.out.println("Key is not present in the map");

         }
         System.out.println(map.get("China"));
         System.out.println(map.get("England"));
         
         int arr[] = {12,13,14,15};
         for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
         for(int val : arr){
            System.out.print(val + " ");
         }
         for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
         }
         Set<String> keys = map.keySet();
         for(String key : keys){
            System.out.println(key+" "+ map.get(key));
         }
         map.remove("China");
         System.out.println(map);
    }
}