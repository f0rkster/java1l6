package de.forkster.java1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddressBook {
    private ArrayList<Person> Entries;


    public void addEntry(Person Entry) {
        this.getEntries().add(Entry);
    }


    //Getter & Setter
    public ArrayList<Person> getEntries() {
        return this.Entries;
    }

    public void setEntries(ArrayList<Person> entries) {
        this.Entries = entries;
    }
}
