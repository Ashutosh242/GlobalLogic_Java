package com.lambda;

import java.util.Scanner;

interface MinimumNumber
{
	public void min(int x , int y);
}
public class MinNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		MinimumNumber min = (int x , int y)->
		{
			if(x < y) {
				System.out.println(x + " "+ "is" + " " + "Minimum number");
			}
			else
			{
				System.out.println(y + " " + "is" + " " + "Minimum number");
			}
		};
		min.min(input.nextInt(), input.nextInt());

	}

}
