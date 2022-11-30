package lesson8;

import java.util.Arrays;

public class DynamicArray {
    int[] arr = new int[0];

    public void add(int e) {
        int[] tmp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[tmp.length - 1] = e;
        arr = tmp;
    }

    public void remove() {
        int[] tmp = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    public int size() {
        return arr.length;
    }

}
