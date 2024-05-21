class Node.java
```java

public class Node {

    int data;
    Node prev, nextNode;

    Node(Node prev, int data, Node next){
        this.prev=prev;
        this.data=data;
        this.nextNode=next;
    }
}
```
class Double_Linked_list.java
```java



public class Double_Linked_list {

    // deklarasi atribut
    Node head;
    int size;

    // construktor class
    public Double_Linked_list(){
        head = null;
        size = 0;
    }

    // method untuk memastikan kondisi linked list kosong
    public boolean isEmpty(){
        return head == null;
    }

    // method untuk menjalankan penambahan data pada nagian depan linked list
    public void addFirst(int item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // method addLast() untuk menambahkan data pada bagian belakang pada liked list
    public void addLast(int item){
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            Node newNode = new Node(current, item, null);
            current.nextNode = newNode;
            size++;
        }
    }

    // method untuk menambahkan data pada posisi yang telah ditentukan dengan indeks
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.nextNode;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.nextNode = current;
                current.prev.nextNode = newNode;
                current.prev = newNode;
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
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.nextNode;
                }
        } else {
            System.out.println("Linked List Kosong");
            
        }
    }
}
```
class DLL_Main.java
```java


public class DLL_Main {

    public static void main(String[] args) throws Exception {
        Double_Linked_list dll = new Double_Linked_list();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("======================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("======================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.clear();
        dll.print();
        System.out.println("Size : "+dll.size());
    }
}
```
contoh output
```
Linked List Kosong
Size : 0
======================================
7
3
4
Size : 3
======================================
7
40
3
4
Size : 4
=======================================
Linked List Kosong
Size : 0
```

### Percoban 2
contoh output
```
Linked List Kosong
Size : 0
======================================
7       3       4       Size : 3
======================================
7       40      3       4       Size : 4
=======================================
Linked List Kosong
Size : 0
50      40      10      20      Size : 4
=======================================
40      10      20      Size : 3
=======================================
40      10      20      Size : 2
=======================================
40      20      Size : 1
```

### Percobaan 3
contoh output
```
Linked List Kosong
Size : 0
======================================
7       3       4       Size : 3
======================================
7       40      3       4       Size : 4
=======================================
Linked List Kosong
Size : 0
50      40      10      20      Size : 4
=======================================
40      10      20      Size : 3
=======================================
40      10      20      Size : 2
=======================================
40      20      Size : 1
40      20      Size : 1
=======================================
7       3       40      20      4       Size : 4
=======================================
7       40      3       40      20      4       Size : 5
=======================================
Data paling awal : 7
Data paling akhir : 4
Data pada indeks 1 : 40
```