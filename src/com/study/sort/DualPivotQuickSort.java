package com.study.sort;

public class DualPivotQuickSort {

	public static void main(String[] args) 
	{
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
		dualPivotQuickSort(intArray, 0, intArray.length);
		
		for (int i = 0; i < intArray.length -1; i++) 
	    {
	    	System.out.println(intArray[i]);
		}
	}
	
	public static void dualPivotQuickSort(int[] input, int start, int end)
	{
		if(end-start < 2)
		{
			return;
		}
		
		partition(input, start, end);
	}
	
	public static void partition(int[] input, int start, int end)
	{
		if(input[start] > input[end])
		{
			swap(input, start, end);
		}
		
		int leftPivotValue = input[start];
		int rightPivotValue = input[end];
		int leftPivot = start;
		int rightPivot = end;
		/**
		 * { 20, 35, -15, 7, 55, 1, -22}
		 * { -22, 35, -15, 7, 55, 1, 20}
		 * { -22, 35, -15, 7, 55, 1, 35}
		 */
		for (int p = 1; input[p] != rightPivotValue; p++) 
		{
			if(input[p] < leftPivotValue)
			{
				input[leftPivot] = input[p];
				leftPivot++;
			}
			else if(input[p] >= leftPivotValue && input[p] <= rightPivotValue)
			{
				///input[i+j]
			}
			else if(input[p] > rightPivot)
			{
				input[rightPivot] = input[p];
				rightPivot--;
			}
		}
		
		
	}
	
	public static void swap(int[] input, int i, int j)
	{
		if(i == j)
		{
			return;
		}
		
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

}
