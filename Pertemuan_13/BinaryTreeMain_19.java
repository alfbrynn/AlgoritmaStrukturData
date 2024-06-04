package Pertemuan_13;

/**
 * BinaryTreeMain_19
 */
public class BinaryTreeMain_19 {

    public static void main(String[] args) {
        BinaryTree_19 bt = new BinaryTree_19();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.print("PreOrder Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal: ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal: ");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Find Node: " +bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        // memanggil method pada tugas
        System.out.println("Nilai minimum: " + bt.findMin());
        System.out.println("Nilai Maximum: " + bt.findMax());

        System.out.print("Leaf: ");
        bt.printLeaf();
        System.out.println();

        System.out.println("Jumlah leaf: " + bt.countLeaf());
    }
}