package com.globallogic.com;
import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch 
{
//linear search.
	public static void main(String[] args) 
	{
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(-1);
		nums.add(0);
		nums.add(3);
		nums.add(5);
		nums.add(9);
		nums.add(12);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Element to Search :");
		int search = input.nextInt();
		
		for(int i = 0 ; i <=nums.size() - 1 ; i++)
		{
			if(nums.get(i) == search)
			{
				System.out.println("Element is found at Location" + " " + i);
			}
			else if(nums.get(i) == search)
			{
				System.out.println("Element is not found");
			}
		}
		
	}
}
