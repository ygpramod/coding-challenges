package algo;

public class LinkedList {

    private Node head = null;
    private Node tail = null;
    int size = 0;

    private static class Node {
        final int value;
        Node previous;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void addAtHead(int element) {
        if (head == null) {
            head = new Node(element);
            tail = head;
        } else {
            Node oldHead = head;
            head = new Node(element);
            head.next = oldHead;
            oldHead.previous = head;
            if (size == 1) {
                tail = oldHead;
            }
        }
        size++;
    }

    public void add(int element) {
        if (head == null) {
            head = new Node(element);
            tail = head;
        } else {
            Node oldTail = tail;
            tail = new Node(element);
            tail.previous = oldTail;
            oldTail.next = tail;
        }
        size++;
    }

    public void add(int element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Please provide a valid index to insert the element");
        }
        if (index == 0) {
            addAtHead(element);
            return;
        }
        if (index == size) {
            add(element);
            return;
        }
        Node previousNode = head;
        for (int i = 0; i < index - 1; i++) {
            previousNode = previousNode.next;
        }
        Node nextNode = previousNode.next;
        Node newNode = new Node(element);
        newNode.next = nextNode;
        newNode.previous = previousNode;
        previousNode.next = newNode;
        nextNode.previous = newNode;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Please provide a valid index to get the element");
        }
        Node requiredNode = head;
        for (int i = 0; i < index; i++) {
            requiredNode = requiredNode.next;
        }
        return requiredNode.value;
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Please provide a valid index to remove the element");
        }
        if (size == 1) {
            Node nodeToRemove = head;
            head = null;
            tail = null;
            size--;
            return nodeToRemove.value;
        }
        if (index == 0) {
            Node nodeToRemove = head;
            head = nodeToRemove.next;
            head.previous = null;
            size--;
            return nodeToRemove.value;
        }

        if (index == size - 1) {
            Node nodeToRemove = tail;
            tail = nodeToRemove.previous;
            tail.next = null;
            size--;
            return nodeToRemove.value;
        }

        Node nodeToRemove = head;
        for (int i = 0; i < index; i++) {
            nodeToRemove = nodeToRemove.next;
        }
        Node previousNode = nodeToRemove.previous;
        Node nextNode = nodeToRemove.next;

        previousNode.next = nextNode;
        nextNode.previous = previousNode;
        size--;
        return nodeToRemove.value;
    }

    public int getHead() {
        return head.value;
    }

    public int getTail() {
        return tail.value;
    }
}


