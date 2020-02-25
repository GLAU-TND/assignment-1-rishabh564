package delete_the_contacts;

import person_class.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteContact {
    public int printContacts(ArrayList<Person> ob) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Here are all your contacts: ");

        for (Person p : ob) {
            System.out.println(i++ + ". " + p.getFirstName() + " " + p.getLastName());
        }
        System.out.println("Press the number which is displayed in front of the contact to delete it: ");
        int no = sc.nextInt() - 1;
        return no;

    }
}




