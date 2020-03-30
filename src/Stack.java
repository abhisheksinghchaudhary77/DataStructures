class Node {
    int data;
    Node next;

    /*public Node(int data){
        this.data = data;
        this.next = null;
    }*/
}


public class Stack {
    Node head;

    public void push(int data){
        Node node = new Node();
        node.data = data;
        node.next = this.head;
        //node.next = null;

        this.head = node;
        /*if(head==null){
            head = node;
        }else{
            Node tempNode = head;
            while(tempNode.next!=null){
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }*/
    }

    public void pop(){
        Node tempNode = head;
        this.head = this.head.next;
    }

    public void peek(){
        Node tempNode = head;
        System.out.println(tempNode.data);
    }

    public void isEmpty(){
        if(head==null){
            System.out.println("The stack is empty");
        }else{
            System.out.println("The stack is not empty and has at least 1 element");
        }
    }

    public void display(){
        Node tempNode = head;
        while(tempNode.next!=null){
            System.out.print(tempNode.data+" ");
            tempNode = tempNode.next;
        }
        System.out.print(tempNode.data);
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        stack.display();

        stack.pop();

        stack.display();

        stack.pop();

        stack.display();

        stack.peek();

        stack.isEmpty();
    }

}