<div style="text-align: center;">

# **Laporan Kuis 2**
# **Single Linked List**

<img src="https://spmb.polinema.ac.id/devel/asset/images/polinema_logo.png" alt="Logo Universitas" style="width: 200px;"/>

## Disusun oleh:
**Nama:** Muhammad Alif Febriansyah <br>
**NIM:** 2341720025 <br>
**Kelas:** TI-1B <br>

## Jurusan
Teknologi Informasi

## Politeknik Negeri Malang
2023/2024

</div>

Percobaan 1
class node
```java
package Pertemuan_15;

public class Node_19 {

    int data;
    Node_19 prev, nextNode_19;
    int jarak;

    Node_19(Node_19 prev, int data, int jarak, Node_19 next){
        this.prev=prev;
        this.data=data;
        this.nextNode_19=next;
        this.jarak=jarak;
    }
}
```
class double linked list
```java
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
```
class graph
```java
package Pertemuan_15;

import java.security.PublicKey;

/**
 * Graph_19
 */
public class Graph_19 {

    int vertex;
    DoubleLinkedList_19 list[];

    public Graph_19(int v){
        vertex = v;
        list = new DoubleLinkedList_19[v];
        for(int i=0; i<v; i++){
            list[i] = new DoubleLinkedList_19();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak){
        list[asal]. addFirst(tujuan, jarak);
        // list[tujuan]. addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut = 0;
        for(int i =0 ; i<vertex; i++){
            // inDegree
            for(int j=0; j<list[i].size(); j++){
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
        }

        // outDegree
        for(k=0; k<list[asal].size();k++){
            list[asal].get(k);
        }
        totalOut = k;

        System.out.println("InDegree dari Gedung " + (char) ('A'+asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A'+asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A'+asal) + ": " + (totalIn+totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception{
        System.out.println(vertex);
        list[asal].remove(tujuan);
        for(int i = 0; i < vertex; i++){
            if (i == tujuan) {
            }
        }
    }

    public void removeAllEdges(){
        for(int i = 0; i<vertex; i++){
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan.");
    }

    public void printGraph() throws Exception{
        for(int i=0; i<vertex; i++){
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++){
                    System.out.print((char) ('A' +list[i].get(j)) + " (" +list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
```
class main
```java
package Pertemuan_15;

/**
 * GraphMain_19
 */
public class GraphMain_19 {

    public static void main(String[] args) throws Exception {
        Graph_19 gedung = new Graph_19(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();
    }
}
```
contoh output
```
InDegree dari Gedung A: 0
OutDegree dari Gedung A: 2
Degree dari Gedung A: 2
Gedung A terhubung dengan
C (100 m), B (50 m), 
Gedung B terhubung dengan
D (70 m),
Gedung C terhubung dengan
D (40 m),
Gedung D terhubung dengan
E (60 m),
Gedung E terhubung dengan
F (80 m),

6
Gedung A terhubung dengan 
C (100 m), B (50 m),
Gedung C terhubung dengan
D (40 m),
Gedung D terhubung dengan
E (60 m),
Gedung E terhubung dengan
F (80 m),
```
