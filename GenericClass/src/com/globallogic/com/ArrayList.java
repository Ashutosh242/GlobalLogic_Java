package com.globallogic.com;

//generic class in java.
class Student<X,Y,Z,P>
{
	X id;
	Y First_name;
	Z Last_name;
	P age;
	
	public Student(X id , Y First_name , Z Last_name , P age)
	{
		this.id = id;
		this.First_name  = First_name;
		this.Last_name = Last_name;
		this.age = age;
	}
	public void print()
	{
		System.out.println("ID :"+ this.id);
		System.out.println("FirstName :"+ this.First_name);
		System.out.println("LastName :"+ this.Last_name);
		System.out.println("Age :"+ this.age);
	}
}
public class ArrayList {
	public static void main(String[] args) {
		Student<Integer , String , String , Integer> s1 = new Student<Integer , String , String , Integer>(212 , "Ashutosh" , "Sharma" , 21);
		s1.print();
		 
		
		
	}

	
	

}
