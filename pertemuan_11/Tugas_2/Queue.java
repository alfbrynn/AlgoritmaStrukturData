package Pertemuan_11.Tugas_2;

class Queue {
    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    void enqueue(int NIM, String nama) {
        Node newNode = new Node(NIM, nama);

        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }

        this.rear.next = newNode;
        this.rear = newNode;
    }

    void dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }

        System.out.println("Dequeued: NIM: " + temp.NIM + ", Nama: " + temp.nama);
    }

    void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.println("NIM: " + temp.NIM + ", Nama: " + temp.nama);
            temp = temp.next;
        }
    }
}