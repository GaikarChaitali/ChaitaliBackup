package com.chaitali.ds;

import java.util.Scanner;

public class FinalScore {
	public static void main(String[] args) {
		
		//que9//
		
		int sum1=0, sum2=0 ,sum3=0;
		
		Scanner scanner=new Scanner(System.in);
		int stud1[]=new int[3];
		System.out.println("Enter all subjects marks for student1");
		for(int i=0;i<3;i++)
		{
			stud1[i]=scanner.nextInt();
			sum1=sum1+stud1[i];
			
		}
		 float avg1=sum1/3;
		 System.out.println("avg1:"+avg1);
		
		int stud2[]=new int[3];
		System.out.println("Enter all subjects marks for student2");
		for(int i=0;i<3;i++)
		{
			stud2[i]=scanner.nextInt();
			sum2=sum2+stud2[i];
			
		}
		float avg2=sum2/3;
		System.out.println("avg2:"+avg2);
		
		int stud3[]=new int[3];
		System.out.println("Enter all subjects marks for student3");
		for(int i=0;i<3;i++)
		{
			stud3[i]=scanner.nextInt();
			sum3=sum3+stud3[i];
			
		}
		float avg3=sum3/3;
		System.out.println("avg3:"+avg3);
	}
     
}
