import java.util.Scanner;

public class circular_linked_main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        circular_linkedlist list = new circular_linkedlist();

        int choice;

        do {

            System.out.println();
            System.out.println("====== CIRCULAR LINKED LIST MENU ======");
            System.out.println("1. Create Circular Linked List");
            System.out.println("2. Insert at Any Position");
            System.out.println("3. Delete at Any Position");
            System.out.println("4. Traversal");
            System.out.println("0. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter number of elements : ");
                    int n = sc.nextInt();

                    int A[] = new int[n];

                    for (int i = 0; i < n; i++) {

                        System.out.print(
                            "Enter element " + (i + 1) + " : "
                        );

                        A[i] = sc.nextInt();
                    }

                    list.create(A);

                    System.out.println(
                        "Circular Linked List created successfully."
                    );

                    System.out.println("Current Circular Linked List:");
                    list.traversal();

                    break;


                case 2:

                    System.out.print(
                        "Enter position to insert : "
                    );

                    int index = sc.nextInt();

                    System.out.print(
                        "Enter value to insert : "
                    );

                    int value = sc.nextInt();

                    list.insert(index, value);

                    System.out.println(
                        "Insertion operation completed."
                    );

                    System.out.println(
                        "Circular Linked List after insertion:"
                    );

                    list.traversal();

                    break;


                case 3:

                    System.out.print(
                        "Enter position to delete : "
                    );

                    int deleteIndex = sc.nextInt();

                    int deletedValue =
                        list.delete(deleteIndex);

                    if (deletedValue != -1) {

                        System.out.println(
                            "Deleted element : "
                            + deletedValue
                        );

                        System.out.println(
                            "Circular Linked List after deletion:"
                        );

                        list.traversal();
                    }

                    break;


                case 4:

                    System.out.println(
                        "Circular Linked List elements:"
                    );

                    list.traversal();

                    break;


                case 0:

                    System.out.println(
                        "Program terminated."
                    );

                    break;


                default:

                    System.out.println(
                        "Invalid choice."
                    );
            }

        } while (choice != 0);

        sc.close();
    }
}