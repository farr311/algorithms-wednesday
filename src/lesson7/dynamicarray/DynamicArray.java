package lesson7.dynamicarray;

public class DynamicArray implements Dynamic {

    private int[] array;


    public DynamicArray() {
        array = new int[...];
    }

    // Конструктор с заданным начальным размером массива
    public DynamicArray(int capacity) {

    }

    // Добавление элемента в конец массива
    @Override
    public void add(int value) {

    }

    // Добавление элемента по индексу
    @Override
    public void addAt(int index, int value) {

    }

    // Удаление последнего элемента
    @Override
    public void remove() {

    }

    // Удаление элемента по индексу
    @Override
    public void removeAt(int index) {

    }

    // Увеличивает размер массива. Вызывается когда нужно добавить элемент на позицию, больше, чем размер массива
    private void growSize() {

    }

    // Уменьшает размер массива до количества элементов
    @Override
    public void shrinkSize() {

    }

    // Записывает новое значение в массив по индексу
    @Override
    public void set(int index, int value) {

    }

    // Получение элемента по индексу
    @Override
    public int get(int index) {
        return 0;
    }

    // Удаление всех элементов из массива (массив меняет свое значение на дефолтное)
    @Override
    public void clear() {

    }

    // Проверяет, есть ли данный элемент в массиве
    @Override
    public boolean contains(int value) {
        return false;
    }

    // Проверяет, является ли массив пустым
    @Override
    public boolean isEmpty() {
        return false;
    }
}
