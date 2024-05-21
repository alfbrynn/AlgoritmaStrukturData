

public class Node {

    int data;
    Node prev, nextNode;

    Node(Node prev, int data, Node next){
        this.prev=prev;
        this.data=data;
        this.nextNode=next;
    }
}