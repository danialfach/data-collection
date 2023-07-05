package Application;

import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> names = Set.of("Danial","Fachrudin","Ganteng");

//        names.add("Dany"); error
//        names.remove("Dany"); error

        for (var name : names){
            System.out.println(name);
        }
    }
}
