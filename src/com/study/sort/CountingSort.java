package com.study.sort;

public class CountingSort {

	public static void main(String[] args) 
	{
		int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
		
		int[] intArray2 = { 12, 15, 19, 18, 12, 18, 17, 20, 14, 13 };
		
		countingSort(intArray, 1, 10);
		
		countingSort(intArray2, 11, 20);
		
		for (int i = 0; i < intArray2.length; i++) 
	    {
	    	System.out.println(intArray2[i]);
		}
	}
	
	public static void countingSort(int[] input, int min, int max)
	{
		int[] countArray = new int[max-min+1];
		
		for (int i = 0; i < input.length; i++) 
		{
			countArray[ input[i] - min ]++;
		}
		
		int j = 0;
		for (int i = min; i <= max; i++) 
		{
			while(countArray[i - min]>0)
			{
				input[j++] = i;
				countArray[i-min]--;
			}
		}
	}

}
