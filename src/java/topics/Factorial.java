package com.java.topics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the number to factorial be generated " );
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int Fact=1;
		while(num>0){
			Fact=Fact*num;
			num--;
		}
		System.out.println("Factorial is: "+Fact );
	}

}
