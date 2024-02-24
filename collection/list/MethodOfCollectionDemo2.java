package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class MethodOfCollectionDemo2 {

	public static void main(String[] args) 
	{
		// contains() and containsAll (for object need to be create to arraylist then will able to check)
		
		ArrayList a=new ArrayList();
		
		a.add(12);
		a.add(122);
		a.add(121);
		a.add("Amit");
		
//		boolean contains=a.contains("amit");
//		
//		if(contains)
//		{
//			System.out.println("value is available");
//		}
//		else
//		{
//			System.out.println("value is not availble");
//		}
//		
		
		
		//iterator()---> it return an iterator
//		Iterator iteratr =a.iterator();
//		while(iteratr.hasNext())
//		{
//			System.out.println(iteratr.next());
//		}
		
		
		
		//public Object[] toArray()-----> it converts collection into array
//		Object[]array =a.toArray();
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.println(array[i]);
//		}
		
		
		boolean empty=a.isEmpty();
		if(empty)
		{
			System.out.println("collection is empty");
		}
		else
		{
			System.out.println("collection is not empty");
		}

	}

}
