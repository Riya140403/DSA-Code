import java.util.Scanner;
public class Hashcharcall{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of array");
        int n = sc.nextInt();
        char a[]= new char[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.next().charAt(0);
        }
        int hash[] = new int[256];
        Hashchar obj = new Hashchar();
        obj.numberfrequency(a,hash);
    }
}