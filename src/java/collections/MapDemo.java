package com.java.collections;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <String,Integer> map=new LinkedHashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements to be added");
		int count=sc.nextInt();
		int i;
		System.out.println("Enter names to add");
		
		for(i=1;i<=count;i++){
			map.put(sc.next(), sc.nextInt());
		}
		System.out.println(map.get("pavan"));
		
//		SortedMap<String,Integer> sm=new TreeMap<>(map);
//		System.out.println(sm);
	}

}
