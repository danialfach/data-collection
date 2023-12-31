package Application;

import Application.Data.Person;
import Application.Data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        people.add(new Person("Danial"));
        people.add(new Person("Ganteng"));
        people.add(new Person("Intelek"));

        for (var person : people){
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
    }
}
