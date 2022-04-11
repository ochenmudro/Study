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
            if (head.data == data) {
                head = null;
                tail = null;
            }
            return;
        }

        if (head.data == data) {
            head = head.next;
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

    public boolean search(int data) {
        Node node = head;
        if (head == null) {
            System.out.println("no elements in list");
            return false;
        }
        while (node.next != null) {
            if (node.data == data) {
                return true;
            }
            node = node.next;
        }
        return node.data == data;
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

