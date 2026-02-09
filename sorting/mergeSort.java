package sorting;
public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 8, 2, 5, 3, 4, 7, 6, 1 };
        sort(arr); // time complexity is always O(nlogn) so does the space complexity
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " , ");
        }
    }

    private static void sort(int[] arr) {
        int len = arr.length;
        if (len <= 1) { // so this is the base case as you can see
            return;
        }

        int middle = len / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[len - middle];

        int i = 0; // left array
        int j = 0; // right array

        for (; i < len; i++) {
            if (i < middle) {
                leftArray[i] = arr[i];
            } else {
                rightArray[i] = arr[i];
                j++;
            }
        }
        sort(leftArray);
        sort(rightArray);
        merge(leftArray, rightArray, arr);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // indices that we will be using

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
