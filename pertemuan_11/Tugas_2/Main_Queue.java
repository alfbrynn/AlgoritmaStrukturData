package Pertemuan_11.Tugas_2;

public class Main_Queue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Menambahkan beberapa elemen ke dalam queue
        queue.enqueue(19, "Alif");
        queue.enqueue(112, "Prita");
        queue.enqueue(113, "Yusuf");
        queue.enqueue(114, "Doni");
        queue.enqueue(115, "Sari");

        // Menampilkan semua elemen dalam queue
        System.out.println("Queue setelah menambahkan 5 elemen:");
        queue.printQueue();

        // Menghapus dua elemen dari queue
        System.out.println("\nDequeue dua elemen:");
        queue.dequeue();
        queue.dequeue();

        // Menampilkan sisa elemen dalam queue
        System.out.println("\nQueue setelah menghapus 2 elemen:");
        queue.printQueue();
    }
}