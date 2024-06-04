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