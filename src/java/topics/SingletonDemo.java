package com.java.topics;

public class SingletonDemo {
	
	//1. Creating private static variable
	private static SingletonDemo singleton = new SingletonDemo() ;
	
	//2.making private constructor to avoid further object creation
	private SingletonDemo(){}
		
		public static SingletonDemo getInstance(){
			
			return singleton;
			}

		public void doTmp(){
			System.out.println("In doTmp method");
		}
}
