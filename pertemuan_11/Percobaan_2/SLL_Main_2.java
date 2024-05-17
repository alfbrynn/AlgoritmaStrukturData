package Pertemuan_11.Percobaan_2;

public class SLL_Main_2 {
    public static void main(String[] args) {
        Single_linked_list_2 singLL = new Single_linked_list_2();
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

        System.out.println("Data pada index ke -1="+singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke-"+singLL.indexOf(760));

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