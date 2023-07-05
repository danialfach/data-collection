package Application;

import Application.Data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Dany");

        person.addHobby("coding");
        person.addHobby("game");

        doSomethingWithHobbies(person.getHobbies());

        for (String hobby : person.getHobbies()){
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("ngising");
    }
}
