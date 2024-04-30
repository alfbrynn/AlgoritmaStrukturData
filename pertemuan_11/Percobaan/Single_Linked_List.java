package pertemuan_11;

public class Single_Linked_List {

    Node head, tail;

    Single_Linked_List() {
        head = null;
        tail = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List");
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            } 
            temp = temp.next;
        }
    }

    void insertAt(int index, int input){
        Node ndInput = new Node(input, null);
        if (index < 0) {
            System.out.println("Perbaiki logikanya! Index tidak boleh negatif.");
        } else if(index == 0){
            addFirst(input);
        } else {
            Node temp = head;
            for(int i = 0; i < index - 1 && temp != null; i++){
                temp = temp.next;
            }
            if (temp != null) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
            } else {
                System.out.println("Index melebihi panjang Linked List.");
            }
        }
    }
}