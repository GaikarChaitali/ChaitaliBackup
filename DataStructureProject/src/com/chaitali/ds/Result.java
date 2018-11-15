package com.chaitali.ds;

import java.util.Scanner;

//que4//
public class Result {
	public static void main(String[] args){
		 int sub1,sub2,sub3;
		 System.out.println("Enter marks:");
		 Scanner sc=new Scanner(System.in);
		 sub1=sc.nextInt();
		 sub2=sc.nextInt();
		 sub3=sc.nextInt();
		 if(sub3>60 && sub2>60 && sub3>60)
		 {
			 System.out.println("Congratulations! you are pass.");
		 }
		 else 
			 if(sub1>60&&sub2>60 ||sub2>60&&sub3>60 ||sub3>60&&sub1>60)
			 {
				 System.out.println("Promoted");
			 }
			 else 
				 System.out.println("Failed");
	 }
	 
	}



 