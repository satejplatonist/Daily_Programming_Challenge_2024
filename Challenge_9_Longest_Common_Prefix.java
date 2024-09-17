package main;

import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) 
    {  
       // Test Case 1
       String[] array1 = {"flower", "flow", "flight"};
       System.out.println("Longest Common Prefix : " + longestCommonPrefix(array1));
       
       // Test Case 2
       String[] array2 = {"dog", "racecar", "car"};
       System.out.println("Longest Common Prefix : " + longestCommonPrefix(array2));
       
       // Test Case 3
       String[] array3 = {"apple", "ape", "april"};
       System.out.println("Longest Common Prefix : " + longestCommonPrefix(array3));
       
       // Test Case 4
       String[] array4 = {""};
       System.out.println("Longest Common Prefix : " + longestCommonPrefix(array4));
       
       // Test Case 5
       String[] array5 = {"alone"};
       System.out.println("Longest Common Prefix : " + longestCommonPrefix(array5));
	}  
    
    private static String longestCommonPrefix(String[] array)
    {
    	if(array.length==0) {return "";}
    	Arrays.sort(array);
        int min = Integer.min(array[0].length(),array[array.length-1].length());
        String result = "";
        for (int i = 0; i < min; i++) {
 		  if(array[0].charAt(i) == array[array.length-1].charAt(i))
 		  {
 			  result += array[0].charAt(i);
 		  }
 		  else if(array[0].charAt(i) != array[array.length-1].charAt(i))
 		  {
 			  break;
 		  }
 	   }
        
       return result;
    }
   
}

