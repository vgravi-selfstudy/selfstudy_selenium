package com.viji.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalsTriangle {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers for Pascals Triangle:");
		
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
		String name = reader.readLine(); 
		
		
		String stringValue = new String();
		int strLength = name.length();
		char nameCharVal=0;
		for(int i=0;i<strLength;i++)
		{
			//System.out.println();
			System.out.println(i+" String value " + name.charAt(i));
			
			if(Character.toString(name.charAt(i))!=" " ){
			nameCharVal=name.charAt(i);
			stringValue =stringValue.concat(Character.toString(nameCharVal));
			System.out.println(stringValue);
			}
			
			//System.out.println(stringValue);  
		}
		
		System.out.println();
		for(int j=0;j<stringValue.length();j++)
		{
			for(int k=0;k<stringValue.length()-j;k++)
			{
				System.out.println(" ");
			}
			for(int k=0;k<=j;k++)
			{
				System.out.println(" "+stringValue.charAt(k));
			}
			System.out.println();
		}
		
	}

}
