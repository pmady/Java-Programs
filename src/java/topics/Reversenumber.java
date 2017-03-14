package com.java.topics;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		
		System.out.println("Enter number to reverse");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		while(num!=0){
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
			}
		System.out.println("The reverse of is "+rev);
	}

}
