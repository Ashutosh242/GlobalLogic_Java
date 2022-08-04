package com.globallogic.com;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		//Write a program to find the first and the last occurrence of the letter 'o' and character ',' in "Hello, World"
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = input.nextLine();
		
		System.out.println("first occurence:"+ " "+ str.indexOf("o"));
		System.out.println("last occurence:"+ " "+ str.lastIndexOf("o"));
	}

}
