package com.chaitali.ds;

import java.util.Scanner;

public class SimpleCompound {
	
	//que3//
	public static void main(String[] args) {
		int SI,CI;
		System.out.println("Enter P,N,R to calculate SI");
		Scanner sc = new Scanner(System.in);
		int principal=sc.nextInt();
		int rate=sc.nextInt();
		int years=sc.nextInt();
		SI=principal*rate*years;
		System.out.println("Simple Interest is"+SI);
		
		
		
		System.out.println("Enter P,N,R to calculate CI");
		Scanner cs = new Scanner(System.in);
		int n=cs.nextInt();
		int p=cs.nextInt();
		int r=cs.nextInt();
		CI=(int) (p*Math.pow((1+(r/100)),2n));
		System.out.println("compound Interest is"+CI);
		
		}

}
