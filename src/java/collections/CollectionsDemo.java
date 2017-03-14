package com.java.collections;

import java.util.*;

public class CollectionsDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Scanner sc=new Scanner(System.in);
		List <String> collect=new ArrayList<>();
		ArrayList al=new ArrayList();
		System.out.println("Enter the number of elements to be added");
		int count=sc.nextInt();
		int i;
		System.out.println("Enter names to add");
		
		for(i=1;i<=count;i++){
			collect.add(sc.next());
		}
	//	collect.addAll(collect);
//		collect.add("Rushi");
//		collect.add("Somu");
//		collect.add("Manoj");
		//Scanner sc=new Scanner(System.in);
		//String s=sc.nextLine();
//		if(collect.contains(s)){
//			System.out.println("found");
//		}
//		else 
//			System.out.println("Not found");
//	}
		//for(i=0;i<count;i++)
			System.out.println(collect);
			System.out.println("Enter Index");
			int index=sc.nextInt();
			collect.remove(index);
			System.out.println(collect);
			Iterator iter=collect.iterator();

			Collections.sort(collect);
			for(String obj:collect){
				System.out.println(obj);
			}
//			while(iter.hasNext()){
//				
//				System.out.println("In iterator"+iter.next());
//			}
		}
		catch(Exception e){
			System.out.println("hurray u got wrong");
		}
}
		}
