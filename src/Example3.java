import java.util.ArrayDeque;
import java.util.Deque;
//deck it is a double ended queue

public class Example3 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(30);
        deque.addLast(50);
        deque.add(60);
        deque.add(54);
        deque.addFirst(1);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
