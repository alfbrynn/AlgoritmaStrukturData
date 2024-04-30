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