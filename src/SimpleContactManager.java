import java.util.ArrayList;
import java.util.Scanner;

public class SimpleContactManager {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        while (true) {
            System.out.println("\n--- Contact Manager ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact added successfully!");
    }

    private void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }

    private void editContact() {
        System.out.print("Enter the number of the contact to edit: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();  // Clear the buffer

        if (index >= 0 && index < contacts.size()) {
            Contact contact = contacts.get(index);

            System.out.print("Enter new name (leave blank to keep current): ");
            String name = scanner.nextLine();
            if (!name.isBlank()) {
                contact.setName(name);
            }

            System.out.print("Enter new phone (leave blank to keep current): ");
            String phone = scanner.nextLine();
            if (!phone.isBlank()) {
                contact.setPhone(phone);
            }

            System.out.print("Enter new email (leave blank to keep current): ");
            String email = scanner.nextLine();
            if (!email.isBlank()) {
                contact.setEmail(email);
            }

            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Invalid contact number.");
        }
    }

    private void deleteContact() {
        System.out.print("Enter the number of the contact to delete: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();  // Clear the buffer

        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Invalid contact number.");
        }
    }

    public static void main(String[] args) {
        SimpleContactManager manager = new SimpleContactManager();
        manager.showMenu();
    }
}
