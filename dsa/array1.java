package dsa;

import java.util.*;

public class array1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 32, 5, 1, -1, 5, -5, 1, 3, -34 };
        System.out.println(Arrays.toString(prob1(arr)));
        System.out.println(Arrays.toString(prob2(arr)));
        System.out.println(Arrays.toString(prob3(arr)));

    }

    public static void sorting1(int[] arr) { // sorting arrays containing 0 , 1 , 2 in the ascending order
        int start = 0, mid = 0, end = arr.length;

        while (mid <= end) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, end, mid);
                    start++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(arr, mid, end);
                    end--;
                    break;
            }
        }
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;

    }

    // this is the problem of finding duplicate strings

    public static void findDuplicateString(String s) {
        char[] ss = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(ss[i], map.getOrDefault(ss[i], 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + ",");
            }
        }
    }

    // move all the negative numbers to the beginnin of the array
    public static int[] prob1(int[] arr) {
        int j = 0;
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    // move all the negatie numbers to the end of the array
    public static int[] prob2(int[] arr) {
        int len = arr.length - 1;
        int j = len;
        int i = len;
        for (; i >= 0; i--) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    // Order preservation part is done over here

    public static int[] prob3(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        // positives first
        for (int num : arr) {
            if (num >= 0) {
                result[index++] = num;
            }
        }

        // negatives at the end
        for (int num : arr) {
            if (num < 0) {
                result[index++] = num;
            }
        }

        return result;
    }


    

}
