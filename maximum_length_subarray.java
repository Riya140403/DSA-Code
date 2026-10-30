import java.util.HashMap;
public class maximum_length_subarray{
    public static int sublength(int nums[], int k){
        HashMap <Integer, Integer> map = new HashMap <> ();
        map.put(0, -1);
        int prefixsum = 0;
        int maxlength = 0 ;
        for(int i=0 ; i<nums.length ; i++){
            prefixsum = prefixsum + nums[i];
            if(map.containsKey(prefixsum-k)){
                int previousindex = map.get(prefixsum - k);
                int length = i - previousindex ;
                maxlength = Math.max(length, maxlength );
            }
            if(!map.containsKey(prefixsum)){
                map.put(prefixsum, i);
            }
        }
        return maxlength;
    }
}