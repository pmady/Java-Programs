package com.java.topics;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of strings" );
		int num=sc.nextInt();
		System.out.println("Enter the strings" );
		String[] s=new String[10];
		
		int i;
		String Concat=null;
		for(i=0;i<=num;i++){
			s[i]=sc.nextLine();
		}
		for(i=0;i<=num;i++){
			Concat=Concat+s[i];
		}
		System.out.println(Concat);
	}

}
