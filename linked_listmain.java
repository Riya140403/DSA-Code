import java.util.Scanner;

public class linked_listmain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Linked_list list = new Linked_list();

        int choice;

        do {

            System.out.println();
            System.out.println("========== LINKED LIST MENU ==========");
            System.out.println("1. Create Linked List");
            System.out.println("2. Insert at Front");
            System.out.println("3. Insert at Any Position");
            System.out.println("4. Delete at Front");
            System.out.println("5. Delete at Any Position");
            System.out.println("6. Traversal");
            System.out.println("7. Count Nodes");
            System.out.println("8. Sum of Nodes");
            System.out.println("9. Maximum Element");
            System.out.println("10. Linear Search");
            System.out.println("11. Recursive Traversal");
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
                        "Linked List created successfully."
                    );

                    System.out.println("Current Linked List:");
                    list.traversal();

                    break;


                case 2:

                    System.out.print(
                        "Enter value to insert at front : "
                    );

                    int frontValue = sc.nextInt();

                    list.insertatfront(frontValue);

                    System.out.println(
                        "Value inserted successfully."
                    );

                    System.out.println("Updated Linked List:");
                    list.traversal();

                    break;


                case 3:

                    System.out.print(
                        "Enter position : "
                    );

                    int position = sc.nextInt();

                    System.out.print(
                        "Enter value : "
                    );

                    int value = sc.nextInt();

                    list.insertat_anyposition(
                        position,
                        value
                    );

                    System.out.println("Updated Linked List:");
                    list.traversal();

                    break;


                case 4:

                    int deletedFront =
                        list.delete_at_front();

                    if (deletedFront != -1) {

                        System.out.println(
                            "Deleted element : "
                            + deletedFront
                        );

                        System.out.println(
                            "Updated Linked List:"
                        );

                        list.traversal();
                    }

                    break;


                case 5:

                    System.out.print(
                        "Enter position to delete : "
                    );

                    int deletePosition =
                        sc.nextInt();

                    int deletedValue =
                        list.delete_at_any_position(
                            deletePosition
                        );

                    if (deletedValue != -1) {

                        System.out.println(
                            "Deleted element : "
                            + deletedValue
                        );

                        System.out.println(
                            "Updated Linked List:"
                        );

                        list.traversal();
                    }

                    break;


                case 6:

                    System.out.println(
                        "Linked List elements:"
                    );

                    list.traversal();

                    break;


                case 7:

                    list.count();

                    break;


                case 8:

                    list.sum();

                    break;


                case 9:

                    list.max();

                    break;


                case 10:

                    System.out.print(
                        "Enter value to search : "
                    );

                    int key = sc.nextInt();

                    Linked_list.node result =
                        list.linearSearch(key);

                    if (result != null) {

                        System.out.println(
                            "Element found : "
                            + result.data
                        );
                    }

                    else {

                        System.out.println(
                            "Element not found."
                        );
                    }

                    break;


                case 11:

                    System.out.println(
                        "Recursive traversal:"
                    );

                    list.recursiveTraversal();

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