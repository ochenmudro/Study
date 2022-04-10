public class LinkedList {

    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;

    public void addFirst(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addLast(int data) {
        Node node = new Node();
        node.data = data;
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    public void remove(int data) {
        if (head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        } else {
            Node node = head;
            while (node.next != null) {
                if (node.next.data == data) {
                    if (tail == node.next) {
                        tail = node;
                    }
                    node.next = node.next.next;
                    return;
                }
                node = node.next;
            }
        }
    }

    public void clear() {
        head = null;
    }

    public void search(int data) {
        Node node = head;
        while (node.next != null) {
            if (node.data == data) {
                System.out.println("true");
                return;
            }
            node = node.next;
        }
        if (node.data == data) {
            System.out.println("true");
            return;
        }
        System.out.println("false");
        return;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

}
