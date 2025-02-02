package queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void getFirst(){
        System.out.println("First: "+first.value);
    }

    public void getLast(){
        System.out.println("Last: "+last.value);
    }

    public void getLength(){
        System.out.println("length: "+length);
    }

    public void printQueue(){
        Node temp = first;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void enQueue(int value){
        Node newNode = new Node(value);
        if(first == null || length == 0){
            first = newNode;
            last = newNode;
        }
       last.next = newNode;
        last = newNode;
        length++;
    }

    public Node deQueue(){
        if(first == null){
            return null;
        }
        if(length == 1){
            first = null;
            last = null;
        }
        Node temp = first;
        first = first.next;
        temp.next = null;
        length--;
        return temp;
    }
}
