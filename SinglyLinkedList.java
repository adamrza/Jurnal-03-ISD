import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String nama;

    public SinglyLinkedList() {
        this("linked list");
    }

    public SinglyLinkedList(String listNama) {
        nama = listNama;
        firstNode = lastNode = null;
    }

    private boolean isEmpty() {
        return firstNode == null;
    }

    public void insertAtFront(E insertItem) {
        ListNode newNode = new ListNode(insertItem);

        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack(E insertItem) {
        ListNode newNode = new ListNode<E>(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(nama + "is ");
        }
        E removedItem = firstNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        }else {
            ListNode<E> current = firstNode;
            current = firstNode;
            firstNode = current.next;
            current.next = null;
        }
        return removedItem;
    }



    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(nama + "kosong");
        }
        E removedItem = lastNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode;

            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removedItem;
    }


    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", nama);
            return;
        }

        System.out.printf("The %s: %n", nama);
        ListNode<E> current = firstNode;

        while (current !=null) {
            System.out.printf("%s %n", current.data);
            current = current.next;
        }
        System.out.println();
    }
}
