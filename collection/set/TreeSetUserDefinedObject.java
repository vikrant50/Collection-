package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetUserDefinedObject
{

	public static void main(String[] args) 
	{
		Set<Student> stdset=new TreeSet<Student>();
		
		Student std1=new Student(106,"Amit","akamitraj@gmail.com");
		Student std2=new Student(107,"Rahul","akami@gmail.com");
		Student std3=new Student(108,"Sanu","raj@gmail.com");
		stdset.add(std1);
		stdset.add(std2);
		stdset.add(std3);
		
		for(Student std:stdset)
		{
		//	std.
		}
		
		
		

	}

}
