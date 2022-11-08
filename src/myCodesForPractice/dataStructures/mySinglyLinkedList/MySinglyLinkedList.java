package myCodesForPractice.dataStructures.mySinglyLinkedList;

import java.util.ArrayList;

public class MySinglyLinkedList<E> {
    //Attributes
    Node<E> head;
    Node<E> tail;
    ArrayList<E> data = new ArrayList<>();

    //Constructors
    public MySinglyLinkedList() {
        head=null;
        tail=null;
    }

    //Methods
    public void push(E valueFromUser) {
        if (head==null){
            tail=new Node<>();
            head=new Node<>(valueFromUser,tail);
            data.add(head.getData());
        }else {
            Node<E> tempNode = new Node<>(valueFromUser,null);
            tail.setNext(tempNode);
            tail=tempNode;
            data.add(tail.getData());
        }
    }
}
