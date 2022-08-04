package com.lambda;

interface Num{
	void num1(int a);
}
public class Numbers {
	public static void main(String[] args) {
		int n = 10;
		Num d = (a) -> {
			for(int i = 1 ; i <= n; i++) {
				System.out.println(i);
			}
		};
		d.num1(n);
	}

}
