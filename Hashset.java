import java.util.HashSet;
import java.util.Iterator;// whwenever we use iterator we should have to be import the iterator.
public class Hashset {
    public static void main(String args []){
        //creating hashset
        HashSet<Integer> set = new HashSet<>();
        //Arraylist<Integer> list = new Arraylist<>();
        //inset 
        set.add(4);
        set.add(2);
        set.add(3);
        //search
        if(set.contains(4)){
            System.out.println("4 is present in the set");  
        }
        if(!set.contains(6)){
            System.out.println("6 is not present in the set");  
        }
        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("1 is not present in the set");
        }
        //size
        System.out.println("size of set is :" + set.size());
        //print all elements
        System.out.println(set);
        //iterator
        Iterator it = set.iterator();
        //hashNext; next 
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
