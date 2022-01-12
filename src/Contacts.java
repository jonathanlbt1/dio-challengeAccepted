import java.util.ArrayList;

public class Contacts {

    private String name;
    private String phoneNumber;
    private ArrayList<String> contactList = new ArrayList<String>();

    public void addContact(String name, String phoneNumber) {
        contactList.add(name);
        contactList.add(phoneNumber);
    }

    public void printContactList() {
        System.out.println("You have " + contactList.size() / 2 + " names in your contact list");
        for(int i = 0; i < contactList.size(); i++) {
            System.out.println("\t" + contactList.get(i));
    }
    }

    private void modifyContact(int position, String newName){
        contactList.set(position, newName);
        System.out.println("Contact name " + newName + " has been modified.");
    }

    public void modifyContact(String currentName, String newName) {
        int position = findName(currentName);
        if (position >= 0) {
            modifyContact(position, newName);
        }
    }

    private int findName(String searchName) {
        return contactList.indexOf(searchName);
    }

    public void removeContact(String name) {
        int position = findName(name);
        if(position >= 0) {
            removeContact(position);
        }
    }

    private void removeContact(int position) {
        contactList.remove(position);
        contactList.remove(position);
    }

    public boolean onFile(String searchName) {
        int position = findName(searchName);
        if(position >= 0) {
            return true;
        }
        return false;
    }


}
