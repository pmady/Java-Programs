package com.java.topics;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		double USD;
		double EUR;
		double GBP;
		double UI,EI,GI;
		double d;
		String s="1.234";
		int i= sc.nextInt();
		int result[]= new int[100];
		for(int j=0;j<i;j++){
			UI=sc.nextDouble();
			EI=sc.nextDouble();
			GI=sc.nextDouble();
			EUR= 100000/UI;
			GBP=EUR/EI;
			USD=GBP/GI;
			int profit= (int)Math.round(USD-100000);
			if(profit>0){
				  d = Double.parseDouble(s);
			System.out.println(profit);}
			else{
				System.out.println("0");
		}
			
		}}}
	


