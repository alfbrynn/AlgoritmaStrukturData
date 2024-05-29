<div style="text-align: center;">

# Laporan Kuis 2
# Single Linked List

<img src="https://spmb.polinema.ac.id/devel/asset/images/polinema_logo.png" alt="Logo Universitas" style="width: 200px;"/>

## Disusun oleh:
- **Nama:** Muhammad Alif Febriansyah
- **NIM:** 2341720025
- **Kelas:** TI-1B

## Jurusan
Teknologi Informasi

## Politeknik Negeri Malang
2023/2024

</div>

# Percobaan 1

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
#### Pertanyaan
1.  Jelaskan perbedaan antara single linked list dengan double linked lists!
jawab
```
Perbedaan utama terletak pada jumlah pointer yang dimiliki setiap node. single linked list memiliki satu pointer yang menunjuk pada node berikutnya. sedangkan double linked list memiliki dua pointer yang menunjuk ke node berikutnya dan node sebelumnya
```
2.  Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut 
tersebut?
jawab
```
Atribut next berguna untuk menunjuk ke node berikutnya. nilai atribut ini dapat berupa null jika node tersebut adalah node terakhir dalam linked list.
```
```
Atribut prev berguna untuk menunjuk ke node sebelumnya dalam list. Nilai atribut ini juga dapat bernilai null jika node tersebut adalah node pertama dalam list.
```
3.  Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan 
size seperti pada gambar berikut ini?
jawab
```
untuk menginialisasi state awal dari double linked list. atribut head diinisialisasi dengan nilai null, yang menunjukkan bahwa list tersebut kosong dan atribut size diinisialisasi dengan nilai 0, yang menunjukkan list tersebut tidak memiliki elemen.
```
4.  Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev 
dianggap sama dengan null?
jawab
```
karena node baru pada method addFirst akan menjadi node pertama dalam list.
5.  Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?
jawab
```
untuk memperbarui pointer prev dari node head(node pertanya) agar menunjuk node yang baru ditambahkan menjadi node head.
```
6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan 
parameter prev dengan current, dan next dengan null?
Node newNode = new Node(current, item, null)
jawab
```
pembuatan node dengan mengisiskan parameter prev dengan current dan next dengan null pada method addLast() digunakan membuat node baru yang akan ditambahkan dalam list.
7.  Pada method add(), terdapat potongan kode program sebagai berikut:
jelaskan maksud dari bagian yang ditandai dengan kotak kuning.
jawab
```
- Perulangan while(i<index) digunakan untuk menavigasi list hingga mencapai node dimana node baru akan ditambahkan
- Percabangan if(current.orev==null) digunakan untuk menentukan apakah node baru akan ditambahkan pada awal list.
```

### Percoban 2

modifikasi ada pada class double linked list
class Double_Linked_List
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
}
```
dan pengeditan kode terdapat pada class main untuk mengeksekusi method yang baru saja dibuat di class double linked list
class Main
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

        // Percobaan 2
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.remove(1);
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
#### Pertanyaan
1.  Apakah maksud statement berikut pada method removeFirst()?
head = head.next;
head.prev = null;
jawab
```
statement tersebut digunakan untuk memperbarui nilai pda atribut head agar menunjuk ke node berikutnya dari node pertama dan statement head.prev=null digunakan untuk memperbarui nilai atribut prev dari node berikutnya dari node pertama agar menunjuk ke null. Hal ini dilakukan karena node pertama baru tidak memiliki node sebelumnya.
```
2.  Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
jawab
```
- dengan memeriksa nilai atribut next dari node current, jika nilai atribut next dari node current adalah null. maka node current adalah node terakhir dalam list.
- memeriksa nilai atribut size dari list, jika nilai atribut size dari list adalah 1. maka node curent adalah node terakhir dalam list.
```
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!
jawab
```
karena kode tersebut hanya memperberui pointer node head, tetapi tidak memperbarui pointer prev dari node head dan pointer next dari node yang dihapus.
4.  Jelaskan fungsi kode program berikut ini pada fungsi remove!
jawab
```
- Statement current.prev.next = current.next; digunakan untuk memperbarui pointer next dari node sebelumnya dari node yang dihapus agar menunjuk ke node berikutnya dari node yang dihapus.
- Statement current.next.prev = current.prev; digunakan untuk memperbarui pointer prev dari node berikutnya dari node yang dihapus agar menunjuk ke node sebelumnya dari node yang dihapus.
```

### Percobaan 3
pada praktikum 3 dilakukan uji coba untuk mengambil data pada linked list dalam 3 kondisi, yaitu mengambil data paling akhir, data paling awal, dan data pada indeks tertentu. method mengambil data disebut dengan get.
class Double linked list dimodifikasi dengan menambahkan method getFirst(), getLast(), get(int index)
class Double_Linked_List
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
```
Class main
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

        // Percobaan 2
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : "+dll.size());

        // Percobaan 3
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        System.out.println("Data paling awal : "+dll.getFirst());
        System.out.println("Data paling akhir : "+dll.getLast());
        System.out.println("Data pada indeks 1 : "+dll.get(1));
    }
}
```
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

#### Pertanyaan
1. Jelaskan method size() pada class DoubleLinkedLists!
jawab
```
- head = head.next;: Statement ini digunakan untuk memperbarui nilai atribut head agar menunjuk ke node berikutnya dari node pertama (yang akan dihapus).
- head.prev = null;: Statement ini digunakan untuk memperbarui nilai atribut prev dari node berikutnya dari node pertama (yang menjadi node pertama baru) agar menunjuk ke null. Hal ini dilakukan karena node pertama baru tidak memiliki node sebelumnya.
```
2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke 1!
jawab
```
Pada method removeLast(), posisi data ada pada bagian akhir dapat dideteksi dengan cara:
- Memeriksa nilai atribut next dari node current: Jika nilai atribut next dari node current adalah null, maka node current adalah node terakhir dalam list.
- Memeriksa nilai atribut size dari list: Jika nilai atribut size dari list adalah 1, maka node current adalah node terakhir dalam list.
```
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists! 
jawab
```
Potongan kode program di atas tidak cocok untuk perintah remove karena kode tersebut hanya memperbarui pointer next dari node head dan pointer prev dari node berikutnya dari node head, tetapi tidak memperbarui pointer prev dari node head dan pointer next dari node yang dihapus.
```
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!
jawab
```
Kode program di atas pada fungsi remove digunakan untuk memperbarui pointer next dan prev dari node-node yang berdekatan dengan node yang dihapus.
- Statement current.prev.next = current.next;: Statement ini digunakan untuk memperbarui pointer next dari node sebelumnya dari node yang dihapus agar menunjuk ke node berikutnya dari node yang dihapus.
- Statement current.next.prev = current.prev;: Statement ini digunakan untuk memperbarui pointer prev dari node berikutnya dari node yang dihapus agar menunjuk ke node sebelumnya dari node yang dihapus.
```

