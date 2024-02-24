package com.collection.iterator;

import java.util.ArrayList;

import java.util.ListIterator;

public class ListIteratorDemo1 {

	public static void main(String[] args) 
	{
		// ListIterator -->forward  direction and backward direction both  
		
				
				ArrayList list=new ArrayList<>();
				list.add(10);
				list.add(45);
				list.add(103);
				list.add(67);
				list.add(98);
				
				//create ListIterator and traverse collection
				
		       ListIterator listIterator = list.listIterator();
		       
		       //forward direction
				while( listIterator.hasNext())
				{
	
					System.out.println( listIterator.next());
				}
				System.out.println("---------------------------");
				
				//Backward direction
				while( listIterator.hasPrevious())
				{
	
					System.out.println( listIterator.previous());
				}
				
			
			}

		}
