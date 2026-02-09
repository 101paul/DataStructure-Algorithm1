package dsa;
import java.util.* ; 
public class string2 {
    public static void main(String[] args){
        allsubstring("hello");
        int[] arr = {1,2,3,4,5,6,7,8,9} ; 
        String result = Arrays.toString(reverseArray(arr)) ; 
        System.out.println(result);
    }
    // in this question , just we need to find the all the possible substring in a string 
    
    public static void allsubstring(String s){
        int len = s.length() ; 
        for(int i = 0 ; i<len ; i++){
            for(int j = i+1 ; j<=len ; j++){
              System.out.println(s.substring(i,j));
            }
        }
    }

    // Given 2 strings , determine if they have a common sub-string 
    // str1 = "cat" , str2 = "rat" , common substring = "at" like this 
    // str1 = "art" , str2 = "a" , common substring = "a" 
    // str1 = "study" , str2 = "algo" , common substring = "" 


    public static boolean substring(String s1 , String s2){
      HashSet<Character> set1 = new HashSet<>() ; 
      HashSet<Character> set2 = new HashSet<>() ; 

      for(char x1 : s1.toCharArray()){
        set1.add(x1) ; 
      }
      for(char x2 : s2.toCharArray()){
        set2.add(x2) ;
      }

      set1.retainAll(set2) ; 
      if(!set1.isEmpty()){
        return true ; 
      }
      return false ; 
    }

    // this is the code of finding out the largest common substring b/w two strings
    // good problem 
    
    public static String lsubstring(String s1 , String s2){
        int len1 = s1.length() ; 
        int len2 = s2.length() ; 
        if(len1>len2){
            String temp = s1 ; 
            s1 = s2 ;
            s2 = temp ; 
        }
        String result = "" ; 
        for(int i = 0 ; i<len1 ; i++){
            for(int j = 1 ; j<=len1 ; j++){
                String sub = s1.substring(i,j) ; 
                if(s2.contains(sub) && sub.length() > result.length() ){
                    result= sub ; 
                }
            }
        }
        return result ; 
    }
    // repeated occurances of letters in string 
    //like aaaabbabab -> reutrn "" (empty string) 
    //and aaabbab -> return "ab" 
    // important problem 
    public static String superReduceString(String s){
        int index = 1 ; 
        StringBuilder sb = new StringBuilder(s) ; 
        while(index<sb.length()){
            if(sb.charAt(index-1) == sb.charAt(index)){
                sb.delete(index-1,index+1) ; 
                index = Math.max(1 , index-1) ; 
            }else index++ ; 
        }

        return sb.length() > 0 ? sb.toString() : "empty string" ; 
    }

    // it can be done by stack 
    public static String superReducedStringUsingStacks(String str){
        Stack<Character> stack = new Stack<>() ; 
        for(char c : str.toCharArray()){
            if(stack.isEmpty())
                stack.push(c) ; 
            else if(c == stack.peek())
                stack.pop() ; 
            else
                stack.push(c) ;
        }

        StringBuilder sb = new StringBuilder() ; 
        for(char c : stack){
            sb.append(c) ; 
        }  
        return sb.length() >0 ? sb.toString() : "empty string" ;      
    }

    // reverse the array 
    public static int[] reverseArray(int[] arr){
       int start = 0 ; 
       int end = arr.length - 1 ; 
       while(start < end){
           int temp = arr[start] ; 
           arr[start] = arr[end] ; 
           arr[end] = temp ;
           start++ ; end-- ;    
       }
       return arr; 
    }
    
}
