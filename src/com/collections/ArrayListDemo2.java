package com.collections;

import java.util.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Mobile"); 
		l1.add("Watch");
		l1.add("Laptop");
		l1.add("Data Cable");
		l1.add("Adapter");
		l1.add("Watch");
		
		System.out.println(l1+"\n");
		System.out.println("Indexof Watch: "+l1.indexOf("Watch"));
		System.out.println("Last Indexof Watch: "+l1.lastIndexOf("Watch"));
		
		System.out.println("\nUsing Iterator");
		ListIterator<String> itr=l1.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("Mobile"); 
		l2.add("Speaker");
		System.out.println("\nRetain All method with l1");
		l2.retainAll(l1);
		System.out.println("l2 "+l2+" size: "+l2.size()); 
		
		List<String> l3=l1.subList(1, 4);
		System.out.println("l1.subList(1,4): "+l3); 
		
		Object obj[]=l1.toArray();
		System.out.println("\nL1 To Array");
		for(Object i:obj)
			System.out.print(i+", ");
		
		System.out.println("\n\nDefault Sort using Collections.sort(l1)");
		Collections.sort(l1);
		System.out.println(l1);
		
		System.out.println("\n\nAscending Sort using Comparator interface");
		l1.sort(Comparator.naturalOrder());
		System.out.println(l1);
		
		System.out.println("\n\nDescending Sort using Comparator interface");
		l1.sort(Comparator.reverseOrder());
		System.out.println(l1);
	} 
}
