package com.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 
{

	public static void main(String[] args)
	{
		//In linked hashset insertion order will maintain and duplicate not allowed
		LinkedHashSet s = new LinkedHashSet();
		s.add(12);
		s.add(1);
		s.add("amit");
		s.add(1);
		System.out.println(s);

	}

}
