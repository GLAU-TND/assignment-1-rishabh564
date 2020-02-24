package search_the_contact;

import person_class.Person;
import view_the_contact.ViewContact;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchContact {
    public void searchContact(ArrayList<Person> ob) {
        System.out.println("Enter the first name of a person for searching-");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();
        int count = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        int i = 0;
        for (Person p : ob) {
            if (p.getFirstName().equals(searchName)) {
                ar.add(i);
                count++;
            }
            i++;
        }
        if (count == 0)
            System.out.println("No match found!");
        else
            System.out.println(count + "match found!");
        for (Integer index : ar) {
            ViewContact object = new ViewContact();
            object.viewDetails(ob.get(index));

        }

    }
}


