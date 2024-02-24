package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) 
	{
		// Sort the element and String .....natural sorting order ...accending order 
		List<String> sl=new ArrayList();
		sl.add("d");
		sl.add("s");
		sl.add("a");
		sl.add("e");
	    Collections.sort(sl);
	    System.out.println(sl);
	
	    List<Integer> ls=new ArrayList();
	    ls.add(3);
	    ls.add(33);
	    ls.add(32);
	    ls.add(12);
	    ls.add(76);
	    
	    System.out.println("-------------Before sorting-----------");
	    for(Integer temp:ls)
	    {
	    	System.out.println(temp);
	    }
	    Collections.sort(ls);
	    System.out.println("---------After sorting ------------");
	    for(Integer temp:ls)
	    {
	    	System.out.println(temp);
	    }
       
	}

}
