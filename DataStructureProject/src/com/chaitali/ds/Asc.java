package com.chaitali.ds;

import java.util.Scanner;

public class Asc {
	   Scanner scanner=new Scanner(System.in);
       int a[] = new int[10];
	  
       public void getValue()
	   {
	  
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter the elements in array");
       for(int i=0;i<5;i++)
       {
    	a[i]=scanner.nextInt();   
       }
	   swap();
	   }
	   
       
       
       public void swap()
	   { 
		   int temp;
		  
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

