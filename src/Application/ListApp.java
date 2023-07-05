package Application;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(100);

        names.add("Danial");
        names.add("Fachrudin");

        names.set(1, "Ganteng");

        System.out.println(names.get(0));
        System.out.println(names.get(1));

    }
}
