package com.chaitali.ds;

import java.util.Scanner;

public class BubbleSort {

//bubble sort que 8//
	 public static void main(String[] args) {
	 int n,temp;
	 Scanner scanner=new Scanner(System.in);
	 int a[] = new int[15];
     System.out.println("Enter the elements in array");
     for(int i=0;i<15;i++)
      {
   	   a[i]=scanner.nextInt();   
      }
      for(int i=0;i<15;i++)
      {
   	   for(int j=i+1;j<15;j++)
   	   { if(a[i]>a[j])
   	   {
   		   temp=a[i];
   		   a[i]=a[j];
   		   a[j]=temp;
   	   }
   	   }
      } 
      
      for(int i=0;i<15;i++)
      System.out.print(a[i]+ " ");

  
  }
  }
	

