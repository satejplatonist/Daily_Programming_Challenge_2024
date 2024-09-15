package main;


public class Main 
{
    public static void main(String[] args) 
    {  
       // Test Case 1	
       int[] array1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
       TrappingRainWater(array1);
       
       // Test Case 2	
       int[] array2 = {4, 2, 0, 3, 2, 5};
       TrappingRainWater(array2);
       
       // Test Case 3	
       int[] array3 = {1, 1, 1};
       TrappingRainWater(array3);
       
       // Test Case 4	
       int[] array4 = {5};
       TrappingRainWater(array4);
       
       // Test Case 5	
       int[] array5 = {2, 0, 2};
       TrappingRainWater(array5);
	} 
    
    private static void TrappingRainWater(int[] array)
    {
    	int waterTrapped = 0;
    	if (array == null || array.length == 0) 
    	{
            waterTrapped = 0;
        }
    	else
    	{
    		int n = array.length;
            int[] leftMax = new int[n];
            int[] rightMax = new int[n];

            
            leftMax[0] = array[0];
            for (int i = 1; i < n; i++) {
                leftMax[i] = Math.max(leftMax[i - 1], array[i]);
            }

            
            rightMax[n - 1] = array[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(rightMax[i + 1], array[i]);
            }

            
            for (int i = 0; i < n; i++) 
            {
                waterTrapped += Math.min(leftMax[i], rightMax[i]) - array[i];
            }	
    	}
        
    	System.out.println("Total water trapped is : " + waterTrapped);
    }
}

