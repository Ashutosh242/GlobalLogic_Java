package com.lambda;

interface EvenOdd1{
	void eo(int a);
}
public class EvenOdd {

	public static void main(String[] args) {
		EvenOdd1 ab = (a) ->{
			if(a%2 ==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("odd");
			}
		};
		
		ab.eo(5);

	}

}
