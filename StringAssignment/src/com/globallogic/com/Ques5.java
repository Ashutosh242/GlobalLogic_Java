package com.globallogic.com;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		//Write a program to check if the word 'orange' is present in the "This is orange juice".
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = input.nextLine();
		System.out.println(str.contains("orange"));
		

	}

}
