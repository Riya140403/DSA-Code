import java.util.*;

public class Kadanes_Algorithm {
    public static void main(String [] args){

        int[] arr = {3, -4, 5, 4, -1, 7, -8};

        int n = arr.length;

        int currSum= 0;

        int maxSum = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){

            currSum+= arr[i];

            maxSum = Math.max(currSum, maxSum);

            if(currSum < 0 ){
                currSum = 0 ;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}
