package com.globallogic.com;
import java.util.Arrays;
import java.util.Comparator;


public class Ques7 {
	public static void main(String[] args) {
		String str = "This is an umbrella";
		String words[] = str.split(" ");
		int n = words.length - 1;
		Arrays.sort(words, Comparator.comparingInt(String :: length)); // function to sort array of string according to length.
		System.out.println("smallest word is:" + words[0]);
		System.out.println("largest word is:" + words[n]);
		
		

	}

}
