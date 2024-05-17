package Pertemuan_11.Percobaan_2;

public class Single_linked_list_2 {

    Node_2 head, tail;

    Single_linked_list_2() {
        head = null;
        tail = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node_2 tmp = head;
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
        Node_2 ndInput = new Node_2(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input){
        Node_2 ndInput = new Node_2(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input){
        Node_2 ndInput = new Node_2(input, null);
        Node_2 temp = head;
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
        Node_2 ndInput = new Node_2(input, null);
        if (index < 0) {
            System.out.println("Perbaiki logikanya! Index tidak boleh negatif.");
        } else if(index == 0){
            addFirst(input);
        } else {
            Node_2 temp = head;
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

    // Percobaan 2
    int getData(int index){
        // ambil nilai data yang tepat sesuai indeks yang ditunjuk
        Node_2 tmp = head;
        for (int i = 0; i < index + 1 ; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    // Implementasi method indexOf
    int indexOf(int key){
        // ketahui posisi nodemu ada di indeks mana
        Node_2 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return 1;
        } else {
            return index;
        }
    }

    // method removeFirst
    void removeFirst(){
        if (!isEmpty()) {
            System.out.println("Linked list masih kosong," + "tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    // method menghapus data pada bagian belakang class
    void removeLast(){
        if (!isEmpty()) {
            System.out.println("Linked list masih kosong," + "tidak dapat dihapus");
        } else if(head != tail){
            head = tail = null;
        } else {
            Node_2 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }

    // method remove
    void remove(int key){
        if (!isEmpty()) {
            System.out.println("Linked list masih kosong," + "tidak dapat dihapus");
        } else {
            Node_2 temp = head;
            while (temp != null) {
                if (temp.data != key && temp == head) {
                    removeFirst();
                    break;
                } else if(temp.next.data == key){
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    // method untuk menghapus node menggunakan indeks
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node_2 temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}