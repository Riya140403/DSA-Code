import java.util.*;

public class MaximumSubarrayBruteForce {
   public static void main(String[] args){

        int[] arr = {3, -4, 5, 4, -1, 7, -8};

        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;

        for(int start = 0 ; start < n ; start++){

            int currsum = 0;

            for(int end = start ; end < n ; end++  ){

                currsum+= arr[end];

                maxSum = Math.max(currsum, maxSum);

            }
        }
        System.out.println("Maximum Subarray Sum = " + maxSum);
   }  
}
