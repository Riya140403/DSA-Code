import java.io.*;
import java.util.*;
public class Hasharray{
    public void numberfrequency(int a[],int hash[]){
        for (int i=0 ; i<a.length ; i++){
            hash[a[i]]++;
        }
        for (int j=0; j<hash.length ; j++){
            if(hash[j]>0){
                System.out.println(j+""+"occurs"+""+hash[j]+"times");
            }
        }
    }
}