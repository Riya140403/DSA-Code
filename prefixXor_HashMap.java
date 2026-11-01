import java.util.HashMap;
public class prefixXor_HashMap {
    public int prefixXor(int []nums, int k ){
        HashMap<Integer, Integer> map = new HashMap <> ();
        map.put(0, 1);
        int prefixXor = 0;
        int count = 0;
        for(int i = 0; i<nums.length ; i++){
            prefixXor = prefixXor ^ nums[i] ;
            int required = prefixXor ^ k;
            if(map.comtainsKey(required)){
                count = count + map.get(required)
            }
             map.put(prefixXor,
            map.getOrDefault(prefixXor, 0) + 1 );
        }
        return count ;
        }

}
