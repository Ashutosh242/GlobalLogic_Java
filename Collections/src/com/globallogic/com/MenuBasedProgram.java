package com.globallogic.com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MenuBasedProgram {

	public static void main(String[] args) {
		ArrayList<String> emp  = new ArrayList<String>();
		ArrayList<Integer> Salary  = new ArrayList<Integer>();
		
	
		Scanner input = new Scanner(System.in);
		while(true)
		{
			//creating menu
			System.out.println("-----------------------------------------------");
			System.out.println("Press 1: Add the employee to list");
			System.out.println("Press 2: Delete the employee from list");
			System.out.println("Press 3: Search the employee name");
			System.out.println("Press 4: Update the employee value using name");
			System.out.println("Press 5: Sort the data of employee");
			System.out.println("Press 6: Enter the Employee salary");
			System.out.println("Press 7: Provide the sum of salary of employee");
			System.out.println("Press 8: search for highest paid salary");
			System.out.println("Press 9: search for minimum paid salary");
			System.out.println("Press 10: Quit");
			System.out.println("-----------------------------------------------");
			
			//user choice
			System.out.println("Enter your choice : ");
			int choice = input.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the name of employee you want to add :");
				String name = input.next();
				emp.add(name);
				System.out.println("list is :" + " " + emp);
				break;
			case 2:
				System.out.println("Enter the name of employee you want to Delete from the list:");
				String delete_name = input.next();
				emp.remove(delete_name);
				System.out.println("list is :" + " " + emp);
				break;
			case 3:
				System.out.println("Enter the name of employee you want to Search :");
				String search_name = input.next();
				System.out.println("Employee is :" + " " + emp.contains(search_name));
				break;
			case 4:
				System.out.println("Enter the name of employee you want to Update(using name) :");
				String update_emp = input.next();
				System.out.println("Enter the new name :");
				String new_name = input.next();
				System.out.println("Enter the position :");
				int pos = input.nextInt();
				emp.set(pos, new_name);
				System.out.println("Updated list is: " + " " + emp);
				break;
			case 5:
				System.out.println("-----Sorting----");
				Collections.sort(emp);
				System.out.println("Sorted list is: " + " " + emp);
				break;
			case 6:
				System.out.println("Enter the salary of employee :");
				int emp_salary = input.nextInt();
				Salary.add(emp_salary);
				System.out.println("Salary list :" + " " + Salary);
				break;
			case 7:
				System.out.println("Adding salary of Employee:");
				double sum = 0;
				for(int i = 0 ; i<Salary.size() ; i++)
				{
					sum = sum + Salary.get(i);
				}
				System.out.println("Sum of salary is :" + " " + sum);
				break;
			case 8:
				System.out.println("Highest paid salary:");
				Collections.sort(Salary);
				System.out.println("Highest paid salary is :" + " " + Salary.get(Salary.size() - 1));
				break;
			case 9:
				System.out.println("Minimum paid salary:");
				Collections.sort(Salary);
				System.out.println("Minimum paid salary is :" + " " + Salary.get(0));
				break;
			case 10:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			
			}
		}
		
		

	}

}

