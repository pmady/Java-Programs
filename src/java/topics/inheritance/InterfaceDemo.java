package com.java.topics.inheritance;

public class InterfaceDemo implements ExtendedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleInterface sam=new InterfaceDemo();
				sam.show();
				SampleInterface.display();
				
				
		sam.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("I am in class main");
		
	}

}


