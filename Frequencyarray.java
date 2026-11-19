public class Frequencyarray {
    public static void main(String [] args ){
        int[] nums ={2,3,2,5,3,2} ;
        int [] freq = new int[10] ;
        for(int i=0 ; i < nums.length ; i++){
            freq [nums[i]]++ ;
        }
        for(int i=0 ; i < freq.length ; i++ ){
            if(freq[i] > 0){
                System.out.println(i + "appears" + freq[i] + "times");
            }
        }
    }
}
