package lesson6;

import java.util.Arrays;

public class Inversions {


    // Input:  A[] = [1, 9, 6, 4, 5]
    // The inversion count is 5
    // (9, 6), (9, 4), (9, 5), (6, 4), (6, 5)
    // ((i < j) && arr[i] > arr[j])) == true

    public static void main(String[] args) {
        int[] arr = new int[] {1, 9, 6, 4, 5};
        System.out.println(quadraticInversions(arr));



        System.out.println(linearLogInversions(arr, Arrays.copyOf(arr, arr.length), 0, arr.length - 1));
    }

    static int quadraticInversions(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    static int linearLogInversions(int[] arr, int[] copy, int l, int r) {
        return 0;
    }



    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Метод mergeSort должен возвращать результат (количество инверсий в рассматриваемой части массива)
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    static void merge(int[] arr, int[] copy, int left, int middle, int right) {
        int ind1 = middle - left + 1;
        int ind2 = right - middle;

        /*int[] arrL = new int[ind1];
        int[] arrR = new int[ind2];

        for (int i = 0; i < ind1; i++) {
            arrL[i] = arr[i + left];
        }

        for (int i = 0; i < ind2; i++) {
            arrR[i] = arr[middle + 1 + i];
        }*/

        int i = 0;
        int j = 0;
        int k = left;

        // Сортируем 2 массива между собой
        while (i < ind1 && j < ind2) {
            if (arr[i] <= arr[j]) {
                copy[k] = arr[i];
                i++;
            } else {
                copy[k] = arr[j];
                j++;
            }

            k++;
        }

        // Копируем оставшиеся элементы из arrL, если они есть
        while (i < ind1) {
            copy[k] = arr[i];
            i++;
            k++;
        }

        // Копируем оставшиеся элементы из arrR, если они есть
        while (j < ind2) {
            copy[k] = arr[j];
            j++;
            k++;
        }
    }


}
