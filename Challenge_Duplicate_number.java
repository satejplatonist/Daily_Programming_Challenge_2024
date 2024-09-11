package main;


public class Main 
{
	public static void main(String[] args) 
    {
	   int[] array1 = {1, 3, 4, 2, 2};
	   System.out.println("Duplicate value is : " + duplicate(array1) );
	   int[] array2 = {3, 1, 3, 4, 2};
	   System.out.println("Duplicate value is : " + duplicate(array2) );
	   int[] array3 = {1, 1};
	   System.out.println("Duplicate value is : " + duplicate(array3) );
	   int[] array4 = {1, 4, 4, 2, 3};
	   System.out.println("Duplicate value is : " + duplicate(array4) );
	   
	    // works for all test cases
		// Test Case 1
		// Input: [1, 3, 4, 2, 2]
		// Test Case 2:
		// Input: [3, 1, 3, 4, 2]	
		// Test Case 3:
		// Input: [1, 1]
		// Test Case 4:
		// Input: [1, 4, 4, 2, 3]
    }	
	
	private static int duplicate(int[] array)
	{
	   for(int i=0;i<array.length;i++)
	   {
		   for(int j=i+1;j<array.length;j++)
		   {
			   if(array[i]==array[j])
			   {
				   return array[i];
			   }
		   }
	   }
	   return -100; // if no duplicates 
	}
}
