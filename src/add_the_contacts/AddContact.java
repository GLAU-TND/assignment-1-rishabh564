package add_the_contacts;

import checking_the_input.CheckInput;
import person_class.Person;

import java.util.Scanner;

public class AddContact {
    Person p = new Person();
    CheckInput ck = new CheckInput();


    // to check Contact Number & set this contact
    public boolean addNumber(String number) {
        if (ck.phoneNumber(number)) {
            p.setContactNumbers(number);
            return true;
        }
        return false;
    }

    // to check email & set this email
    public boolean addEmail(String mail) {
        if (ck.email(mail)) {
            p.setEmailAddress(mail);
            return true;
        }
        return false;
    }


    public Person addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have chosen to add a new contact:\nPlease enter the name of the Person");
        System.out.print("First Name: ");
        p.setFirstName(sc.nextLine());
        System.out.print("Last Name: ");
        p.setLastName(sc.nextLine());
        boolean a = true;


        // to add contacts of the person
        while (a) {
            System.out.print("Contact Number: ");
            String no = sc.nextLine();
            a = addNumber(no);
            if (!a) {
                System.out.println("It is invalid no, please re-enter");
                a = true;
                continue;
            }
            System.out.println("Do you like to add another contact number? (y/n): ");
            char c = (sc.nextLine()).charAt(0);
            if (c == 'y')
                a = true;
            else
                a = false;
        }


        // to add email address of the person
        System.out.println("Do you like to add email address? (y/n): y");
        char c = (sc.nextLine()).charAt(0);
        if (c == 'y') {
            System.out.print("Email Address: ");
            String mai = sc.nextLine();
            boolean a1 = addEmail(mai);
            while (!a1) {
                System.out.println("It is invalid email, please re-enter");
                System.out.print("Email Address: ");
                a1 = addEmail(sc.nextLine());
                continue;
            }
        }
        return p;


    }
}


