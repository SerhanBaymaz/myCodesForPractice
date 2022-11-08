package myCodesForPractice.dataStructures.mySinglyLinkedList;

public class Node<E> {
    //Attributes
    private E data;
    private Node next;

    //Constructors
    public Node() {
    }
    public Node(E data) {
        this.data = data;
    }
    public Node(E data, Node next) {
        this.data = data;
        this.next = next;
    }


    //Getter and Setters
    public E getData() {
        return data;
    }
    public void setData(E data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}

