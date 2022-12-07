package lesson9;

public class CustomLinkedList implements CustomList {

    private Node head;
    private Node tail;

    private int size = 0;

    @Override
    public void pushToHead(int data) {
        if (size == 0) {
            head = new Node(data);
            tail = head;
        } else {
            head = new Node(data, head);
        }

        size++;
    }

    @Override
    public void pushToTail(int data) {
        if (size == 0) {
            tail = new Node(data);
            head = tail;
        } else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
        }

        size++;
    }

    @Override
    public void pushToIndex(int index, int data) {
        if (index == 0) {
            pushToHead(data);
        } else if (index == size) {
            pushToTail(data);
        } else {
            Node prevNode = getElement(index - 1);
            Node currentNode = new Node(data, prevNode.getNext());
            prevNode.setNext(currentNode);

            size++;
        }
    }

    @Override
    public void removeFirst() {
        head = head.getNext();

        if (size == 1) {
            tail = null;
        }

        size--;
    }

    @Override
    public void removeLast() {
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node prev = getElement(size - 2);
            prev.setNext(null);
        }
        size--;
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node prevNode = getElement(index - 1);
            prevNode.setNext(prevNode.getNext().getNext());

            size--;
        }
    }

    @Override
    public int get(int index) { return getElement(index).getValue(); }

    @Override
    public void clear() {

    }

    @Override
    public void set(int index, int data) { getElement(index).setValue(data); }

    @Override
    public boolean contains(int data) {
        return false;
    }

    @Override
    public int size() { return size; }

    @Override
    public void print() {
        //Вывод в консоль значений в формате [1, 2, 3, 4, 5, 6]
    }

    private Node getElement(int index) {
        Node currentNode = null;

        for (int i = 0; i <= index; i++) {
            if (i == 0) {
                currentNode = head;
            } else if (currentNode != null) {
                currentNode = currentNode.getNext();
            }
        }

        if (currentNode == null) {
            throw new RuntimeException();
        }

        return currentNode;
    }

    private static class Node {
        private int value;
        private Node next;


        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
