package Application;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Danial");
        stack.offerLast("Fachrudin");
        stack.offerLast("Ganteng");

        for (var item = stack.pollLast(); item != null; item = stack.pollLast()){
            System.out.println(item);
        }
    }
}
