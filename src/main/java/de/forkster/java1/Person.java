package de.forkster.java1;

public class Person  implements Comparable<Person> {
    private String firstname;
    private String lastname;
    private String email;

    public Person(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    @Override
    public int compareTo(Person o) {
        return this.lastname.compareTo(o.getLastname());
    }

    //Getter & Setter
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
