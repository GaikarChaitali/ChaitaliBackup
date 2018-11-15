package com.chaitali.ds;

import java.util.Scanner;

public class SearchNo {

	//to find no in array  que7//

	 public static void main(String[] args) {
	   int n,temp;
	   System.out.println("Enter no. of elements in array");
	   Scanner scanner=new Scanner(System.in);
	   int num=scanner.nextInt();
	   int a[] = new int[15];
	   System.out.println("enter the no you want to search");
	   int search=scanner.nextInt();
      System.out.println("Enter the elements in array");
      for(int i=0;i<num;i++)
      {
   	a[i]=scanner.nextInt();   
      }
      
      for(int i=0;i<num;i++)
      {
   	   if(a[i]==search)
   	   {
   		   System.out.println("Yes number"+a[i]+" is present");
   	   }
      }

  
  }
}
	

