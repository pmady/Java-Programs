package com.java.topics;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter the number" );
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if(i%2==0){
			System.out.println("Given number "+i+" is EVEN");
		}
		else{
			System.out.println("Given number "+i+" is ODD");
		}

	}

}
