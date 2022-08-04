package com.lambda;
import java.util.Scanner;

interface MaximumNumber
{
	public void max(int x , int y);
}
public class MaxNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		MaximumNumber max = (int x , int y)->
		{
			if(x > y) {
				System.out.println(x +" "+ "is" + " " + "Maximum number");
			}
			else
			{
				System.out.println(y + " " +"is" + " " + "maximum number");
			}
		};
		max.max(input.nextInt(), input.nextInt());

	}

}
