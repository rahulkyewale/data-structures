package com.study.sort;

public class MergeSort {

	public static void main(String[] args) 
	{
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
		mergeSort(intArray, 0, intArray.length, false);
		
		for (int i = 0; i < intArray.length; i++) 
	    {
	    	System.out.println(intArray[i]);
		}
	}
	
	// orderType true is asc and false is desc
	public static void mergeSort(int[] input, int start, int end, boolean orderType)
	{
		if(end - start < 2)
		{
			return;
		}
		
		int mid = (start + end) / 2;
		mergeSort(input, start, mid, orderType);
		mergeSort(input, mid, end, orderType);
		if(orderType)
			mergeAsc(input, start, mid, end);
		else
			mergeDesc(input, start, mid, end);
	}
	
	public static void mergeAsc(int[] input, int start, int mid, int end)
	{
		if(input[mid - 1] <= input[mid])
		{
			return;
		}
		
		int [] tempArray = new int[end - start];
		int tempIndex = 0;
		int i = start;
		int j = mid;
		while(i < mid && j < end)
		{
			tempArray[tempIndex++] = input[i] <= input[j] ?  input[i++] : input[j++];
		}
		
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(tempArray, 0, input, start, tempIndex);
	}
	//  {60, 59,57}{56, 55, 53}
	public static void mergeDesc(int[] input, int start, int mid, int end)
	{
		if(input[mid - 1] >= input[mid])
		{
			return;
		}
		
		int [] tempArray = new int[end - start];
		int tempIndex = 0;
		int i = start;
		int j = mid;
		while(i < mid && j < end)
		{
			tempArray[tempIndex++] = input[i] >= input[j] ?  input[i++] : input[j++];
		}
		
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(tempArray, 0, input, start, tempIndex);
	}

}
