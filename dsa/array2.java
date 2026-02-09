package dsa;

import java.util.HashMap;
import java.util.HashSet;

public class array2 {
    public static void main(String[] args) {
        // String[] data = { "12345679", "2", "356210" };
        // System.out.println(Arrays.toString(prob1(data)));
        System.out.println(noOfChocolate(20,4));
    }

    // Length of the last word -> string question
    // like string given -> " hello this is paul" from here , we need to
    // to find the length of the last character that is "paul" -> i.e 4

    public static int findLength(String s) {

        String result = s.trim();

        int count = 0;

        for (int i = result.length() - 1; i >= 0; i--) {
            if (result.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    // First unique character in a String

    public static int firstUniqueCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int index = -1;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < len; i++) {
            if (map.get(s.charAt(i)) == 1) {
                index = i;
                break;
            }
        }

        return index;
    }

    // check if two two strins are angram or not

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        int[] counts = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            counts[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            counts[str2.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    // Encrypt the N number of phone numbers where old place digits come at the
    // front and even at the end

    public static String[] prob1(String[] data) {

        int len = data.length;
        String[] result = new String[len];

        for (int i = 0; i < len; i++) {
            String value = "";
            String number = data[i];

            if (number.length() == 2 || number.length() == 1) {
                result[i] = number;
                continue;
            }
            for (int f = 0; f < number.length(); f += 2) {
                value += number.charAt(f);
            }
            for (int j = 1; j < number.length(); j += 2) {
                value += number.charAt(j);
            }

            result[i] = value;

        }

        return result;

    }

    /// number of chocolate in the box , delloite problem
    public static int noOfChocolate(int x, int y) {
        int box = 0;
        while (x != 0 || y != 0) {
            if (x == y) {
                break ; 
            }
            if (x > y) {
                box = box + y;
                x = x - y;
            } else {
                box = box + x;
                y = y - x;
            }
        }

        return box;

    }

    // You are given an array and you need to choose a contiguous subarray of
    // length 'k'. Then , find the minimum value within the subarray 
    // and return the maximum of those minimum values . 

    // sample input 

    // length of the subarray : 2 
    // size of the array : 6 
    // array ele : [3,1,4,6,2,5] ; 

    // output 
    // 4 
    public static int maxNum(int[] arr , int k){ // here , k is the subarray size 
        int len = arr.length ; 
        int max = Integer.MIN_VALUE ;  
        for(int i = 0 ; i<=len - k ; i++){
            int min = Integer.MAX_VALUE ; 
            for(int j = i ; j<i+k ; j++){
                min = Math.min(min,arr[j])  ; 
            }
            max = Math.max(max,min) ; 
        }
        return max ; 
    }

    

    ///Another question 
    /// we have to remove the letter from the input string that are present 
    /// in teh word STRUCTURAL 
    

    public static String word(String key, String word){
        int len = key.length() ; 
        HashSet<Character> set = new HashSet<>() ;
        String result = "" ;  
        for(char x : key.toCharArray()){
            set.add(x) ; 
        }
        for(char x : word.toCharArray()){
            if(!set.contains(x)){
                result += x ; 
            }
        }
        return result ; 
    }}
