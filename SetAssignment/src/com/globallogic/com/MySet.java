package com.globallogic.com;
import java.util.*;
//Create A set with all the implementation with user defined class employee and perform the insert delete and searching and sorting.
class Employee{
	
	HashSet<Integer> E = new HashSet<Integer>();
	Scanner input =  new Scanner(System.in);
	
	void Insertion()
	{
		
		System.out.print("How many element you want to add : ");
		int size = input.nextInt();
		System.out.println();
		for(int i = 1 ; i <= size; i++) 
		{
			System.out.print("Enter the" + " " +  i + "st" +" "+ "number you want to add : ");
			int num1 = input.nextInt();
			E.add(num1);
		}
		System.out.println("Set will be :" + " " + E);
			
	}
	
	void Deletion()
	{
		System.out.print("How many element you want to Delete : ");
		int size = input.nextInt();
		System.out.println();
		for(int i = 1 ; i <= size; i++) {
			System.out.print("Enter the" + " " +  i + "st" +" "+ "number you want to Delete : ");
			int Del_num = input.nextInt();
			E.remove(Del_num);
		}
		System.out.println("Set will be :" + " " + E);
	}
	
	void Searching()
	{
		System.out.println();
		System.out.print("Enter the number you want to Search : ");
		int Search_num = input.nextInt();
		if(E.contains(Search_num) == true)
		{
			System.out.println(Search_num + " " + "is Present in the set");
		}
		else
		{
			System.out.println(Search_num + " " + "is not Present in the set");
		}
		
	}
	
	void Sorting()
	{
		System.out.println();
		System.out.println("Sorted Element are : " + " " + E);
	}
}

public class MySet {
	public static void main(String[] args) {
		Employee set = new Employee();
		
		set.Insertion();
		set.Deletion();
		set.Searching();
		set.Sorting();
		
		

	
		
		

	}

}
