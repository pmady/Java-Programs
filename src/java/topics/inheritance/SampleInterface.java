package com.java.topics.inheritance;

public interface SampleInterface {
	
	void print();
	static void display(){
		System.out.println("Inside display method Sample Interface");
	}
	default void show(){
		System.out.println("Inside show method Sample Interface");
	}

}

interface ExtendedInterface extends SampleInterface{
	
	void print();
	static void display(){
		System.out.println("Inside display method Extended Interface");
	}
	default void show(){
		System.out.println("Inside show method Extended Interface");
	}
}
