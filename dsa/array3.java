package dsa;
import java.util.ArrayList ;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map ; 

public class array3 {
    public static void main(String[] args){
     int[] arr = {1,2,3,4,5,6,7,8,9} ; 
     System.out.println(Arrays.toString(arr)) ; 
     System.out.println(Arrays.toString(arr1(arr)));

     int[] arr2 = {3,5,1,7,8,9} ; 
     System.out.println(findSumPair(arr2, 8));

     array3 obj1 = new array3() ; 
     System.out.println(obj1.findDuplicate(arr2));

     System.out.println("findDuplicate2");
     System.out.println(findDuplicate2(new int[]{23,5,1,3,1,5,3,564,1}));
    }
    public static int[] arr1(int[] arr){
        for(int i = 0 ; i<arr.length-1 ; i += 2){
            int temp = arr[i] ; 
            arr[i] = arr[i+1] ; 
            arr[i+1] = temp ; 
        }

        return arr ;
    }

    // n distinct numbers array . we have to find how many pairs of sum are there that matches to that number.
    // one more thing it is a sorted array 
    public static int findSumPair(int[] arr, int target){
        int len = arr.length ; 
        if(len <= 1 ) {
            return -1 ; 
        }
        int count = 0 ; 
        for(int i = 0 ; i<len ; i++){
            for(int j = i+1 ; j<len ; j++){
                if(arr[i]+ arr[j] == target){
                    count++ ; 
                }
            }
        }
        return count ; 
    }

     public static int findSumPair2(int[] arr, int target){
        int count =  0; 
        int start = 0 ; 
        int end = arr.length ; 
        if(start>end){
           int sum = arr[start] + arr[end] ; 
           if(sum == target){
            count++ ; 
            end-- ; 
            start++ ; 
           }
           if(sum > target){
            end-- ; 
           }else{
            start++ ; 
           }
        }
        return count ; 
    }

    // sort 0 and 1 arrays so that all the zeroes comes in the left side and 1s on the right side 

    public static int[] sort01(int[] arr){
        int start = 0 ; 
        int end = arr.length ; 
        while(start<end){
            if(arr[start] == 1 && arr[end] == 0){
                int temp = arr[start] ; 
                arr[start] = arr[end] ; 
                arr[end] = temp ; 
            }
        }
        return arr ; 
    }

    // sort 0 , 1 and 2 in such a way that it should be ihe array like this [0,1,2] 
    public static int[] srot012(int[] arr){
        int start = 0 , end = arr.length , current = 0 ; 
        while(start<end){
            if(arr[current] == 0){
                 int temp = arr[start] ; 
                 arr[start] = arr[current] ; 
                 arr[current] = temp ; 
                 start++ ; current++; 
            }else if(arr[current] == 2){
                int temp = arr[current] ; 
                arr[current] = arr[end] ; 
                arr[end] = temp ;
                end-- ;  
            }else{
               current++ ; 
            }
        }
        return arr ; 
    }

    // this question is about finding the duplicate element in the array that is only one number 
     public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        for(int i = 0; i<nums.length ; i++){
                map.put(nums[i] , map.getOrDefault(nums[i],0)+1) ; 
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           if(entry.getValue()>1){
            return entry.getKey() ; 
           }
        }
        return -1 ; 
    }

    // this is the same question as the previous one only thing is that it has more one numbers that are found to have repeating numbers . We needt to find those 
    public static ArrayList<Integer> findDuplicate2(int[] nums){
         ArrayList<Integer> list = new ArrayList<>() ; 
         HashMap<Integer,Integer> map = new HashMap<>() ; 
        for(int i = 0; i<nums.length ; i++){
                map.put(nums[i] , map.getOrDefault(nums[i],0)+1) ; 
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           if(entry.getValue()>1){
            list.add(entry.getKey()) ; 
           }
        }

       return list ; 

    }
}
