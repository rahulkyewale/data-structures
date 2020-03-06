package com.study.sort;

public class InsertionSort {

	public static void main(String[] args) 
	{
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
		
		/**for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) 
		{
			int newElement = intArray[firstUnsortedIndex];
			int i;
			for (i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement ; i--) 
			{
				intArray[i] = intArray[i-1];
			}
			
			intArray[i] = newElement;
		}**/
		
		quickSort(intArray, 0, intArray.length); //(intArray, intArray.length);
		
	    for (int i = 0; i < intArray.length; i++) 
	    {
	    	System.out.println(intArray[i]);
		}
	}
	
	public static void insertionSort(int[] input, int numItems)
	{
		if(numItems < 2)
		{
			return;
		}
		
		insertionSort(input, numItems - 1);
		
		int newElement = input[numItems - 1];
		int i;
		for (i = numItems - 1; i > 0 && input[i-1] > newElement ; i--) 
		{
			input[i] = input[i-1];
		}
		
		input[i] = newElement;
		
		System.out.println("Number of items  "+numItems);
		for (int j = 0; j < input.length; j++) 
	    {
	    	System.out.print(input[j]);
	    	System.out.print(",");
		}
		System.out.println("");
		System.out.println("-----------------------");
	}
	
	public static void quickSort(int[] input, int start, int end)
	{
		if( end - start < 2)
		{
			return;
		}
		
		int partitionIndex = partition(input, start, end);
		quickSort(input, start, partitionIndex);
		quickSort(input, partitionIndex+1, end);
	}
	
	public static int partition(int[] input, int start, int end)
	{
		int pivot = input[start];
		int i = start;
		int j = end;
		
		while(i<j)
		{
			while(i<j && input[--j] >= pivot);
			if(i<j)
			{
				input[i] = input[j];
			}
			
			while(i<j && input[++i] <= pivot);
			if(i<j)
			{
				input[j] = input[i];
			}	
		}
		
		input[j] = pivot;
		
		return j;
	}

}
