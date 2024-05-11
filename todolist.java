import java.util.*;

public class todolist {
    static ArrayList<String> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("\n\n                Welcome to your To-Do-List                           ");
        menu();
    }

    public static void menu() {
        System.out.println("\n\n                              M E N U                                    ");
        System.out.println("Please select your desirable option from below:");
        System.out.println("\n1. View List. \n2. Add Item to list. \n3. Remove element from the list. \n4. Exit.");
        System.out.print("\nEnter your Choice: ");
        String s = sc.nextLine();
        switch (s) {
            case "1":
                viewlist();
                break;
            case "2":
                additem();
                break;

            case "3":
                remove();
                break;
            case "4":
                System.exit(0);

            default:
                System.out.println("INVALID INPUT");
                menu();
                break;
        }

    }

    static void viewlist() {
        if (list.isEmpty()) {
            System.out.println("\nList is Empty. sorry.");
            menu();
        } else {
            System.out.println("Your List:");
            System.out.println(list);
            System.out.println("\n                           Thank You.                               ");
            menu();
        }
    }

    static void additem() {
        System.out.println("\n\n                            ADD YOUR ELEMENT                           ");
        System.out.print("\n\nEnter the element you want to add: ");
        String s = sc.nextLine();
        System.out.print("\nIs there any desirable position you want to add the element (y/n): ");
        String choice = sc.nextLine();
        if (choice == "y") {
            System.out.print("\nEnter the desirable position: ");
            int i = sc.nextInt();
            list.add(i, s);

        } else {
            list.add(s);
            System.out.println("!!ELEMENT SUCCESFULLY ADDED.");

            menu();
        }

    }

    static void remove() {
        System.out.println("\n\n                         REMOVE ELEMENT                         ");
        System.out.print("Enter the element you want to delet from the List: ");
        String s = sc.nextLine();
        if (list.contains(s)) {
            list.remove(s);
            System.out.println("!!ELEMENT SUCCESFULLY REMOVED.");
        } else {
            System.out.println("\nELEMENT NOT FOUND!!!!!");
        }
        menu();
    }
}
