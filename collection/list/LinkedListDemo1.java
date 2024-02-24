package com.collection.list;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) 
	{
		// insertion and deletion very fast but retrieval slow
		//it is ds concept. 3 types of linked list A).singly . 2)doubly 3) circular linkedlist
		//LinkedList is collection of nodes. each node having value and next address
		//every node divided into 2 parts
		LinkedList l=new LinkedList<>();
		l.add(10);
		l.add(30);
		l.add(40);
		
		l.addFirst(5);
		l.addLast(56);
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println(l);
		
		
		

	}

}
