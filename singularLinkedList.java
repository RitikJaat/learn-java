// used to efficently insert (frequently)

// import org.w3c.dom.Node;

public class singularLinkedList {
    Node head;
    private int size;

    singularLinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add/insert node
    // add first,
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print
    public void printlist() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // delete node
    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secLast = head;
        Node lastNode = head.next;// if head.next is null than lastnode = null
        while (lastNode.next != null) {// null.next ->error
            lastNode = lastNode.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }
    // check size
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        singularLinkedList list = new singularLinkedList();
        System.out.println("\n-----Adding nodes-----\n");
        list.addFirst("a ");
        list.addFirst("is ");
        list.printlist();

        System.out.println("\tadding to last");
        list.addLast("Singular linked list");
        list.printlist();

        System.out.println("\tadding to beggining");
        list.addFirst("This ");
        list.printlist();

        System.out.println("\n-----Deleting nodes-----\n");
        System.out.println("\tDeleting first");
        list.deleteFirst();
        list.printlist();

        System.out.println("\tDeleting last");
        list.deleteLast();
        list.printlist();

        System.out.println("-----Size of Nodes-----");
        System.out.println(list.getSize());
    }
}
