package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main 
{
    public static void main(String[] args) 
    {  
       String[] str1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
       printResult(groupAnagrams(str1));
       
       String[] str2 = {""};
       printResult(groupAnagrams(str2));
       
       String[] str3 = {"a"};
       printResult(groupAnagrams(str3));
       
       String[] str4 = {"abc", "bca", "cab", "xyz", "zyx", "yxz"};
       printResult(groupAnagrams(str4));
       
       String[] str5 = {"abc", "def", "ghi"};
       printResult(groupAnagrams(str5));
	}  
    
    private static List<List<String>> groupAnagrams(String[] strs) {
        
    	Map<String, List<String>> anagram = new HashMap<>();
        
        for (String word : strs) 
        {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            
            anagram.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }
        
        return new ArrayList<>(anagram.values());
    }
    
    private static void printResult(List<List<String>> result)
    {
    	for (List<String> group : result) {
            System.out.print(group + " ");
        }
    	System.out.println();
    }
   
}

