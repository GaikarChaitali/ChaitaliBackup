package com.chaitali.ds;

import java.util.Scanner;

public class LargerNo {


public static void main(String[] args) {
	   int n,temp;
	   System.out.println("Enter no. of elements in array");
	   Scanner scanner=new Scanner(System.in);
	   int num=scanner.nextInt();
	   int a[] = new int[num];
      System.out.println("Enter the elements in array");
      for(int i=0;i<num;i++)
      {
   	a[i]=scanner.nextInt();   
      }
      for(int i=0;i<num;i++)
      {
   	   for(int j=i+1;j<num;j++)
   	   { if(a[i]>a[j])
   	   {
   		   temp=a[i];
   		   a[i]=a[j];
   		   a[j]=temp;
   	   }
   	   }
      } 
      
     
      System.out.println(a[num-1]);

  
  }
  }
	

