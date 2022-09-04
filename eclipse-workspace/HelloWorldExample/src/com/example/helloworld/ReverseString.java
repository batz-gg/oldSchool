package com.example.helloworld;

import java.util.ArrayList;

public class ReverseString {

	public static String reverseString(String text) {
	  String reversed = new String("");
	  for (int i=0; i < text.length(); i++){
	    reversed = text.charAt(i) + reversed;
	  }
	  return reversed;
	}
		 
	public static int getTotal(ArrayList<Integer> arr) {
	  int sum = 0;
	  for (int i = 0; i < arr.size(); i++) {
	    sum += arr.get(i);
	  }
	  return sum;
	}
	
//	public static int[] reverseArray(int[] array) {
//		int[] reversedArray = {};
//		if (array.length == 0) return array;
//		for (int i = 0; i < array.length; i++) {
//			reversedArray = reversedArray + array[i];		
//		}
//		return reversedArray;
//		
//	}
			 
	public static void main(String[] args) {
		String str = new String("howdy");
		String reverse = reverseString(str);
		System.out.println(reverse); // Prints: ydwoh
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		myArray.add(3);
		myArray.add(5);
		myArray.add(6);
		myArray.add(9);
	 
		int total = getTotal(myArray);
		System.out.println(total); // Prints: 23
	}
}
