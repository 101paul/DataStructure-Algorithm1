package sorting;

public class bubbleSort {
    public static void main(String[] args){
        int arr[] = {2,5,1,8,6,10} ; 
        sorting(arr) ; 
        for(int num : arr){
            System.out.print(num+" , ");
        }
    }

    public static void sorting(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0; j < arr.length-i-1 ; j++){
               if(arr[j]>arr[j+1]){
                  int temp = arr[j+1] ; 
                  arr[j+1] = arr[j] ; 
                  arr[j] =  temp ; 
               }
            }
        }
    }
    
}
