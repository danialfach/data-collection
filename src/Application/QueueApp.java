package Application;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.add("Danial");
        queue.add("Fachrudin");
        queue.add("Ganteng");

        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());

    }
}
