package Pertemuan_11.Tugas_1;

class Linked_List {
    Node head;

    public Linked_List() {
        this.head = null;
    }

    public void addLast(int NIM, String nama) {
        Node newNode = new Node(NIM, nama);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("NIM: " + temp.NIM + ", Nama: " + temp.nama);
            temp = temp.next;
        }
    }
}
