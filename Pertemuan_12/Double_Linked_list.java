

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
                System.out.print(tmp.data + "\t");
                tmp = tmp.nextNode;
                }
        } else {
            System.out.println("Linked List Kosong");
            
        }
    }

    // Percobaan 2
    // method remove first
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong, tidak dapat dihapus!");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.nextNode;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masing kosong, tidak dapat dihapus!");
        } else if (head.nextNode == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.nextNode != null) {
            current = current.nextNode;
        }
        current.nextNode = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.nextNode;
                i++;
            }
            if (current.nextNode == null) {
                current.prev.nextNode = null;
            } else if (current.prev == null) {
                current = current.nextNode;
                current.prev = null;
                head = current;
            } else {
                current.prev.nextNode = current.nextNode;
                current.nextNode.prev = current.prev;
            }
            size--;
        }
    }

    // Percobaan 3
    // dilakukan uji coba untuk mengambil data pada linked list dalam 3 kondisi
    // yaitu mengambil data paling awal, paling akhir, dan data pada indeks tertentu
    // method mengambil data dinamakan get
    // ada 3 method yaitu getFirst, getLast, get

    // method getfirst
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong, tidak dapat diambil!");
        }
        return head.data;
    }

    // method getLast
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node tmp = head;
        while (tmp.nextNode != null) {
            tmp = tmp.nextNode;
        }
        return tmp.data;
    }

    // method get(index)
    public  int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        int i = 0;
        while (i < index) {
            tmp = tmp.nextNode;
            i++;
        }
        return tmp.data;
    }
}

