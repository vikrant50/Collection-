package com.collection.list;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args)
	{
		//object only(Integer) and dt not work (int)
		
		ArrayList a = new ArrayList(); 
	
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(110);
		a.add("AMIT");
		a.add("AMIT");
		a.add(	true);
		
		System.out.println("Before removing : " +a);
		
		//for removing
		a.remove(1);
		System.out.println("After removing : " +a);
		
		//for fetching 
		System.out.println(a.get(3));//fast random access
		
		int n=a.size();
		for(int i=0;i<n;i++)
		{
			System.out.println(a.get(i));
		}
		

	}

}
