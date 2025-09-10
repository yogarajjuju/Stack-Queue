import java.util.LinkedList;
import java.util.Queue;
// Queue
public class Example2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(32);
        queue.add(41);
        queue.add(2);
        queue.add(3);
        queue.add(10);
        queue.add(12);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

    }
}
