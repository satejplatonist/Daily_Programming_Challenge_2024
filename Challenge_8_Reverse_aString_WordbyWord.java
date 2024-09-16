package main;


public class Main 
{
    public static void main(String[] args) 
    {  
       String one = "the sky is blue";
       System.out.println("Reverse String :: Test Case 1 : [" + reverseStringWordToWord(one)+"]");
       
       String two = "  hello world  ";
       System.out.println("Reverse String :: Test Case 2 : [" + reverseStringWordToWord(two)+"]");
       
       String three = "a good example";
       System.out.println("Reverse String :: Test Case 3 : [" + reverseStringWordToWord(three)+"]");
       
       String four = "  ";
       System.out.println("Reverse String :: Test Case 4 : [" + reverseStringWordToWord(four)+"]");
       
       String fifth = "word";
       System.out.println("Reverse String :: Test Case 5 : [" + reverseStringWordToWord(fifth)+"]");
	} 
    
    private static String reverseStringWordToWord(String s)
    {
    	String[] splitArray = s.split(" ");
    	String Result = "";
    	for (int i = splitArray.length-1; i>=0 ; i--) 
    	{
			if(i>0)
			{
				Result += (splitArray[i] + " ");
			}
			else
			{
				Result += splitArray[i];	
			}
			
		}
    	return Result.trim();
    }
   
}

