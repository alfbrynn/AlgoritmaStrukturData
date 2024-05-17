package Pertemuan_11.Percobaan_2;

class Node_2 {
    int data;
    Node_2 next;

    public Node_2(int data, Node_2 next) {
        this.data = data;
        this.next = next;
    }
}

public class Single_linked_list_2 {

    Node_2 head, tail;

    Single_linked_list_2() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node_2 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node_2 ndInput = new Node_2(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node_2 ndInput = new Node_2(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
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

    void insertAt(int index, int input) {
        Node_2 ndInput = new Node_2(input, null);
        if (index < 0) {
            System.out.println("Perbaiki logikanya! Index tidak boleh negatif.");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node_2 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
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

    int getData(int index) {
        Node_2 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key) {
        Node_2 tmp = head;
        int index = 0;
        while (tmp != null) {
            if (tmp.data == key) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1; // Tidak ditemukan
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node_2 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            if (head.data == key) {
                removeFirst();
            } else {
                Node_2 temp = head;
                while (temp.next != null) {
                    if (temp.next.data == key) {
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
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node_2 temp = head;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            } else {
                System.out.println("Index melebihi panjang Linked List.");
            }
        }
    }
}