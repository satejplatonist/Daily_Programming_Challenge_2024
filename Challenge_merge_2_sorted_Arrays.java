package main;

public class Main 
{
    public static void main(String[] args) 
    {  
       // Test Case 1
	   int [] array1 = {1, 3, 5, 7};
	   int [] array2 = {2, 4, 6, 8};
	   SimpleSort(array1, array2);
	   printArrays(array1, array2);
	   
	// Test Case 2
	   int [] array3 = {10, 12, 14};
	   int [] array4 = {1, 3, 5};
	   SimpleSort(array3, array4);
	   printArrays(array3, array4);
	   
	// Test Case 3
	   int [] array5 = {2, 3, 8};
	   int [] array6 = {4, 6, 10};
	   SimpleSort(array5, array6);
	   printArrays(array5, array6);
	   
	// Test Case 4
	   int [] array7 = {1};
	   int [] array8 = {2};
	   SimpleSort(array7, array8);
	   printArrays(array7, array8);
	 
    // Also works for test case 5
	// Input: arr1 = [1, 2, 3, 4, ..., 100000], arr2 = [50001, ..., 100000]
	      
	}
    
    private static void SimpleSort(int[] arr1,int[] arr2)
    {
    	boolean swapCounter;
    	do
    	{
	    	swapCounter = false;
	    	for(int i=0; i<arr1.length ; i++)
	    	{
	    		for(int j=0 ;j<arr2.length ;j++)
	    		{
	    			if(arr2[i] < arr1[j])
	    			{
	    				int temp = arr2[i];
	    				arr2[i] = arr1[j];
	    				arr1[j] = temp;
	    				swapCounter = true;
	    				for(int k=i; k < arr2.length; k++)
	    				{
	    					if(k-1>=0 && arr2[k-1] > arr2[k])
	    					{
	    						temp = arr2[k];
	    	    				arr2[k] = arr2[k-1];
	    	    				arr2[k-1] = temp;
	    	    				
	    					}
	    				}
	    				break;
	    			}
	    		}
	    	}
    	}while(swapCounter);
    }
    
    private static void printArrays(int[] arr1, int[] arr2)
    {
    	System.out.print("array1 is [ ");
    	for (int i = 0; i < arr1.length; i++) 
    	{
			System.out.print(arr1[i]+", ");
		}
    	System.out.print("] ");
    	
    	System.out.print("array2 is [ ");
    	for (int i = 0; i < arr2.length; i++) 
    	{
			System.out.print(arr2[i]+", ");
		}
    	System.out.println("] ");
    }
    
}

