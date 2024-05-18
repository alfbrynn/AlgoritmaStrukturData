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
        System.out.println("Data 833 berada pada indeks ke-" + singLL.indexOf(833));

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