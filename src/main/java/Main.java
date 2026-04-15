import io.qameta.allure.util.ObjectUtils;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        head.next = node2;
        node2.next = node3;

        printHead(head);
        System.out.println(numberOfNodes(head));
        System.out.println(sumOfNodeValues(head));
        System.out.println(valueOfLastNode(head));
        System.out.println(checkListProperties(head));


    }

    public static void printHead(Node head) {
        System.out.println(head.value);
        System.out.println(head.next != null);
    }

    public static boolean isNumberPresentInNode(Node head, int targetNumber) {
        while (head != null) {
            if (head.value == targetNumber) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static int numberOfNodes(Node head) {

        int numberOfNodesCounter = 0;
        while (head != null) {
            head = head.next;
            numberOfNodesCounter++;
        }
        return numberOfNodesCounter;
    }

    public static int sumOfNodeValues(Node head) {
        int sumOfNodesValuesCounter = 0;

        while (head != null) {
            sumOfNodesValuesCounter = head.value + sumOfNodesValuesCounter;
            head = head.next;

        }
        return sumOfNodesValuesCounter;

    }

    public static int valueOfLastNode(Node head) {
        while (head.next != null) {
            head = head.next;
        }
        return head.value;
    }

    public static boolean checkListProperties(Node head) {
        boolean hasEven = false;

        while (head != null) {
            if (head.value % 2 == 0) {
                hasEven = true;
            }
            head = head.next;
        }

        return hasEven;
    }

}

class Node {

    Node next;
    int value;

    public Node(int value) {

        this.value = value;
    }


}