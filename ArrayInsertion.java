import java.io.*;
import java.util.Scanner;
public class ArrayInsertion{
    int size = 0;
    public int[] insertion (int [] a , int value , int pos ) throws Exception{
        if ( size + 1 > a.length ){
            throw new  Exception ( " Overflow ");
        }
        else if ( pos < 0 || pos > size ){
            throw new Exception ( " Invalid Position ");
        }
        else {
            for ( int i = size - 1 ; i > pos; i-- ){
                a [ i+1 ]  = a[ i ];
            }
            a[ pos ] = value;
        }
        return a;
    }
    public int [] append ( int [] a, int value ) throws Exception{
        if ( size + 1 > a.length ){
            throw new  Exception ( " Overflow ");
        }
        else {
            a [ size ] = value;
            size ++;
        }
        return a;
    }
    public int [] delete( int index,int[] a) throws Exception{
        if(index < 0 || index >= size){
           throw new Exception ( " Invalid Position "); 
        }
        for(int i= index ; i<size-1 ; i++){
            a[i] = a[i+1];
        }
        size -- ;
        return a ;
    }

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in the array");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value to be insert");
        int value = sc.nextInt();
        System.out.println("enter the position ");
        int pos = sc.nextInt();
        for(int i=n; i>pos ; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = value ; 
        n++;
        System.out.println("Array after insertion");
        for(int i=0 ; i<n ; i++){
            System.out.println(arr[i]+"");
        }*/
}
