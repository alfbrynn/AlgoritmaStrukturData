<div style="text-align: center;">

# LAPORAN PRAKTIKUM
# JOBSHEET 9 LINKED LIST

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


### Percobaan 1
Node.java
```java
package pertemuan_11;

class Node {
    int data;
    Node next;

    Node(int nilai, Node berikutnya){
        data = nilai;
        next = berikutnya;
    }
    
}
```
Single_Lingked_List.java
```java
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
```
SLLMain.java
```java
package pertemuan_11;

public class SLL_Main {
    public static void main(String[] args) {
        Single_Linked_List singLL = new Single_Linked_List();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addFirst(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAfter(3, 833);
        singLL.print();
    }
    
}
```
Contoh output
```
Linked List kosong
Isi Linked List: 890
Isi Linked List: 760    890
Isi Linked List: 700    760     890
Isi Linked List: 700    999     760     890
Isi Linked List: 700    999     760     890
```

### Percobaan 2

Class Node.java
```java
package Pertemuan_11.Percobaan_2;

class Node_2 {
    int data;
    Node_2 next;

    Node_2(int nilai, Node_2 berikutnya){
        data = nilai;
        next = berikutnya;
    }
    
}
```
Class Single_Linked_List_2.java
```java
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
            System.out.print("Isi Linked List:");
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
        while (tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if(tmp != null){
            return 1;
        } else {
            return index;
        }
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
```
class SLL_Main_2.java
``` java
package Pertemuan_11.Percobaan_2;

public class SLL_Main_2 {
    public static void main(String[] args) {
        Single_linked_list_2 singLL = new Single_linked_list_2();
        singLL.print();  // Linked list kosong
        singLL.addLast(890);
        singLL.print();  // Isi Linked List: 890
        singLL.addLast(760);
        singLL.print();  // Isi Linked List: 760 890
        singLL.addFirst(700);
        singLL.print();  // Isi Linked List: 700 760 890
        singLL.insertAfter(700, 999);
        singLL.print();  // Isi Linked List: 700 999 760 890
        singLL.insertAt(4, 833);
        singLL.print();  // Isi Linked List: 700 999 760 890 833

        // Data pada indeks ke-1 = 999
        System.out.println("Data pada indeks ke-1 = " + singLL.getData(1));

        // Index dari data 833 (bukan data 3)
        System.out.println("Data 3 berada pada indeks ke-" + singLL.indexOf(833));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }   
}
```
Contoh output
```