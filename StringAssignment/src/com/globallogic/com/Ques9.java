package com.globallogic.com;
import java.util.Scanner;

public class Ques9 {

	public static void main(String[] args) 
	{
		//Write a program to replace a given substring in a sentence with another string. For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Sentence :");
		String str = input.nextLine();
		String newstr = str.replaceAll("bat", "snow");
		System.out.println("New sentence will be :" + " " + newstr);
	}
}
