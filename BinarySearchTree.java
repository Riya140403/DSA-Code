import java.util.ArrayDeque;

public class BinarySearchTree {
    class Node{
        Node l_child ;
        int data ;
        Node r_child;

    }
    class main{
        static Node root ;
        public static void main (Strings arg[]){
            int A[] = { 10,20,30,40,50,60,70 }
            ArrayDeque<Node> q = new ArrayDeque();
            root = new Node ();
            root.data = A[0];
            root.l_child = root.r_child = null;
            q.addLast(root);
            int i =1;
            Node temp ,next ;
            while(i < A.length){
                next = q.removeFirst();
                // left child
                temp = new Node() ;
                temp.data = A[i++];
                temp.l_child = temp.r_child =null;
                next.l_child =temp;
                q.addLast(temp);

                // right child
                temp = new Node();
                temp.data = A[i++];
                temp.l_child = temp.r_child = null;
                next.l_child = temp ;
                q.addLast(temp) ;

            }
        }
    }
    
}
