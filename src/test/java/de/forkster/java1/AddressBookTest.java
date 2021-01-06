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
    Person      person6     = new Person("Stefan", "Gabel", "stefan.gabel@fh-erfurt.de");
    Person      person7     = new Person("Marion", "Gabel", "marion.gabel@fh-ermail.de");

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
        addressBook.sortByName();

        // Then
        assertEquals("Frischmuth",  addressBook.getEntries().get(0).getLastname(), "The first person should be Frischmuth");
        assertEquals("Gabel",       addressBook.getEntries().get(1).getLastname(), "The first person should be Gabel");
        assertEquals("Hofmann",     addressBook.getEntries().get(2).getLastname(), "The first person should be Hofmann");
        assertEquals("Knop",        addressBook.getEntries().get(3).getLastname(), "The first person should be Knop");
        assertEquals("Wohlers",     addressBook.getEntries().get(4).getLastname(), "The first person should be Wohlers");
    }

    @Test
    public void should_count_gabel_equals_3()
    {
        // Given
        addressBook.addEntry(person1);
        addressBook.addEntry(person2);
        addressBook.addEntry(person3);
        addressBook.addEntry(person4);
        addressBook.addEntry(person5);
        addressBook.addEntry(person6);
        addressBook.addEntry(person7);

        // When
        String result = addressBook.overview();

        // Then
        assertEquals("Gabel - 3, Hofmann - 1, Frischmuth - 1, Knop - 1, Wohlers - 1", result);
    }
}
