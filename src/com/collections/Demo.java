package com.collections;

import java.util.*;

public class Demo {
public static void main(String args[]){
	Set set=new TreeSet();
	set.add(25);
	set.add(55);
	set.add(65);
	set.add(15);
	System.out.println(set);
	Set hashSet=new LinkedHashSet();
	hashSet.add(25);
	hashSet.add(55);
	hashSet.add(65);
	hashSet.add(15);
	System.out.println(hashSet);
}
}
