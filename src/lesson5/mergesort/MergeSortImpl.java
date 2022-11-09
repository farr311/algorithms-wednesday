package lesson5.mergesort;

public class MergeSortImpl {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 6, 87, 1, 0, 52, 42, 41, 1, 5, 7 };

        mergeSort(arr, 0, arr.length - 1);
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    static void merge(int[] arr, int left, int middle, int right) {
        int ind1 = middle - left + 1;
        int ind2 = right - middle;

        int[] arrL = new int[ind1];
        int[] arrR = new int[ind2];

        for (int i = 0; i < ind1; i++) {
            arrL[i] = arr[i + 1];
        }

        for (int i = 0; i < ind2; i++) {
            arrR[i] = arr[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = 0;

        // Сортируем 2 массива между собой
        while (i < ind1 && j < ind2) {

        }

        // Копируем оставшиеся элементы из arrL, если они есть
        while (i < ind1) {

        }

        // Копируем оставшиеся элементы из arrR, если они есть
        while (j < ind2) {

        }
    }
}
