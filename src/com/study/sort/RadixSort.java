package com.study.sort;

public class RadixSort {

	public static void main(String[] args) 
	{
		int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };

        radixSort(radixArray, 10, 4);

        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }
        System.out.println("--------------------\n");
        
        String[] radixStrArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        radixSort(radixStrArray, 26, 5);
        
        for (String value : radixStrArray) {
			System.out.println(value);
		}
	}
	
	public static void radixSort(int[] input, int radix, int width)
	{
		for (int i = 0; i < width; i++) 
		{
			radixSingleSort(input, i, radix);
		}
	}
	
	public static void radixSingleSort(int[] input, int position, int radix)
	{
		int numItems = input.length;
		
		int[] countArray = new int[radix];
		
		for (int value : input) 
		{
			countArray[getDigit(value, position, radix)]++;
		}
		
		for (int i = 1; i < countArray.length; i++) 
		{
			countArray[i] += countArray[i-1];
		}
		
		int[] tempArray = new int[numItems];
		
		for (int tempIndex = numItems-1; tempIndex >= 0; tempIndex--) 
		{
			tempArray[--countArray[getDigit(input[tempIndex], position, radix)]] = input[tempIndex];
		}
		
		System.arraycopy(tempArray, 0, input, 0, numItems);
	}
	
	public static int getDigit(int value, int position, int radix)
	{
		return value / (int) Math.pow(radix, position) % radix;
	}
	
	
	public static void radixSort(String[] input, int radix, int width)
	{
		for (int i = width - 1; i >= 0; i--) 
		{
			radixSingleSort(input, i, radix);
		}
	}
	
	public static void radixSingleSort(String[] input, int position, int radix)
	{
		int numItems = input.length;
		
		int[] countArray = new int[radix];
		
		for (String value : input) 
		{
			countArray[getIndex(value, position)]++;
		}
		
		for (int i = 1; i < countArray.length; i++) 
		{
			countArray[i] += countArray[i-1];
		}
		
		String[] tempArray = new String[numItems];
		
		for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) 
		{
			tempArray[--countArray[getIndex(input[tempIndex], position)]] = input[tempIndex];
		}
		
		System.arraycopy(tempArray, 0, input, 0, numItems);
	}
	
	public static int getIndex(String value, int position)
	{
		return value.charAt(position) - 'a';
	}

}
