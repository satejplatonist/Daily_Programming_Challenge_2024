package main;

public class Main 
{
    public static void main(String[] args) 
    {  
       // Example in doc of question
	   int[] array1 = {16, 17, 4, 3, 5, 2};
	   System.out.print("Leader Values are : ");findLeaderElements(array1);

      // Works For ALL test Cases
      
	   // Test case 1
	   int[] array2 = {1, 2, 3, 4, 0};
	   System.out.print("Leader Values are : ");findLeaderElements(array2);
	   
	   // Test case 2
	   int[] array3 = {7, 10, 4, 10, 6, 5, 2};
	   System.out.print("Leader Values are : ");findLeaderElements(array3);
	   
	   // Test case 3
	   int[] array4 = {5};
	   System.out.print("Leader Values are : ");findLeaderElements(array4);
	   
	   // Test case 4
	   int[] array5 = {100, 50, 20, 10};
	   System.out.print("Leader Values are : ");findLeaderElements(array5);
	   
	   // Test case 5
	   int[] array6 = new int[1000000];
	   for (int i = 0; i < array6.length; i++) {
		  array6[i] = i+1;
	   }
	   System.out.print("Leader Values are : ");findLeaderElements(array6);
	   
	} 
    
    private static void findLeaderElements(int[] array)
    {
    	boolean notLeader;
    	System.out.print("[ ");
    	for(int i=0; i < array.length; i++)
    	{
    		notLeader = false;
    		if(i+1<array.length)
    		{
    			for(int j = i+1; j < array.length; j++)
    			{
    				if(array[i]<array[j])
    				{
    					notLeader = true;
    					break;
    				}
    			}
    		}
    		if(notLeader==false && i<array.length-1)
			{
				System.out.print(array[i] + ", ");
			}
			else if(notLeader==false && i==array.length-1)
			{
				System.out.print(array[i]);
			}
    	}
    	System.out.println("]");
    }
}

