public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addPerson(int queueNumber, String name) {
        Node newNode = new Node(queueNumber, name);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public Node removePerson() {
        if (head == null) {
            System.out.println("Antrian vaksin kosong.");
            return null;
        }
        Node removedNode = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return removedNode;
    }
    
    

    public void printQueue() {
        if (head == null) {
            System.out.println("Daftar penerima vaksin kosong.");
            return;
        }
        Node current = head;
        // System.out.println("-------------------------------------------------");
        System.out.printf("| %-10s | %-20s |\n", "No", "Nama");
        // System.out.println("-------------------------------------------------");
        while (current != null) {
            System.out.printf("| %-10d | %-20s |\n", current.queueNumber, current.name);
            current = current.next;
        }
        // System.out.println("-------------------------------------------------");
    }    

    public int getQueueSize() {
        return size;
    }
}