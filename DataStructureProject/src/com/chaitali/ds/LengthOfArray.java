package com.chaitali.ds;

import java.util.Scanner;

public class LengthOfArray {

       public static void main(String[] args) {
	   int n,temp;
	   System.out.println("Enter no. of elements in array");
	   Scanner scanner=new Scanner(System.in);
	   int num=scanner.nextInt();
	   int a[] = new int[5];
      System.out.println("Enter the elements in array");
      for(int i=0;i<5;i++)
      {
   	a[i]=scanner.nextInt();   
      }
      for(int i=0;i<5;i++)
      {
   	   for(int j=i+1;j<5;j++)
   	   { if(a[i]>a[j])
   	   {
   		   temp=a[i];
   		   a[i]=a[j];
   		   a[j]=temp;
   	   }
   	   }
      } 
      
      for(int i=0;i<5;i++)
      System.out.println(a[i]);

  
  }
  }
	

