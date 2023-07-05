package Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Danial");
        names.add("Fachrudin");
        names.addAll(Arrays.asList("Ganteng","dan","Intelek"));

        for (var name : names){
            System.out.println(name);
        }
    }
}
