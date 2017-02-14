package addressbookexercise;

public class ExtPerson extends Person {
    private Address address;
    private String phoneNumber;
 
    public ExtPerson() {
        super();
        this.address = new Address();
    }
 
    public ExtPerson(String first, String last) {
        super(first, last);
        this.address = new Address();
    }
 
    public ExtPerson(String first, String last, Address address) {
        super(first, last);
        this.address = address;
    }
 
    public Address getAddress() {
        return address;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
 
    public String getPhoneNumber() {
        return phoneNumber;
    }
 
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ExtPerson other = (ExtPerson) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        } else if (!phoneNumber.equals(other.phoneNumber))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return super.toString() + "n" + address + "nPhone Number: "
                + phoneNumber + "n";
    }
 
    public ExtPerson copy() {
        ExtPerson person = new ExtPerson();
        person.setName(this.getFirstName(), this.getLastName());
        person.setAddress(this.getAddress());
        person.setPhoneNumber(this.getPhoneNumber());
        return person;
    }
 
    public void print() {
        System.out.println(this);
    }
}
