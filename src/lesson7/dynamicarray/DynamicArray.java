package lesson7.dynamicarray;

import java.util.Arrays;

public class DynamicArray implements Dynamic {

    private int[] array;

    private static final int DEFAULT_CAPACITY = 8;

    private int capacity;
    private int size = 0;


    public DynamicArray() {
        array = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    // Конструктор с заданным начальным размером массива
    public DynamicArray(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
    }

    // Добавление элемента в конец массива
    @Override
    public void add(int value) {
        if (size >= capacity) {
            growSize(-1);
        }
        array[size++] = value;
    }

    // Добавление элемента по индексу
    @Override
    public void addAt(int index, int value) {
        if (size >= capacity) {
            growSize(index);
        } else {
            for (int i = size - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
        }
        array[index] = value;
        size++;
    }

    // Удаление последнего элемента
    @Override
    public void remove() { array[--size] = 0; }

    // Удаление элемента по индексу
    @Override
    public void removeAt(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    // Увеличивает размер массива. Вызывается когда нужно добавить элемент на позицию, больше, чем размер массива
    private void growSize(int index) {
        capacity *= 2;
        int[] tempArr = new int[capacity];

        if (index == -1) {
            for (int i = 0; i < size; i++) {
                tempArr[i] = array[i];
            }
        } else {
            for (int i = 0; i < size; i++) {
                int pos = i < index ? i : i + 1;
                tempArr[pos] = array[i];
            }
        }

        array = tempArr;
    }

    // Уменьшает размер массива до количества элементов
    @Override
    public void shrinkSize() {
        capacity = size;
        int[] tempArr = new int[capacity];

        for (int i = 0; i < size; i++) {
            tempArr[i] = array[i];
        }

        array = tempArr;
    }

    // Записывает новое значение в массив по индексу
    @Override
    public void set(int index, int value) { array[index] = value; }

    // Получение элемента по индексу
    @Override
    public int get(int index) { return array[index]; }

    // Удаление всех элементов из массива (массив меняет свое значение на дефолтное)
    @Override
    public void clear() {
        array = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
        size = 0;
    }

    // Проверяет, есть ли данный элемент в массиве
    @Override
    public boolean contains(int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    // Проверяет, является ли массив пустым
    @Override
    public boolean isEmpty() { return size == 0; }

    public void print() { System.out.println(Arrays.toString(array)); }
}
