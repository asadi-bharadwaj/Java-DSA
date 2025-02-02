package linkedLists;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.append(5);
       //System.out.println(myLinkedList.removeLast().value);
        myLinkedList.prepend(3);
       // myLinkedList.removeFirst();
       System.out.println("Node at given index is "+myLinkedList.get(2).value);
       myLinkedList.set(2,4);
       //myLinkedList.insert(1,3);
        //myLinkedList.remove(1);
        myLinkedList.reverse();

        myLinkedList.printList();
        System.out.println("Middle Node is : "+myLinkedList.middleNode().value);
        System.out.println(myLinkedList.hasLoop());
    }
}
