import java.util.HashMap ;
public class PairCounting {
    public static int countPairs(int[]nums, int k){
        HashMap<Integer, Integer> map = new HashMap<> ();
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int required = k - nums[i];
            if(map.containskey(required)){
                count+ = map.get(required);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        return count ;
    }
    
}
