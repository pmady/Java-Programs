package com.java.collections;

import java.util.*;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Set<String> hashSet=new HashSet<>();
		Set <String> set=new LinkedHashSet<>();
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add("Pavan");
		System.out.println(hashSet);
		System.out.println("Enter the number of elements to be added");
		int count=sc.nextInt();
		int i;
		System.out.println("Enter names to add");
		
		for(i=1;i<=count;i++){
			set.add(sc.next());
		}
		System.out.println("Entered list of elements unsorted order");
		System.out.println(set);
		//System.out.println(set.hashCode());
		SortedSet <String> ts=new TreeSet<>(set);
		System.out.println("Entered list of elements in Sorted order");
		System.out.println(ts);
	}

}
