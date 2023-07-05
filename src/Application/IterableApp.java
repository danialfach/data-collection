package Application;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Danial", "Fachrudin", "Ganteng");

        for (var name : names){
            System.out.println(name);
        }
    }
}
