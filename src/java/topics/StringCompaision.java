package com.java.topics;

public class StringCompaision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Somu";
		System.out.println(s.hashCode());
		String r="Rushi";
		System.out.println(r.hashCode());
		s=s.concat(r);
		System.out.println(s);
		System.out.println(s.hashCode());
		if(s.equals("SomuRushi")){
			System.out.println("Equals");
		}
		else
			System.out.println("Jaffa");
	}

}
