package contact;

import java.util.Scanner;

public class ContactManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicContactManager basicContactManager = new BasicContactManager();

        while (true) {
            System.out.println("Select an action: ");
            System.out.println("Add contact : 1");
            System.out.println("Update contact : 2");
            System.out.println("delete contact : 3 ");
            System.out.println("Show all contact : 4");
            System.out.println("Exit : 0");

            int choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise) {
                case 1:
                    System.out.println("enter name cotact");
                    String name = scanner.nextLine();
                    System.out.println("enter number contact: ");
                    String numberContact = scanner.nextLine();
                    basicContactManager.addContact(new Contact(name, numberContact));
                    break;

                case 2:
                    System.out.println("Enter name for update");
                    String editName = scanner.nextLine();
                    System.out.println("Enter new number");
                    String newNumber = scanner.nextLine();
                    basicContactManager.editContact(editName, new Contact(editName,newNumber));
                    break;

                case 3:
                    System.out.println("Enter name for delete");
                    String deleteContact = scanner.nextLine();
                    basicContactManager.deleteContact(deleteContact);
                    break;

                case 4:
                    basicContactManager.displayAllContact();
                    break;

                case 0:
                    System.out.println("exit ");
                    break;

                default:
                    System.out.println("not true choise");

            }
        }
    }
}
