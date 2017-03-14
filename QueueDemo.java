package com.java.collections;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> pq=new PriorityQueue<>();
		pq.add("Pavan");
		pq.add("raju");
		pq.add("rushi");
		Queue<String> pq1=new PriorityQueue<>();
		pq1.add("Somu");
		pq1.add("Rushi");
		pq.addAll(pq1);
//		pq.peek();
//		pq.element();
//		pq.offer(null);
//		pq.poll();
//		pq.remove();
		System.out.print(pq);
		//System.out.println(pq.);
	}

}
