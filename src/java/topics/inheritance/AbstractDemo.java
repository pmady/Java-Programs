package com.java.topics.inheritance;

public abstract class AbstractDemo {
	
	abstract void show();
	
	void display(){
		System.out.println("Abstract dsiplay method");
		
	}
	static void view(){
		System.out.println("Abstract view method");

	}
	final boolean had(String S, StringBuffer Sb){
		System.out.println("Abstract final method");
		if (S.equals(Sb.toString())){
			return true;
		}
		else
		return false;

	}

}

