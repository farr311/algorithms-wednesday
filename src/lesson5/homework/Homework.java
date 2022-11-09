package lesson5.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework {

    //TODO
    // 2. Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
    // который будет находиться на k-й позиции в конечном отсортированном массиве.
    // Массив 1 - 100 112 256 349 770
    // Массив 2 - 72 86 113 119 265 445 892
    // к = 7
    // Вывод : 265
    // Окончательный отсортированный массив -
    // 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
    // 7-й элемент этого массива равен 265.

    public static void main(String[] args) {
        /*System.out.println(powerRec(2, 5));

        for (int i = 0; i < 11; i++) {
            System.out.println(powerRec(2, i, 1));
        }*/

        int r = findElement(new int[] { 100, 112, 256, 349, 770 }, new int[] { 72, 86, 113, 119, 265, 445, 892 }, 7);
        System.out.println(r);
    }

    // O(arr1.length + arr2.length) = O(n)
    // O(k) = O(n)
    static int findElement(int[] arr1, int[] arr2, int k) {
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < arr1.length + arr2.length; i++) {
            int e;

            if (arr1[index1] > arr2[index2]) {
                e = arr2[index2];

                if (index2 < arr2.length - 1) {
                    index2++;
                }
            } else {
                e = arr1[index1];

                if (index1 < arr1.length - 1) {
                    index1++;
                }
            }

            if (i == k) {
                return e;
            }
        }

        return -1;
    }

    //{1, 1, 2, 2, 2, 2, 3,}


    // 10 20 15
    // 21 30 14
    // 7  16 32




    static long powerRec(int x, int y, long r) {
        if (y == 0) {
            return r;
        }

        if (y % 2 == 1) {
            r *= x;
        }

        return powerRec(x * x, y / 2, r);
    }

    static long powerRec(int x, int y) {
        if (y == 0) {
            return 1;
        }

        if (y == 1) {
            return x;
        }

        return x * powerRec(x, y - 1);
    }

    long power(int a, int b) {
        long result = a;

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;
    }
}
