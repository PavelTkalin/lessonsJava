import io.qameta.allure.util.ObjectUtils;

class NoNodeIndexException extends Exception {
    public NoNodeIndexException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) throws NoNodeIndexException {
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        head.next = node2;
        node2.next = node3;

//        printHead(head);
//        System.out.println(numberOfNodes(head));
//        System.out.println(sumOfNodeValues(head));
//        System.out.println(valueOfLastNode(head));
//        System.out.println(checkListProperties(head));
        System.out.println(insertToTheList(head,14,2));

        try {
            System.out.println(valueOfNode(head, 3));
        } catch (NoNodeIndexException e) {
            System.out.println("no such index");
        }


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

    public static int valueOfNode(Node head, int target) throws NoNodeIndexException {

        int counter = 0;
        while (head instanceof Node) {
            if (counter == target) {
                return head.value;
            }
            head = head.next;
            counter++;

        }
        throw new NoNodeIndexException("No element with index = " + target);

    }

    public static int deletionOfNode(Node head, int target) throws NoNodeIndexException {

        int counter = 0;
        while (head instanceof Node) {
            if (counter == target - 1) {
                head.next = head.next.next;
            }
            head = head.next;
            counter++;

        }
        throw new NoNodeIndexException("No element with index = " + target);

    }

    public static Node insertToTheList(Node head, int value, int position) throws NoNodeIndexException {

        Node newNode = new Node(value);


        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        if (head == null) {
            throw new NoNodeIndexException("List is empty, cannot insert at position " + position);
        }

        Node current = head;
        int counter = 0;

        while (current != null && counter < position - 1) {
            current = current.next;
            counter++;
        }

        if (current == null) {
            throw new NoNodeIndexException("No element with index = " + position);
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }


}

class Node {

    Node next;
    Node prev;
    int value;

    public Node(int value) {

        this.value = value;
    }


}