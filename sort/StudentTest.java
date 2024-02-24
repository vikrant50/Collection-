package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest 
{

	public static void main(String[] args)
	{
		
		   
		 // to sort object student class we have two types comparavle and comparator interface 
	    // Comparable :- it is natural sorting order it will support on single feild sorting 
	   //  Comparator :- it is for Customized order sorting and it will support on multiple feild sorting 

     	//create student list
		List<Student> students=new ArrayList<>();//student objectt created 
		
		//create multiple student student object
		Student s1=new Student(105,"prince",24);
		Student s2=new Student(102,"ajay",21);
		Student s3=new Student(103,"deepak",67);
		
		
		//Add Student object in List
//	    students.add(s1);
//		students.add(s1);
//      students.add(s1);//instead of this we can multiple object below
	
		Collections.addAll(students, s1,s2,s3);//added
		
		//print all student list
		for(Student s:students)
		{
			System.out.println(s.toString());
		}
		
		//here we write sorting code to sort student list based on name of student which is natural order sorting --->with the help of comparable inteface
		//Collection.sort(student)//..it will show error ...we can't sort throgh this it will take only and only list of predefined data types only we can't sort it 
		//we have to implements comparable interface in student class
		
		Collections.sort(students);//now error will not show because you have implemented comparable interface in student class
		System.out.println("\n\n-----After sorting using comparable----");
		for(Student s:students)
		{
			System.out.println(s.toString());
		}
	}
	}
