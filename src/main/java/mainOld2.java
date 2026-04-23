public class mainOld2 {


    public static void main(String[] args) throws MyLinkedListOutOfIndexException {
        String[] valuesOfStrings = {"A", "B", "C", "D", "E"};
        MyLinkList<String> listOfStrings = new MyLinkList<>(valuesOfStrings);
        listOfStrings.print();

//        listOfStrings.addToEnd("F");
//        listOfStrings.print();

        listOfStrings.addToPosition("x",2);
        listOfStrings.removeFromPosition(2);

        try {
            listOfStrings.removeFromEnd();
        } catch (
                MyLinkedListOutOfIndexException e) {
            //
        }

  listOfStrings.print();

    }
}

class MyLinkedListOutOfIndexException extends Exception {
    public MyLinkedListOutOfIndexException(String message) {
        super(message);
    }
}

class MyLinkList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public MyLinkList(T[] values) {
        for (int i = 0; i < values.length; ++i) {
            this.addToEnd(values[i]);
        }
    }

    public void removeFromEnd() throws MyLinkedListOutOfIndexException {
        if (this.head == null) {
            throw new MyLinkedListOutOfIndexException("Cannot remove last element - list is empty");
        }

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
            return;
        }

        // 1. [1] <-> [2] <-> [3] (tail) <-> null
        // 1. [1] <-> [2] (tail) <-> [3] <-> null
        // 1. [1] <-> [2] (tail) -> null
        this.tail = this.tail.prev;
        this.tail.next = null;
        --this.size;
    }

    public void addToEnd(T value) {
        // на вход - 3 / "hello"
        // делаем из этого объект класса Node - [3] / ["hello"]
        Node<T> newNode = new Node<>(value);

        // [1] <-> [2] <-> Null ( <-> [3] )
        // IF: add to existing node
        if (this.head != null) {
            // 0. [3]
            // 1. [1] <-> [2] (tail) <-> null
            // 2. [1] <-> [2] (tail) -> (next) [3]
            // 3. [1] <-> [2] (tail) <- (prev) [3]
            // result 2 and 3: 4. [1] <-> [2] (tail) <-> [3]
            // 5. [1] <-> [2] <-> [3] (tail)

            // add newNode to the end of the chain
            this.tail.next = newNode;
            newNode.prev = this.tail;

            // call newNode as a tail
            this.tail = newNode;
        }

        // ( head -> [3] )
        // ELSE (this.head == null): create a head, add a node
        else {
            this.head = newNode;
            this.tail = newNode;
        }

        ++this.size;
    }

    public void addToPosition(T value, int position) throws MyLinkedListOutOfIndexException {

        Node<T> newNode = new Node<>(value);


        if (position == 0) {
            newNode.next = this.head;


            if (this.head != null) {

                this.head.prev = newNode;
            }

            this.head = newNode;

            if (this.size == 0) {
                this.tail = newNode;
            }
            this.size++;
            return;

        }

        if (position == this.size) {
            addToEnd(value);
            return;
        }

        Node<T> current = this.head;
        for (int i = 0; i < position; i++) {
            current = current.next;
            Node<T> previous = current.prev;

            previous.next = newNode;
            newNode.prev = previous;

            newNode.next = current;
            current.prev = newNode;

            this.size++;
        }

    }

    public void removeFromPosition(int position) throws MyLinkedListOutOfIndexException {
        if (position < 0 || position >= this.size) {
            throw new MyLinkedListOutOfIndexException("Invalid position");
        }


        if (position == 0) {
            this.head = this.head.next;

            if (this.head != null) {
                this.head.prev = null;
            } else {
                this.tail = null;
            }

            this.size--;
            return;
        }


        if (position == this.size - 1) {
            removeFromEnd();
            return;
        }


        Node<T> current = this.head;

        for (int i = 0; i < position; i++) {
            current = current.next;
        }

        Node<T> previous = current.prev;
        Node<T> next = current.next;

        previous.next = next;
        next.prev = previous;

        this.size--;
    }

    public void print() {
        Node<T> currentNode = this.head;

        while (currentNode != null) {
            System.out.print("[" + currentNode.value + "] <-> ");
            currentNode = currentNode.next;
        }

        System.out.print("null\n");
    }
}

// Null <- [1] (head) <-> [2] <-> [3] (tail) -> Null
class Node<T> {
    public T value;
    public Node next;
    public Node prev;

    public Node(T value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node next) {
        this.prev = next;
    }


}



