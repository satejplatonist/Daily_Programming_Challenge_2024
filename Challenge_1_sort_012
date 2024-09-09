package main;

public class Main 
{
    public static void main(String[] args) 
    {
       // This Algorithm Works of 
       // Test Case 1 : [0, 1, 2, 1, 0, 2, 1, 0]
       // Test Case 2 : [2, 2, 2, 2]
       // Test Case 3 : [0, 0, 0, 0]
	   
    	int[] array1 = {0, 1, 2, 1, 0, 2, 1, 0};
    	int[] array2 = {2, 2, 2, 2};
    	int[] array3 = {0, 0, 0, 0};
    	
    	quickSort(array1, 0, array1.length-1);
    	printArray(array1);
    	quickSort(array2, 0, array2.length-1);
    	printArray(array2);
    	quickSort(array3, 0, array3.length-1);
    	printArray(array3);
	   
	}
    
    private static void quickSort(int[] arr,int lowIndex ,int highIndex)
    {
       if(lowIndex >= highIndex)
       {
    	   return;
       }
    	
       int pivot = arr[highIndex];
       int leftpointer = lowIndex;
       int rightpointer = highIndex;
       
       while(leftpointer < rightpointer)
       {
    	   while(arr[leftpointer] <= pivot && leftpointer < rightpointer)
    	   {
    		   leftpointer++;
    	   }
    	   
    	   while(arr[rightpointer] >= pivot && leftpointer < rightpointer)
    	   {
    		   rightpointer--;
    	   }
    	   
    	   swap(arr, leftpointer, rightpointer);
       }
       
       swap(arr, leftpointer, highIndex);
       
       quickSort(arr, lowIndex, leftpointer-1);
       quickSort(arr, leftpointer+1, highIndex);
    }
    
    private static void swap(int[] arr,int index1 , int index2)
    {
    	int temp = arr[index1];
    	arr[index1] = arr[index2];
    	arr[index2] = temp;
    }
    
    private static void printArray(int[] arr)
    {
    	System.out.print("[");
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.print(arr[i] + ", ");
    	}
    	System.out.print("]");
    	System.out.println();
    }
}
