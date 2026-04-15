public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

       head.next=node2;
       node2.next=node3;

       printHead(head);

    }

    public static void printHead(Node head){
        System.out.println(head.value);
        System.out.println(head.next!=null);
    }
}

class Node {

    Node next;
    int value;

    public Node(int value) {

       this.value = value;
    }


}