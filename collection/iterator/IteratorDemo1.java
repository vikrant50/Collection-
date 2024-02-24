package com.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;



public class IteratorDemo1 {

	public static void main(String[] args) 
	{
		// Iterator -->forward  direction only 
		//element can be removed by using itertaor
		
		ArrayList list=new ArrayList<>();
		list.add(10);
		list.add("java");
		list.add(103);
		list.add("is");
		list.add("amit");
		
		//create iterator and traverse collection
		
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{

			System.out.println(iterator.next());
		}
		
	
	}

}
