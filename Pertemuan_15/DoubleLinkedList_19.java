package Pertemuan_15;

import org.w3c.dom.Node;

/**
 * DoubleLinkedList_19
 */
public class DoubleLinkedList_19 {

    Node_19 head;
    int size;

    // construktor class
    public DoubleLinkedList_19(){
        head = null;
        size = 0;
    }

    // method untuk memastikan kondisi linked list kosong
    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item, int jarak){
        if (isEmpty()) {
            head = new Node_19(null, item, jarak, null);
        } else {
            Node_19 newNode_19 = new Node_19(null, item, jarak, head);
            head.prev = newNode_19;
            head = newNode_19;
        }
        size++;
    }

    public int getJarak(int index) throws Exection{
        if (isEmpty() || index >= size) {
            
        }
    }
}