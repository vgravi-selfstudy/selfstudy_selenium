package com.viji.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.viji.homework.ReverseString;

public class ReverseStringChild extends ReverseString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the string to Reverse:");
		BufferedReader reader =  
                 new BufferedReader(new InputStreamReader(System.in)); 
		String name = reader.readLine(); 
		String output = revert(name);
		System.out.println("output  "+output);
	}
	
}
