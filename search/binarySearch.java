package search;

public class binarySearch {
    public static void main(String[] args){
        int[] x = {1,2,3,4,5,6,7} ; 
        System.out.println(binarySeach101(x,6));
    }

    public static int binarySeach101(int[] arr , int target){ // The thing about binary search it only works in the sorted array 
        int start = 0 ; 
        int end = arr.length -1  ; 
        while(start<=end){
            int mid = start + (end - start )/2  ; 
            if(arr[mid] == target){
               return mid ; 
            }else if(arr[mid] > target){
                end = mid-1 ;  
            }else{
                start = mid + 1 ; 
            }
        }
        return -1 ; 
    }
}
