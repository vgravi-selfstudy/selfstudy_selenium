package com.viji.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the string to Reverse:");
		BufferedReader reader =  
	             new BufferedReader(new InputStreamReader(System.in)); 
		String name = reader.readLine(); 
		
		//super(name);
		
		String reverseStringValue = new String();
		char nameCharVal;
		int strLength = name.length();
		System.out.println("strLength "+strLength); 
		for(int i=strLength-1;i>=0;i--)
		{
			//System.out.println();
			System.out.println(i+" String value " + name.charAt(i));
			nameCharVal=name.charAt(i);
			reverseStringValue =reverseStringValue.concat(Character.toString(nameCharVal));
			System.out.println(nameCharVal);  
		}
		
		System.out.println(reverseStringValue);       
	}

	public RevString() {
		super();
	}

}