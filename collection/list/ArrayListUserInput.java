package com.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUserInput {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		while(true)
		{
			int n =sc.nextInt();
			if(n==1)
			{
				break;
			}
			arr.add(n);
		}
		

	}

}
