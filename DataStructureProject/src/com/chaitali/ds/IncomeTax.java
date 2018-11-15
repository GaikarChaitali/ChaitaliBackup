package com.chaitali.ds;

import java.util.Scanner;

public class IncomeTax {
	
	//que5//
	
	public static void main(String[] args) {
		int income;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income:");
		income=sc.nextInt();
		if(income>0 && income<180000)
		{
			System.out.println("Nil");
		}
		else if(180001>income && income<300000)
		{
			System.out.println("10%");
		}
		else if(income>300001 && income<500000)
		{
			System.out.println("20%");
		}
		else if(income>500001 && income<1000000)
		{
			System.out.println("30%");
		}
	}

}
