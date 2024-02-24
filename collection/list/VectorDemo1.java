package com.collection.list;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args)
	{
		// 
		
		Vector v=new Vector<>();
		v.add(13);
		v.add("ak");
		v.add(23);
		v.remove(0);
		System.out.println(v.size());
		System.out.println(v);

	}

}
