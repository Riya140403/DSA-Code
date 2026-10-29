public class Doubly_linked_list {
    class node{
        int data;
        node previous ;
        node next;
    }
    node head = null;
//   create a doubly linked list
public void create(int A[]){
    if ( A.length == 0){
        return ;
    }
    head = new node();
    head.data = A[0];
    head.previous = null ;
    head.next = null;
    node p = head ;
    for(int i = 1 ; i < A.length ; i++){
        node t = new node() ;
        t.data = A[i];
        t.previous = p ;
        t.next = null ;
        p.next = t ;
        p = t ;
    }
}
// insert at any position, Index starts from 0 
public void insert_at_any_position(int index , int val){
    if(index < 0){
        System.out.println("Invalid index");
        return ; 
    }
    if(index == 0){
        node t = new node();
        t.data = val ;
        t.previous = null;
        t.next = head ;
        if(head != null){
            head.previous = t ;
        } 
        head = t ;
        return ; 
    }
     node p =  head ;
     for( int i = 0 ; p != null && i < index - 1 ; i++){
        p = p.next;
     }

     if ( p != null){
        node t = new node();
        t.data = val ;
        t.next = p.next ;
        t.previous = p ;
        p.next = t;
        if ( t.next != null){
            t.next.previous = t ;
        }
     }
     else{
        System.out.println("Invalid position");
     }
}
// deletion from front 
public int deletion_from_front(){
    if(head == null){
        System.out.println("List is empty");
        return -1;
    }
    node p = head ;
    int x = p.data;
    head = head.next;
    if( head != null){
        head.previous = null ;
    }
    return x ;
}
// delete from any position
public int delete_at_any_position(int index){
    if(head == null){
        return -1 ;
    }
    if(index == 0){
        return delete_from_head();
    }
    node p = head ;
    for(int i = 0 ; p != null && i < index ; i++){
        p = p.next ;
    }
    if(p == null){
        System.out.println("Invalid position");
        return -1;
    }
    p.previous.next = p.next;
    if(p.next != null){
        p.next.previous = p.previous;
    }
    int x = p.data;
    return x ;
}
// forward traversal
public void traversal(){
    node p = head;
    while(p != null){
        System.out.println(p.data);
        p = p.next ;
    }
}

}

