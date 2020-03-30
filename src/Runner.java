public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.insertAtStart(55);

        list.insertAt(3, 56);

        list.insertAtEnd(45);
        list.insertAtEnd(85);
        list.insertAtEnd(78);

        list.show();
    }
}