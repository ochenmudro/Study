public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 5; i++) {
            list.addLast(i);
        }
        for (int i = 5; i < 10; i++) {
            list.addFirst(i);
        }
        list.remove(6);
        list.print();
        list.search(4);
        list.clear();
        list.print();
    }
}