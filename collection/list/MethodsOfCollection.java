package com.collection.list;

import java.util.ArrayList;

public class MethodsOfCollection {

	public static void main(String[] args) 
	{
		// addAll()    //for object 
		//removeAll()  //for object 
		
		ArrayList a1=new ArrayList();
		
		a1.add(10);
		a1.add(12);
		
		
		ArrayList a2=new ArrayList();

		a2.add(17);
		a2.add("Amit");
		a2.add(67);
		
		//add a1 into a2 arraylist
		
		//a1.addAll(a2);
		
		//remove a1 into a2 arraylist
		a1.removeAll(a2);
		System.out.println(a1);
		
		
	}

}
