package execution;

import add_the_contacts.AddContact;
import delete_the_contacts.DeleteContact;
import person_class.Person;
import search_the_contact.SearchContact;
import view_the_contact.ViewContact;

import java.util.ArrayList;
import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        ArrayList<Person> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rishabh Contact List App");
        int n = 0;
        while (n != 5) {
            System.out.println("--------*--------*--------*--------");
            System.out.println("Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit the program ");

            System.out.println("--------*--------*--------*--------");
            int no = sc.nextInt();
            n = no;
            switch (n) {
                case 1:
                    AddContact ob1 = new AddContact();
                    ob.add(ob1.addContact());
                    n = 1;
                    break;
                case 2:
                    ViewContact obj = new ViewContact();
                    obj.viewContact(ob);
                    n = 2;
                    break;
                case 3:
                    SearchContact obj1 = new SearchContact();
                    obj1.searchContact(ob);
                    n = 3;
                    break;
                case 4:
                    DeleteContact obj2 = new DeleteContact();
                    if (ob.size() > 0) {
                        int ind = obj2.printContacts(ob);
                        System.out.println(ob.get(ind).getFirstName() + " " + ob.get(ind).getLastName() + "'s contact removed!");
                        ob.remove(ob.get(ind));
                    } else
                        System.out.println("No contact found");
                    n = 4;
                    break;
                case 5:
                    n = 5;
                    break;
                default:
                    System.out.println("It is invalid choice, please re-enter");
                    break;

            }

        }
    }
}