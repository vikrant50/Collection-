package com.collection.iterator;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo1 {

	public static void main(String[] args) 
	{
		//traversing the element from legacy classes  ---> enumeration 
		Vector v=new Vector<>();
		v.add(12);
		v.add("java");
		v.add(124);
		v.add("is");
		v.add(112);
		
		//iterator code to traverse the vector collection
		
		Enumeration enumerationList = Collections.enumeration(v);
		
		while(enumerationList.hasMoreElements())
		{
			System.out.println(enumerationList.nextElement());
		}

	}

}
