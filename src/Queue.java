class Node1{
    int data;
    Node1 next;
}

public class Queue {
    Node1 head;
    Node1 tail;

    public void enQueue(int data){
        Node1 node = new Node1();
        node.data = data;
        node.next = null;

        if(head==null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
            /*Node1 tempNode = head;
            while(tempNode.next!=null){
                tempNode = tempNode.next;
            }*/
        }
    }

    public void deQueue(){
        Node1 tempNode = head;
        head = head.next;
        /*Node1 tempNode = head;
        head = tempNode.next;*/
    }

    public void show(){
        Node1 tempNode = head;
        while(tempNode.next!=null){
            System.out.print(tempNode.data+" ");
            tempNode = tempNode.next;
        }
        System.out.print(tempNode.data);
        System.out.println();
    }

    public void isEmpty(){
        if(head==null){
            System.out.println("The queue is null");
        }
        else{
            System.out.println("The queue contains some elements");
        }
    }

    public void peek(){
        Node1 tempNode = head;
        System.out.println(tempNode.data);
    }

    public void deleteQueue(){
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.isEmpty();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);
        queue.enQueue(10);
        queue.enQueue(11);

        queue.show();

        queue.deQueue();

        queue.show();

        queue.deQueue();

        queue.show();

        queue.peek();
        queue.isEmpty();

        queue.deleteQueue();
        queue.isEmpty();
    }
}