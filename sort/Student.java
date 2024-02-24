package com.sort;

public class Student implements Comparable<Student>
{

	//write a program to sort Student class Object based age or name
	//id   name  age
	//101  zebu   24
	//102  price  21
	//103  Dep    34
	
	//steps:- will have crate private variable and we have to generate setter and getter and constructor and toString then will have to implement comparable interface then in that method will have to write logic based on age or name whatever then in main class will have traverse student object
	
	//for the we can use comparable and compartor two ways to sort the object 
	private int id;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	private String name;
	private int age;
	
	//when you implemented Comparable interface then this method we will get and have to do here 
	@Override
	public int compareTo(Student s) 
	{
		//we have to write some logic here
		//return this.name.compareTo(s.name);//based on name 
		//java == java ---->return 0 (ASCI VALVUE)
		//apple == banana---->return 1
		//banana == apple --->return -1
		
		//if you want to sort based on age then :
		//note :- here you can chavnge only if you want sort name and id anything from here only ndeed to  change 
		if(this.id==s.id)
		{
			return 0;
		}
		else if(this.id<s.id)
		{
			return -1;
		}
		else
			return 1;
	
	}
	
}
