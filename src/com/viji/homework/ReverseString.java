package com.viji.homework;

public class ReverseString {
	
	public static String revert(String value){
	
		String reverseStringValue = new String();
		char nameCharVal;
		int strLength = value.length();
		System.out.println("strLength "+strLength); 
		for(int i=strLength-1;i>=0;i--)
		{
			//System.out.println();
			System.out.println(i+" String value " + value.charAt(i));
			nameCharVal=value.charAt(i);
			reverseStringValue =reverseStringValue.concat(Character.toString(nameCharVal));
			System.out.println(nameCharVal);  
		}
		
		return reverseStringValue;
	}
	
	
	
	
	

}
