package lesson8;

import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.println(Arrays.toString(arr));

        insertFirstElement(arr,10);
        insertFirstElement(arr,9);
        insertFirstElement(arr,8);
        insertFirstElement(arr,7);
        insertFirstElement(arr,6);
        insertFirstElement(arr,5);
        insertFirstElement(arr,4);
        insertFirstElement(arr,3);
        insertFirstElement(arr,2);
        insertFirstElement(arr,1);
    }

    private static void insertFirstElement(int[] arr, int e) {
        /*
        *TODO:
        * Создать массив на 10 элементов,
        * Написать метод, который вставляет переданное значение на 0 позицию в переданный массив
        * Вызвать этот метод 10 раз
        */
    }
}
