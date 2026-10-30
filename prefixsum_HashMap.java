import java.util.HashMap ;
public class prefixsum_HashMap {
    public static int countSubarrays(int[] nums, int k){
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0,1);
    int count  = 0 ;
    int prefixsum = 0 ;
    for(int  i=0 ; i<nums.length ; i++){
        prefixsum = prefixsum + nums[i];
        int required = prefixsum + k ;
        if(map.containsKey(required)){
            count = count + map.get(required);
        }
        map.put(prefixsum, 
            map.getOrDefault(prefixsum, 0) + 1
        );
    }
        return count ;
    }
}
