package de.forkster.java1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressBookTest {

    // Given
    AddressBook addressBook = new AddressBook();
    Person      person1     = new Person("Matthias", "Gabel", "matthias.gabel@fh-email.de");
    Person      person2     = new Person("Dirk", "Hofmann", "dirk.hofmann@fh-email.de");
    Person      person3     = new Person("Christoph", "Frischmuth", "christoph.frischmuth@fh-email.de");
    Person      person4     = new Person("Mickey", "Knop", "mickey.knop@fh-email.de");
    Person      person5     = new Person("Saskia", "Wohlers", "saskia.wohlers@fh-email.de");

    @BeforeEach
    public void setUp()
    {

    }

    @Test
    public void create_an_instance_of_an_AddressBook()
    {
        // When
        String className = addressBook.getClass().getTypeName();

        // Then
        assertEquals("de.forkster.java1.AddressBook", className, "The type be Person.");
    }

    @Test
    public void add_a_person_to_AddressBook()
    {
        // When
        addressBook.addEntry(person1);

        // Then
        assertEquals("Matthias", addressBook.getEntries().get(0).getFirstname() , "The Firstname should be Matthias.");
    }

    @Test
    public void should_sort_list_by_firstname()
    {
        // Given
        addressBook.addEntry(person1);
        addressBook.addEntry(person2);
        addressBook.addEntry(person3);
        addressBook.addEntry(person4);
        addressBook.addEntry(person5);

        // When
        // addressBook.getEntries().sort(<Person>);



    }
}
