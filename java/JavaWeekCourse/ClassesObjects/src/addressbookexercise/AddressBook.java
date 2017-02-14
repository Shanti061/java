package addressbookexercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddressBook {
    private ExtPerson[] contacts = new ExtPerson[100];
    private int count;
 
    public void loadDataFromFile(File file) throws FileNotFoundException {
        clear();
        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] data = line.split(",");
            // [0] Last name
            // [1] First name
            // [2] Street address
            // [3] City
            // [4] State
            // [5] Zip code
            // [6] Phone number
            ExtPerson person = new ExtPerson();
            person.setName(data[1], data[0]);
            person.setAddress(new Address(data[2], data[3], data[4], data[5]));
            person.setPhoneNumber(data[6]);
            contacts[count++] = person;
        }
        fileReader.close();
    }
 
    private void clear() {
        for (int i = 0; i < count; i++) {
            contacts[i] = null;
        }
        count = 0;
    }
 
    public void sortByLastName() {
        // Bubble Sort
        for (int i = 0; i < count - 1; i++) {
            String lastName1 = contacts[i].getLastName();
            for (int j = i + 1; j < count; j++) {
                String lastName2 = contacts[j].getLastName();
                if (lastName1.compareToIgnoreCase(lastName2) > 0) {
                    // Swap
                    ExtPerson temp = contacts[i];
                    contacts[i] = contacts[j];
                    contacts[j] = temp;
                }
            }
        }
    }
 
    public ExtPerson searchByLastName(String lastName) {
        // Sequential Search
        ExtPerson person = null;
        for (int i = 0; i < count; i++) {
            ExtPerson p = contacts[i];
            if (p.getLastName().equalsIgnoreCase(lastName)) {
                person = p;
                break;
            }
        }
        return person;
    }
 
    /**
     * Print the names of all the people between two given last names
     */
    public void printContactsRange(String lastName1, String lastName2) {
        for (int i = 0; i < count; i++) {
            ExtPerson p = contacts[i];
            boolean lowerBound = p.getLastName().compareToIgnoreCase(lastName1) > 0;
            boolean upperBound = p.getLastName().compareToIgnoreCase(lastName2) < 0;
            if (lowerBound && upperBound) {
                System.out.println(p.getLastName() + " " + p.getFirstName());
            }
        }
    }
 
    public void printAllContacts() {
        for (int i = 0; i < count; i++) {
            System.out.println(contacts[i]);
        }
    }
}
