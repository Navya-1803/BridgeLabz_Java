import java.util.Scanner;

public class AddressBook {
    private ContactPerson[] contacts = new ContactPerson[100];

    private int contactCount = 0;

    public void addContact(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Person's contact details");

        System.out.println("Enter First Name: ");
        String firstName = scanner.next();

        System.out.println("Enter Last Name: ");
        String lastName = scanner.next();

        System.out.println("Enter the Address: ");
        String address = scanner.next();

        System.out.println("Enter the city: ");
        String city = scanner.next();

        System.out.println("Enter the state: ");
        String state = scanner.next();

        System.out.println("Enter the zip");
        int zip = scanner.nextInt();

        System.out.println("Enter the Phone Number");
        long phoneNumber = scanner.nextLong();

        System.out.println("Enter the email");
        String email = scanner.next();

        ContactPerson contact = new ContactPerson(firstName,lastName, address, city, state, zip, phoneNumber, email);
        contacts[contactCount] = contact;
        contactCount++;

    }
}
