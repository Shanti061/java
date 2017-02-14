package addressbookexercise;

import java.io.File;

public class AddressBookTest {
 
    public static void printLine() {
        for (int i = 0; i < 80; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
 
        printLine();
        System.out.print("Loading contacts from file...");
        try {    	
        	System.out.println(System.getProperty("user.dir")); //get default directory
            addressBook.loadDataFromFile(new File("contacts.txt"));
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("FAILED");
        }
        printLine();
 
        addressBook.printAllContacts();
 
        printLine();
        System.out.print("Sorting contacts by last name...");
        addressBook.sortByLastName();
        System.out.println("OK");
        printLine();
 
        addressBook.printAllContacts();
 
        printLine();
        System.out.println("Contacts with last name from 'A' to 'D'");
        printLine();
        addressBook.printContactsRange("A", "D");
 
        System.out.println();
 
        printLine();
        System.out.print("Searching contact with last equal to 'Smith'...");
        ExtPerson person = addressBook.searchByLastName("Smith");
        if (person == null) {
            System.out.println("NOT FOUND");
            printLine();
        } else {
            System.out.println("FOUND");
            printLine();
            System.out.println(person);
        }
    }
}