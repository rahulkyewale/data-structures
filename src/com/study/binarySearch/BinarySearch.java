package com.study.binarySearch;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };
		
		System.out.println("Recursive style");
		System.out.println("Searched postion of 1 is = "+recursiveBinarySearch(intArray, 1, 0, intArray.length));
		System.out.println("Searched postion of 35 is = "+recursiveBinarySearch(intArray, 35, 0, intArray.length));
		System.out.println("Searched postion of 55 is = "+recursiveBinarySearch(intArray, 55, 0, intArray.length));
		System.out.println("Searched postion of -22 is = "+recursiveBinarySearch(intArray, -22, 0, intArray.length));
		System.out.println("Searched postion of 10 is = "+recursiveBinarySearch(intArray, 10, 0, intArray.length));
		
		System.out.println("Iterartive style");
		System.out.println("Searched postion of 1 is = "+iterartiveBinarySearch(intArray, 1));
		System.out.println("Searched postion of 35 is = "+iterartiveBinarySearch(intArray, 35 ));
		System.out.println("Searched postion of 55 is = "+iterartiveBinarySearch(intArray, 55 ));
		System.out.println("Searched postion of -22 is = "+iterartiveBinarySearch(intArray, -22 ));
		System.out.println("Searched postion of 10 is = "+iterartiveBinarySearch(intArray, 10 ));
	}
	
	public static int recursiveBinarySearch(int[] input, int searchedValue, int start, int end)
	{
		if( start >= end)
		{
			return -1;
		}
		
		int mid = (start + end) / 2;
		
		if(input[mid] == searchedValue)
		{
			return mid;
		}
		else if( searchedValue < input[mid] )
		{
			return recursiveBinarySearch(input, searchedValue, start, mid);
		}
		else
		{
			return recursiveBinarySearch(input, searchedValue, mid+1, end);
		}
	}
	
	public static int iterartiveBinarySearch(int[] input, int searchedValue)
	{
		int start = 0;
		int end = input.length;
		int mid = 0;
		
		while( start < end)
		{
			mid = (start+end)/2;
			
			if(input[mid] == searchedValue)
			{
				return mid;
			}
			else if(searchedValue < input[mid])
			{
				end = mid;
			}
			else
			{
				start = mid+1;
			}
		}
		
		return -1;
	}
}
