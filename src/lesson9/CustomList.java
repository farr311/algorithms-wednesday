package lesson9;

public interface CustomList {

    void pushToHead(int data);

    void pushToTail(int data);

    void pushToIndex(int index, int data);

    void removeFirst();

    void removeLast();

    void remove(int index);

    int get(int index);

    void clear();

    void set(int index, int data);

    boolean contains(int data);

    int size();

    void print();
}
