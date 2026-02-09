package dsa;

public class matrix1 {
    public static void main(String[] args) {
 int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(findElementInMatrix(matrix));
    }

    // To find the element from an 2d array or matrix , *** important question *** ,
    // approach is we are applying binary seach two times
    public static boolean findElementInMatrix(int[][] arr){ // here the time complexity is log(n*m) ; where n is the coolumn and m is the row or vice versa 
        int target = 8; 
        int row = searchPotentialRow(arr, target);
        if (row != -1) return binarySeachOverRow(row, arr, target);
        return false ; 
    }   

    public static int searchPotentialRow(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid][0] < target && matrix[mid][matrix.length - 1] > target) {
                return mid;
            } else if (matrix[mid][0] > target) {
                high = mid - 1;
            } else if (matrix[mid][0] < target) {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static boolean binarySeachOverRow(int rowId, int[][] m, int target) {
        int low = 0;
        int high = m[rowId].length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (m[rowId][mid] == target) {
                return true;
            } else if (m[rowId][mid] > target) {
                high = mid - 1;
            } else if (m[rowId][mid] < target) {
                low = mid + 1;
            }
        }
        return false;
    }
}
