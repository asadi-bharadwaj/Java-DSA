package queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(1);

        myQueue.enQueue(2);
        myQueue.deQueue();
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();
    }
}
