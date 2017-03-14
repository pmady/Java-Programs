package com.java.topics;

class Parentclass
{
   Parentclass(){
	   System.out.println("Parent class Constructor");
   }
	void display(){
	System.out.println("Parent class method");
   }
}
class Subclass extends Parentclass
{
   
	Subclass(){
		   System.out.println("Sub class Constructor");
	   }
	
	void display(){
		System.out.println("Child class method");
	   }
	void printMsg(){
	/* This would call parent class method
	 * no need to use super keyword
	 */
	
		super.display();
		display();
   } 
   public static void main(String args[]){
		
	Subclass obj= new Subclass();
        obj.printMsg(); 
   }
}