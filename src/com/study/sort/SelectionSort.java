package com.study.sort;

public class SelectionSort {
	
	public static void swap (int[] intArray, int i, int j)
	{
		if(i == j)
		{
			return;
		}
		
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

	public static void main(String[] args) 
	{
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
		
		
		for(int firstUnsortedIndex = 0; firstUnsortedIndex < intArray.length -1; firstUnsortedIndex++)
		{
			int smallest = firstUnsortedIndex;
			for (int i = firstUnsortedIndex+1; i < intArray.length; i++) 
			{
				if(intArray[i] < intArray[smallest])
				{
					smallest = i;
				}
			}
			
			swap(intArray, smallest, firstUnsortedIndex);
		}	
		
		for (int i = 0; i < intArray.length; i++) 
		{
			System.out.println(intArray[i]);
		}
	}

}
