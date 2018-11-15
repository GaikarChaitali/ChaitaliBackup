package com.chaitali.ds;

public class IsArmstrong {
	
	public static void main(String[] args) {  //que1//
		
		int a,num=153,sum=0,temp;
		temp=num;
		while(num!=0)
		{
			a=num%10;
			sum=sum+(a*a*a);
			num=num/10;
		}
	    if(temp==sum)
	    {
	    	System.out.println("the number"+temp+"is Armstrong");
	    }
	    else
	    	System.out.println("the number"+temp+"is Not Armstrong");
	}

}
