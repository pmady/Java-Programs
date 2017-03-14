package com.java.topics;

public class Constructor {

	public Constructor(){
		
		System.out.println("I am in Default Constructor");
	}
	
	public Constructor(int num)
	{
		System.out.println("I am in Parameter Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor con=new Constructor(2);
System.out.println("I am in New Constructor");
	}

}
