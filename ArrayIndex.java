import java.io.*;
import java.util.*;
public class ArrayIndex {
    public static int indexof(int[]A,int target,int index){
        for(int i =index; i<A.length; i++){
            if(A[i]==target){
                return i + 1 ;
            }
            
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] A ={4,5,67,2,3,7,8,9};
        System.out.println("Enter the element that i want to search");
        int target = sc.nextInt();
        System.out.println("Enter the index ");
        int index =sc.nextInt();
        int result = indexof(A,target,index);
        if(result != -1){
            System.out.println("Element" + target + "found at index " +  result);
        }
        else{
            System.out.println("Element" + target + " not found at index " );
        }
    }
}