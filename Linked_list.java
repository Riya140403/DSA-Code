public class Linked_list {

    class node {
        int data;
        node next;
    }

    node head = null;
// 
// Create linked list from an array
// 
    public void create(int A[]) {

        if (A.length == 0) {
            return;
        }

        head = new node();

        head.data = A[0];
        head.next = null;

        node p = head;
        node t;

        for (int i = 1; i < A.length; i++) {

            t = new node();

            t.data = A[i];
            t.next = null;

            p.next = t;

            p = t;
        }
    }
// 
// Insert at front
// 
    public void insertatfront(int value) {

        node t = new node();

        t.data = value;

        t.next = head;

        head = t;
    }
// 
// Insert at any position
// Index starts from 0
// 
    public void insertat_anyposition(int index, int val) {

        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {

            insertatfront(val);

            return;
        }

        node p = head;

        for (int i = 0; p != null && i < index - 1; i++) {

            p = p.next;
        }

        if (p != null) {

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
// Delete at front
// 
    public int delete_at_front() {

        if (head == null) {

            System.out.println("Linked List is empty");

            return -1;
        }

        int x = head.data;

        head = head.next;

        return x;
    }
// 
// Delete at any position
// Index starts from 0
// 
    public int delete_at_any_position(int index) {

        if (head == null) {

            System.out.println("Linked List is empty");

            return -1;
        }

        if (index < 0) {

            System.out.println("Invalid index");

            return -1;
        }

        if (index == 0) {

            return delete_at_front();
        }

        node p = head;

        for (int i = 0; p != null && i < index - 1; i++) {

            p = p.next;
        }

        if (p != null && p.next != null) {

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

        node p = head;

        while (p != null) {

            System.out.println(
                "Value in the linked list : " + p.data
            );

            p = p.next;
        }
    }
//
// Count nodes
//
    public void count() {

        int count = 0;

        node p = head;

        while (p != null) {

            count++;

            p = p.next;
        }

        System.out.println(
            "Number of elements in the linked list : " + count
        );
    }
//
// Sum of all nodes
//
    public void sum() {

        int sum = 0;

        node p = head;

        while (p != null) {

            sum = sum + p.data;

            p = p.next;
        }

        System.out.println(
            "Sum of all elements : " + sum
        );
    }
// 
// Maximum element
// 
    public void max() {

        if (head == null) {

            System.out.println("Linked List is empty");

            return;
        }

        int max = head.data;

        node p = head;

        while (p != null) {

            if (p.data > max) {

                max = p.data;
            }

            p = p.next;
        }

        System.out.println(
            "Maximum element : " + max
        );
    }
// 
// Linear Search
// 
    public node linearSearch(int key) {

        node p = head;

        while (p != null) {

            if (p.data == key) {

                return p;
            }

            p = p.next;
        }

        return null;
    }
// 
// Recursive Traversal - Reverse
// 
    public void recursive_display(node p) {

        if (p != null) {

            recursive_display(p.next);

            System.out.println(p.data);
        }
    }
// 
// Method to call recursive traversal
// 
    public void recursiveTraversal() {

        recursive_display(head);
    }
}