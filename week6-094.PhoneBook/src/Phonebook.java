
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Jenkins
 */
public class Phonebook {
    
    private ArrayList<Person> personList;

    public Phonebook() {
        this.personList = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        // create a person and add to the address book
        this.personList.add(new Person(name, number));
    }
    
    public void printAll() {
        // print all names in phonebook
        
        for (Person person : this.personList) {
            System.out.println(person.toString());
        }
    }
    
    public String searchNumber(String name) {
        // Return the number of a given name

        for (Person person : this.personList) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }

        return "number not known";
    }
}
