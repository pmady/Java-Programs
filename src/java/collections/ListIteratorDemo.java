package com.java.collections;

import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> al=new ArrayList<>();
		al.add("Pavan");
		al.add("rushi");
		al.add("Somu");
		al.add(1,"Manoj");
		
		//Iterator it= al.iterator();
		
		
		List<String> al2=new ArrayList<>();
		al2.add("Avinash");
		al2.add("Uday");
		al2.add("Goutham");
		al.addAll(al2);
		System.out.println(al.subList(0,2));
		ListIterator lit=al.listIterator();
		System.out.println("Printing in normal order");
		while(lit.hasNext())
			System.out.println(lit.next());
		System.out.println("Printing in reverse order");
		while(lit.hasPrevious())
			System.out.println(lit.previous());
	}

}
