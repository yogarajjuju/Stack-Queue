public class QueueMain {
    public static void main(String[] args) {
//        CustomQueue queue = new CustomQueue(5);
        Circularqueue queue = new Circularqueue();

            queue.insert(20);
        queue.insert(50);
        queue.insert(26);
        queue.insert(57);
        queue.insert(17);
        queue.insert(14);
        queue.display();



    }
}
