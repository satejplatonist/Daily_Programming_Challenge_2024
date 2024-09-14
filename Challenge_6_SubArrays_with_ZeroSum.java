package main;

import java.util.ArrayList;
import java.util.Iterator;

public class Main 
{
    public static void main(String[] args) 
    {  
       // Test Case 1	
       int[] array1 = {4, -1, -3, 1, 2, -1}; 
  	   ArrayList<Integer[]> result1 = sumZero(array1);
  	   System.out.print("result test case 1 : ");printResult(result1);	
    	
       // Test Case 2	
       int[] array2 = {1, 2, 3, 4}; 
 	   ArrayList<Integer[]> result2 = sumZero(array2);
 	   System.out.print("result test case 2 : ");printResult(result2); 	
    	
       // Test Case 3	
       int[] array3 = {0, 0, 0}; 
	   ArrayList<Integer[]> result3 = sumZero(array3);
	   System.out.print("result test case 3 : ");printResult(result3);
	   
	   // Test Case 4	
       int[] array4 = {-3, 1, 2, -3, 4, 0}; 
	   ArrayList<Integer[]> result4 = sumZero(array4);
	   System.out.print("result test case 4 : ");printResult(result4);
	} 
    
    private static ArrayList<Integer[]> sumZero(int[] array)
    {
    	ArrayList<Integer[]> result = new ArrayList<Integer[]>();
    	
    	for(int i=0;i<array.length;i++)
    	{
    		for(int j=i;j<array.length;j++)
    		{
    			if(sum(array,i,j)==0)
    			{
    				Integer[] arr = {i,j};
    				result.add(arr);
    			}
    		}
    	}
    	
    	return result;
    }
    
    private static int sum(int[] arr,int i,int j)
    {
    	int sum1=0;
    	for(int k=i;k<=j;k++)
    	{
    		sum1+=arr[k];
    	}
    	return sum1;
    }
    
    private static void printResult(ArrayList<Integer[]> result)
    {
    	System.out.print("[ ");
    	for (Iterator<Integer[]> iterator = result.iterator(); iterator.hasNext();) {
			Integer[] integers = (Integer[]) iterator.next();
			System.out.print("( ");
			for (int i = 0; i < integers.length; i++) {
				System.out.print(integers[i]+" ");
			}
			System.out.print(")");
		}
    	System.out.println(" ]");
    }
}

