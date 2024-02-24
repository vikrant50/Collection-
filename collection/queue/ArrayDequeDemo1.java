package com.collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		ArrayDeque ad=new ArrayDeque();
		ad.addFirst(10);
		ad.addLast(20);
		System.out.println(ad.getFirst());
		//System.out.println(ad.getLast());
	}

}
