package main;

public class Main 
{
    public static void main(String[] args) 
    {  
	   int[] array1 = {1, 2, 4, 5};
	   System.out.println("Missing number is : "+findMissingNumber(array1));
	   int[] array2 = {2, 3, 4, 5};
	   System.out.println("Missing number is : "+findMissingNumber(array2));
	   int[] array3 = {1, 2, 3, 4};
	   System.out.println("Missing number is : "+findMissingNumber(array3));
	   int[] array4 = {1};
	   System.out.println("Missing number is : "+findMissingNumber(array4));
	   
	   // Works for all test cases
	   // Test Case 1: Input: [1, 2, 4, 5]
	   // Test Case 2: Input: [2, 3, 4, 5]	   
	   // Test Case 3: Input: [1, 2, 3, 4]	   
	   // Test Case 4: Input: [1]
	}
    
    private static int findMissingNumber(int[] array)
    {
    	int temp1 = array[0];
    	int temp2 = array[array.length-1];
    	int leftIndex = 0;
    	int rightIndex = array.length-1;
    	
    	while(leftIndex < rightIndex)
    	{
    		if(array.length==1)
    		{
    			return (array[0] + 1);
    		}
    		
    		leftIndex++;
    		rightIndex--;
    		if(array[leftIndex] - temp1 == 1)
    		{
    			temp1 = array[leftIndex];
    			continue;
    		}
    		else if(array[leftIndex] - temp1 != 1)
    		{
    			return (temp1+1);
    		}
    		if(temp2 - array[rightIndex] == 1)
    		{
    			temp2 = array[rightIndex];
    			continue;
    		}
    		else if(temp2 - array[rightIndex] != 1)
    		{
    			return (temp2-1);
    		}
    	}
    	if(array[0] != 1)
    	{
    		return 1;
    	}
    	else
    	{
    		return array[array.length-1] +1;
    	}
    }
}
