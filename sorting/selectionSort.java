package sorting;

public class selectionSort {

    public static void main(String[] args){
       int[] arr = {2,5,23,1,0,10} ; 
       selectionSort(arr) ; 
       for(int i : arr){
        System.out.print(i+",");
       }
    }
    public static void selectionSort(int[] arr){
       for(int i = 0 ; i<arr.length ; i++){
         int min = i ; 
         for(int j= i+ 1 ; j<arr.length ; j++){
            if(arr[min]>arr[j]){
                min = j ; 
            }
         }
         int temp = arr[i] ; 
         arr[i] = arr[min] ; 
         arr[min] = temp ; 
       }
    }
    
}
