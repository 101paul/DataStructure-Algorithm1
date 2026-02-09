package dsa;
import java.util.* ; 
public class string1 {
    public static void main(String[] args){

    }
    // make two strings anagram by removing the extra letters . 
    // in the code , just we need to return the no of letters that are extra . 

    public static int makeAnagram(String s1 , String s2){
        HashSet<Character> set = new HashSet<>() ; // this code becomes wrong by using HashSet<> as it does not count frequency . 
        int count = 0 ;  
        for(char x : s1.toCharArray()){
            set.add(x) ; 
        }

        for(int i = 0 ; i<s2.length() ; i++){
            if(!set.contains(s2.charAt(i))){
               count++ ; 
            }
        }

        return count ; 
    }
    
    // this is the solution of the above problem 
    // this solution of the problem is like check two strings are anagram or not like 

    public static int makeAnagram2(String s1 , String s2){
        int[] arr = new int[26] ; 
        for(char data : s1.toCharArray()){
            arr[data -'a']++ ; 
        }
        for(char data : s2.toCharArray()){
            arr[data -'a']-- ; 
        }

        int count = 0 ; 

        for(int value : arr){
            if(value == 0){
                count++ ; 
            }
        }
        return count ; 
    }
    
}
