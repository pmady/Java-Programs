package com.java.topics.inheritance;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal obj=new Bird();
		obj.Action("Pavan");
		obj.Add(10, 15);
		//obj.Action("barks");
		//obj.Action("squeals");
			}
}

 class Animal{
	 
	 public Animal(){
		 System.out.println("Animal Constructor");
	 }
	 public void Action(){
		 System.out.println("In Animal class");
	 }
	 public void Action(String action){
		 System.out.println("The Animal :"+action);
	 }
	 public void Add(int a,int b){
		 int sum=a+b;
		 System.out.println(sum);
	 }
	
}
 
 class Bird extends Animal{
	 
	 public Bird(){
		 System.out.println("Bird Constructor");
	 }
	 @Override
	 public void Action(){
		 System.out.println("In Bird class");
	 }

	@Override
	public void Action(String action) {
		// TODO Auto-generated method stub
		//super.Action(action);
		System.out.println("The Bird :"+action);
	}
	 
 }