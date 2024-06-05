package Pertemuan_15;

import Pertemuan_15.Node_19;

// import org.w3c.dom.Node_19_19;

/**
 * DoubleLinkedList_19
 */
public class DoubleLinkedList_19 {

    // deklarasi atribut
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

    public int getJarak(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node_19 tmp = head;
        for (int i = 0; i<index; i++){
            tmp=tmp.nextNode_19;
        }
        return tmp.jarak;
    }

    // method untuk menjalankan penambahan data pada nagian depan linked list
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

    // method addLast() untuk menambahkan data pada bagian belakang pada liked list
    public void addLast(int item, int jarak){
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node_19 current = head;
            while (current.nextNode_19 != null) {
                current = current.nextNode_19;
            }
            Node_19 newNode_19 = new Node_19(current, item, jarak, null);
            current.nextNode_19 = newNode_19;
            size++;
        }
    }

    // method untuk menambahkan data pada posisi yang telah ditentukan dengan indeks
    public void add(int item, int jarak, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node_19 current = head;
            int i = 0;
            while (i < index) {
                current = current.nextNode_19;
                i++;
            }
            if (current.prev == null) {
                Node_19 newNode_19 = new Node_19(null, item, jarak, current);
                current.prev = newNode_19;
                head = newNode_19;
            } else {
                Node_19 newNode_19 = new Node_19(current.prev, item, jarak, current);
                newNode_19.prev = current.prev;
                newNode_19.nextNode_19 = current;
                current.prev.nextNode_19 = newNode_19;
                current.prev = newNode_19;
            }
        }
        size++;
    }

    // method size() untuk mendapatkan nilai dari size
    public int size(){
        return size;
    }

    // Method clear() untuk menghapus semua isi linked list, sehingga linked list dala kondisi kosong
    public void clear(){
        head = null;
        size = 0;
    }

    // method print() untuk mencetak isi linked list berapapun size-nya. jika linked list kosong akan dimunculkan pemberitauan bahwa linked list dalam kondisi kosong
    public void print(){
        if (!isEmpty()) {
            Node_19 tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.nextNode_19;
                }
        } else {
            System.out.println("Linked List Kosong");
            
        }
    }

    public void remove(int index){
        Node_19 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.nextNode_19 = current.nextNode_19;
                } else {
                    head = current.nextNode_19;
                }
                if (current.nextNode_19 != null) {
                    current.nextNode_19.prev = current.prev;
                }
                break;
            }
            current = current.nextNode_19;
        }
        size--;
    }

    public  int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node_19 tmp = head;
        int i = 0;
        while (i < index) {
            tmp = tmp.nextNode_19;
            i++;
        }
        return tmp.data;
    }
}