package com.globallogic.com;

public class Ques8 {

	public static void main(String[] args) {
		String str = "mom";
		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();
		String rev = str1.toString();
		
		if(str.equals(rev))
		{
			System.out.println("string is Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
		

	}

}
