package view_the_contact;

import person_class.Person;
import java.util.*;


public class ViewContact {
    public void viewDetails(Person oj) {
        System.out.println("-------- * -------- * -------- * --------");
        System.out.println("First Name: " + oj.getFirstName());
        System.out.println("Last Name: " + oj.getLastName());
        String s = "" + oj.getContactNumbers();
        System.out.println("Contact Number(s): " + s.substring(1, s.length() - 1));
        System.out.println("Email address: " + oj.getEmailAddress());
        System.out.println("-------- * -------- * -------- * --------");


    }

    public void viewContact(ArrayList<Person> ob) {
        if(ob.size()>0){
            System.out.println("---Here are all your contacts---");
            ListIterator itr = ob.listIerator();
            while(itr.hasNext()){
                viewDetails((Person)itr.next());
            }
        }
        else
            System.out.println("No contact found");
        
    }
}