package de.forkster.java1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressBookTest {


    
    @Test
    public void create_an_instance_of_an_AddressBook()
    {
        // Given
        Person person = new Person("Matthias", "Gabel", "matthias.gabel@fh-email.de");

        // When
        String className = person.getClass().getTypeName();

        // Then
        assertEquals("de.forkster.java1.Person", className, "The type be Person.");
    }
}
