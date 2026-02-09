package search;

public class linear {
    public static void main(String[] args){
        int result = search(new int[]{2,3,1,10,4} ,3) ; 
        if(result == -1){
            System.out.println("The req num is not there");
        }else{
            System.out.println("The required num is found at index num is -> "+result);
        }
    }

    public static int search(int[] arr , int reqNum){
        int len = arr.length ; 
        if(len == 0 || len == 1){
            return -1 ; 
        }
        for(int i = 0 ; i<len ; i++){
            if(arr[i] == reqNum){
                return i ; 
            }
        }
        return -1 ; 
    }
}
