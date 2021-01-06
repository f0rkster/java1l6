package de.forkster.java1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddressBook{
    private ArrayList<Person> Entries = new ArrayList<Person>();


    public void addEntry(Person Entry) {
        this.getEntries().add(Entry);
    }


    public void sortByName() {
        ArrayList<Person> listPerson = this.getEntries();
        Collections.sort(listPerson);
    }

    //Getter & Setter
    public ArrayList<Person> getEntries() {
        return this.Entries;
    }

    public void setEntries(ArrayList<Person> entries) {
        this.Entries = entries;
    }

}
