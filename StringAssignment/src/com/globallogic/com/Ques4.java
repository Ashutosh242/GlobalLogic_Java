package com.globallogic.com;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		
		//Write a program to check if the letter 'e' is present in the word 'Umbrella'.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Word :");
		String str = input.next();
		
		System.out.println(str.contains("e"));

	}

}
