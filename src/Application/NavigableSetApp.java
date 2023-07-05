package Application;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Danial","Fachrudin","Ganteng","Dan","Intelek"));

        NavigableSet<String> namesDesc = names.descendingSet();
        NavigableSet<String> fach = names.headSet("Fachrudin",true);

        for (var name : names){
            System.out.println(name);
        }
    }
}
