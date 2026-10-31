import java.util.HashMap ;
public class PrefixModuloHashMap {
   public int subarrayDivByk(int[] nums, int k){
    HashMap<Integer, Integer> map = new HashMap <>();
    map.put(0, 1);
    int prefixsum = 0;
    int count = 0;
    for(int i = 0 ; i<nums.length ; i++){
        prefixsum = prefixsum + nums[i];
        int reminder = prefixsum % k ;
        if(reminder < 0){
            reminder = reminder + k;
        }
        if(map.containsKey(reminder)){
            count = count + map.get(reminder);
        }
        map.put ( reminder,
            map.getOrDefault(reminder, 0) + );
    }
    return count ;
   } 
}
