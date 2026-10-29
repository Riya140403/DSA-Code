public class circular_linkedlist {

    class node {
        int data;
        node next;
    }

    node head = null;
// 
// Create circular linked list
//
    public void create(int A[]) {

        if (A.length == 0) {
            return;
        }

        head = new node();

        head.data = A[0];
        head.next = head;

        node p = head;
        node t;

        for (int i = 1; i < A.length; i++) {

            t = new node();

            t.data = A[i];

            t.next = head;

            p.next = t;

            p = t;
        }
    }
// 
// Insert at any position
// index starts from 0
// 
    public void insert(int index, int val) {

        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
// 
// Insert at beginning
// 
        if (index == 0) {

            node t = new node();

            t.data = val;
            if (head == null) {

                t.next = t;

                head = t;
            }
            else {

                node p = head;

                while (p.next != head) {

                    p = p.next;
                }

                t.next = head;

                p.next = t;

                head = t;
            }

            return;
        }
// 
// Insert at other position
// 
        if (head == null) {

            System.out.println("Invalid position");

            return;
        }

        node p = head;

        int i;

        for (i = 0;
             p.next != head && i < index - 1;
             i++) {

            p = p.next;
        }


        if (i == index - 1) {

            node t = new node();

            t.data = val;

            t.next = p.next;

            p.next = t;
        }

        else {

            System.out.println("Invalid position");
        }
    }
// 
// Delete at any position
// index starts from 0
// 
    public int delete(int index) {

        if (head == null) {

            System.out.println("Circular Linked List is empty");

            return -1;
        }


        if (index < 0) {

            System.out.println("Invalid index");

            return -1;
        }

// 
// Delete first node
// 
        if (index == 0) {

            int x = head.data;
            if (head.next == head) {

                head = null;

                return x;
            }
            node p = head;

            while (p.next != head) {

                p = p.next;
            }

            head = head.next;

            p.next = head;

            return x;
        }


        // Delete at other position
        node p = head;

        int i;

        for (i = 0;
             i < index - 1 && p.next != head;
             i++) {

            p = p.next;
        }


        if (i == index - 1 && p.next != head) {

            node t = p.next;

            p.next = t.next;

            int x = t.data;

            return x;
        }


        System.out.println("Invalid position");

        return -1;
    }
 //
 // Traversal
// 
    public void traversal() {

        if (head == null) {

            System.out.println("Circular Linked List is empty");

            return;
        }

        node p = head;

        do {

            System.out.println(p.data);

            p = p.next;

        } while (p != head);
    }
}