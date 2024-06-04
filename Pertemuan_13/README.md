Kode percobaan 1
class Node
```java
package Pertemuan_13;

public class Node_19 {

    int data;
    Node_19 left;
    Node_19 right;

    public Node_19(int data){
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
```
class Binary tree
```java
package Pertemuan_13;

// import org.w3c.dom.Node;

/**
 * BinaryTree_19
 */
public class BinaryTree_19 {

    Node_19 root;

    public BinaryTree_19(){
        root = null;
    }

    boolean isEmpty(){
        return root==null;
    }

    void add(int data){
        if (isEmpty()) { //tree is empty
            root = new Node_19(data);
        } else {
            Node_19 current = root;
            while (true) {
                if(data<current.data){
                    if (current.left==null) {
                        current.left = new Node_19(data);
                        break;
                    } else {
                        current = current.left;
                    } 
                } else if (data>current.data){
                    if (current.right==null) {
                        current.right = new Node_19(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else { //data already exist
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        Node_19 current = root;
        while(current!=null){
            if (current.data != data) {
                result = true;
                break;
            } else if (data>current.data){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    // method d traversePreOrder(), traverseInOrder() dan traversePostOrder(). Method 
    // traverse digunakan untuk mengunjungi dan menampilkan node-node dalam tree, baik dalam 
    // mode pre-order, in-order maupun post-order

    void traversePreOrder(Node_19 node){
        if (node!= null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node_19 node){
        if (node!=null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(Node_19 node){
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    //  Tambahkan method getSuccessor(). Method ini akan digunakan ketika proses penghapusan node 
    // yang memiliki 2 child.

    Node_19 getSuccessor(Node_19 del){
        Node_19 successor = del.right;
        Node_19 successorParent = del;
        while (successor.left!=null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor!=del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    //  Tambahkan method delete().
    // Di dalam method delete tambahkan pengecekan apakah tree kosong, dan jika tidak cari posisi node 
    // yang akan di hapus.

    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        // find node (current) that will be deleted
        Node_19 parent = root;
        Node_19 current = root;
        boolean isLeftChild = false;
        while (current!=null) {
            if (current.data==data) {
                break;
            } else if (data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // dekete

        if (current ==null) {
            System.out.println("Data tidak ditemukan!");
            return;
        } else {
            // if there is no child, simply deleted
            if (current.left==null&&current.right==null) {
                if (current==root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left==null){ //if there is child (right)
                if (current==root) {
                    root = current.right;
                } else{
                    if (isLeftChild) {
                        parent.left=current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right==null){ //if there is child (left)
                if (current==root) {
                    root = current.left;
                } else{
                    if (isLeftChild) {
                        parent.left=current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node_19 successor = getSuccessor(current);
                if (current==root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}
```
class main
```java
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
    }
}
```
contoh output
```
PreOrder Traversal:  6 4 3 5 8 7 9 10 15
inOrder Traversal:  3 4 5 6 7 8 9 10 15
PostOrder Traversal:  3 5 4 7 15 10 9 8 6
Find Node: true
Delete Node 8

PreOrder Traversal:  6 4 3 5 9 7 10 15
```

Percobaan 2
class array
```java
/**
 * BinaryTreeArray_19
 */
public class BinaryTreeArray_19 {

    int[]data;
    int idxLast;

    public BinaryTreeArray_19(){
        data = new int[10];
    }
    void populateData(int data[], int idxLast){
        this.data=data;
        this.idxLast=idxLast;
    }
    void traverseInOrder(int idxStart){
        if (idxStart<=idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
}
```
class main
```java
/**
 * BinaryTreeArrayMain_19
 */
public class BinaryTreeArrayMain_19 {

    public static void main(String[] args) {
        BinaryTreeArray_19 bta = new BinaryTreeArray_19();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal: ");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}
```
contoh output
```
InOrder Traversal: 3 4 5 6 7 8 9
```

Tugas
1.  Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara 
rekursif
```java
// method untuk menambahkan node secara rekursif
    Node_19 addRecursive(Node_19 root, int data){
        if (root == null) {
            root = new Node_19(data);
            return root;
        }
        if (data<root.data) {
            root.left = addRecursive(root.left, data);
        } else if (data > root.data){
            root.right = addRecursive(root.right, data);
        }
        return root; 
    }
```

2.  Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang 
paling besar yang ada di dalam tree.
```java
// method menampilkan nilai paling kecil
    int findMin(){
        return findMinRecursive(root);
    }
    int findMinRecursive(Node_19 root){
        if (root.left==null) {
            return root.data;
        } else{
            return findMinRecursive(root.left);
        }
    }

    // method menampilkan nilai paling besar
    int findMax(){
        return findMaxRecursive(root);
    }
    int findMaxRecursive(Node_19 root){
        if (root.right==null) {
            return root.data;
        } else{
            return findMaxRecursive(root.right);
        }
    }
```

3.  Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf.
```java
void printLeaf() {
        printLeafRecursive(root);
    }

    void printLeafRecursive(Node_19 root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }

        printLeafRecursive(root.left);
        printLeafRecursive(root.right);
    }
```

4.  Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada 
di dalam tree.
```java
int countLeaf() {
        return countLeafRecursive(root);
    }

    int countLeafRecursive(Node_19 root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        } else {
            return countLeafRecursive(root.left) + countLeafRecursive(root.right);
        }
    }
```

5.  Modifikasi class BinaryTreeArray, dan tambahkan :
-  method add(int data) untuk memasukan data ke dalam tree
```java
void add(int data){
        if (idxLast < data) {
            this.data[idxLast] = data;
            idxLast++;
        } else {
            System.out.println("Array sudah penuh!");
        }
    }
```
-  method traversePreOrder() dan traversePostOrder()
```java
void traversePreOrder(int idxStart){
        if (idxStart<=idxLast) {
            System.out.print(data[idxStart]+" ");
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }

    void traversePostOrder(int idxStart){
        if (idxStart<=idxLast) {
            traversePostOrder(2*idxStart+1);
            traversePostOrder(2*idxStart+2);
            System.out.print(data[idxStart]+" ");
        }
    }
```
