package de.forkster.java1;

import java.util.ArrayList;
import java.util.Collections;

public class AddressBook{
    private ArrayList<Person> Entries = new ArrayList<Person>();


    public void addEntry(Person Entry) {
        this.getEntries().add(Entry);
    }


    public void sortByName() {
        ArrayList<Person> listPerson = this.getEntries();
        Collections.sort(listPerson);
    }

    public String overview() {
        class Container { String lastname; int count;}

        ArrayList<Container> container = new ArrayList<Container>();
        for (int AddressbookIterator = 0; AddressbookIterator < this.getEntries().size(); AddressbookIterator++) {
            boolean shouldCreateFlag = true;

            for (int ContainerIterator = 0; ContainerIterator < container.size(); ContainerIterator++)
            {
                if (this.getEntries().get(AddressbookIterator).getLastname() == container.get(ContainerIterator).lastname)
                {
                    container.get(ContainerIterator).count++;
                    shouldCreateFlag = false;
                }
            }

            if (shouldCreateFlag == true){
                Container newContainer = new Container();
                newContainer.count = 1;
                newContainer.lastname = this.getEntries().get(AddressbookIterator).getLastname();

                container.add(newContainer);
            }
        }

        String output = "";
        for (Container entry: container
             ) {
            output += entry.lastname + " - " + entry.count + ", ";
        }
        output = output.replaceAll(", $", "");
        return output;
    }

    //Getter & Setter
    public ArrayList<Person> getEntries() {
        return this.Entries;
    }

    public void setEntries(ArrayList<Person> entries) {
        this.Entries = entries;
    }

}
