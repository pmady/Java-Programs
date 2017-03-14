package com.java.topics;

import java.util.Scanner;

public class CircleArea {

public static void main(String[] args) {
		
		System.out.println("Enter radius");
		Scanner sc= new Scanner(System.in);
		double radius=sc.nextDouble();
		double area,circumference;
		area=Math.PI*(radius*radius);
		circumference=Math.PI*(2*radius);
		System.out.println("The Area and Circumference are :"+area+" "+ circumference+" with radius "+radius);
	}

}
