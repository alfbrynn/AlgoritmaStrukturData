
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

