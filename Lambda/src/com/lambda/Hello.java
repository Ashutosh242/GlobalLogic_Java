package com.lambda;

interface Hello1
{
	public String print();
}
public class Hello {

	public static void main(String[] args) {
		Hello1 l = () ->{
			return "Hello World";
		};
		System.out.println(l.print());

	}

}
