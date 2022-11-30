package lesson8;

import java.util.Arrays;

public class DynamicArray {
    int[] arr = new int[0];

    public void add(int e) {
        // При добавлении каждого элемента увеличить размер массива на 1
    }

    public void remove() {
        // При удалении каждого элемента уменьшить размер массива на 1
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    public int size() {
        return arr.length;
    }

}
