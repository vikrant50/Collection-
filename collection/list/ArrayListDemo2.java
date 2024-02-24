package com.collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListDemo2 {

	public static void main(String[] args) 
	{
		ArrayList<String> as=new ArrayList<>();
		as.add("bihar");
		as.add("Bhopal");
		as.add("Kolkata");
		as.add("Dlehi");
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("odisa");
		al.add("siwan");
		al.add("patna");
		al.add("gujrat");
		
		ArrayList aa=new ArrayList();
		
		ArrayList<String> ab=new ArrayList<String>();
		ab.add("tamilnadu");
		ab.add("kerala");
		ab.add("maldives");
		ab.add("goa");
		
		Map<String,ArrayList<String>> map=new HashMap<>();
		map.put("North India", as);
		map.put("South India", ab);
		map.put("East India", al);
		
		System.out.println(map);
//		
//		Map<String,Map<String,ArrayList<String>>> h=new HashMap();
//			h.put(null, map)
//		
//		
		
	}

}
