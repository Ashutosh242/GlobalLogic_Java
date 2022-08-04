package com.globallogic.com;

public class Ques10 {

	public static void main(String[] args) {
		
		//Write a program to reverse individual words in a string, where each word may be delimited by a dot, comma, space or tab, like www.google.com should become www.elgoog.moc.
		String str = "www.google.com";
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		
		str1.reverse();
		System.out.println(str1);
		
		
		
		

	}

	

}
