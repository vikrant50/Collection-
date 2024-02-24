package com.collection.set;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args)
	{
		// insertion order will not maintained  and duplicates also not allowed
	   HashSet s=new HashSet();
	   s.add(10);
	   s.add(20);
	   s.add(30);
	   s.add(10);//dublicate not allowed set 
	   
	   //remove element
	   s.remove(20);
	   System.out.println(s.size());
	   System.out.println(s);
	   

	}

}
