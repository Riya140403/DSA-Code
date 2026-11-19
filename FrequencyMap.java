import java.util.HashMap;
public class FrequencyMap {
    public static void main ( String[] args){
        int [] nums ={1000, -5, 1000, 7, -5, 1000}
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i=0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map);
    }
    
}
