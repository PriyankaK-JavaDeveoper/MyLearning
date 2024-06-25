package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {
public static void main(String[] args) {
	ArrayList<String> list1=new ArrayList<String>();
	ArrayList<String> list2=new ArrayList<String>();
	ArrayList<String> Clonelist=new ArrayList<String>();
	list1.add("1. Priya");
	list1.add("2. Kavya");
	list1.add("3. Suganya");
	list1.add("4. Divya");
	list1.add("5. Ramya");
	System.out.println("List 1");
	System.out.println(list1+"\n"); 
	
	list2.add("6. Dharani");
	list2.add("7. Bavani");
	System.out.println("List 2");
	System.out.println(list2+"\n");
	
	list1.addAll(list2);
	System.out.println("List 1 after addAll()");
	System.out.println(list1+"\n"); 
	
	Clonelist=(ArrayList<String>)list1.clone();
	System.out.println("Clonelist after List1.clone()");
	System.out.println(Clonelist+"\n");
	
	Clonelist.clear();
	System.out.println("Clonelist after clear()");
	System.out.println(Clonelist+"\n");
	
	System.out.println("Checking if clonelist is Empty: "+Clonelist.isEmpty());
	
	list1.set(0, "1. Priyanka");
	System.out.println("\nList 1 after set()"+list1+"\n");
	
	System.out.println("List1 size: "+list1.size());
	System.out.println("List2 size: "+list2.size());
	
	list1.replaceAll(e -> e.toUpperCase()); 
	System.out.println("\nList1 after list1.replaceAll to UpperCase "+"\n"+list1);
	
	Collections.replaceAll(list1, "2. KAVYA", "2. RUBASRI");
	System.out.println("\nCollections.replaceAll: \n"+list1); 
	
	list1.removeAll(list2);
}
}
