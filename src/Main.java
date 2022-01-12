import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Contacts contacts = new Contacts();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contacts.printContactList();
                    break;
                case 2:
                    addContactInfo();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    System.out.println("Closing application...");
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a new contact to the list.");
        System.out.println("\t 3 - To update a contact from the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application\n");
    }

    public static void addContactInfo() {
        System.out.println("Please enter the name and phone number: ");
        contacts.addContact(sc.nextLine(), sc.nextLine());
    }

    public static void updateContact() {
        System.out.println("Enter contact name: ");
        String oldName = sc.nextLine();
        if(!contacts.onFile(oldName)) {
            System.out.println(oldName + " is not in the contact list");
        } else {
            System.out.println("Enter the updated name: ");
            String newName = sc.nextLine();
            contacts.modifyContact(oldName, newName);
        }

    }

    public static void removeContact() {
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        if(!contacts.onFile(name)) {
            System.out.println(name + " not found in the contact list");
        } else {
            contacts.removeContact(name);
        }
    }

    public static void searchForContact() {
        System.out.println("Name to search for: ");
        String searchName = sc.nextLine();
        if(contacts.onFile(searchName)) {
            System.out.println("Found " + searchName + " in the contact list");
        } else {
            System.out.println(searchName + " not found in your contact list");
        }
    }





}
