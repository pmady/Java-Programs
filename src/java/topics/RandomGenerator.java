package com.java.topics;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

	public static void main(String[] args) {
		System.out.println("Enter the number of random numbers to be generated " );
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Random ran=new Random();
		int i;
		for(i=0;i<num;i++){
			System.out.println(ran.nextInt(1000));
		}

	}

}
