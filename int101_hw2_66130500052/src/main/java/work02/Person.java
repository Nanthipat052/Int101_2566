package work02;

import java.util.Objects;

import work01.Utilitor;

public class Person {
    private static int nextId=1;
    private final int id;
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname){
        this.firstname = Utilitor.testString(firstname);
        this.lastname = Utilitor.testString(lastname);
        this.id = nextId++;
    }
    public int getId(){
        return id;
    }

    public static int getNextId(){
        return nextId += 10;
    }

    public static void incrementNextId(){
        nextId += 10;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setFirstname(String lastname){
        this.firstname = Utilitor.testString(firstname);
    }

    public void setLastname(String lastname){
        this.lastname = Utilitor.testString(lastname);
    }

    @Override
    public String toString(){
        final StringBuilder word = new StringBuilder("Person{");
        word.append("id=").append(id);
        word.append(", firstname='").append(firstname).append('\'');
        word.append(", lastname='").append(lastname).append('\'');
        word.append('}');
        return word.toString();
    }
    @Override
    public boolean equals(Object a){
        if (this == a)
        return true;
        if(a == null || getClass() != a.getClass())
        return false;

        Person person = (Person) a;
        return id == person.id && Objects.equals(firstname, person.firstname)
        && Objects.equals(lastname, person.lastname);
    }
}
