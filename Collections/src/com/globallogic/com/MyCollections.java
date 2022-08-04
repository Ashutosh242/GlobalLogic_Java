package com.globallogic.com;
import java.util.ArrayList;
import java.util.Collections;

public class MyCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ls = new ArrayList<String>(); 
		//adding element
		ls.add("Ashutosh");
		ls.add("Ankush");
		ls.add("Rohit");
		
		System.out.println(ls);
		
		//removing element
		ls.remove("Ashutosh");
		System.out.println(ls);
		
		//sorting
		ls.add("Ashutosh");
		Collections.sort(ls);
		System.out.println(ls);
		
		//update
		ls.set(1, "Anshul");
		System.out.println(ls);
		

	}

}
