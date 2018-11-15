package com.chaitali.ds;

public class Armstrong {
	public static void main(String[] args) {   //que2//
		int i,num,a,sum;
		for(i=100;i<=999;i++)
		{   sum=0;
			num=i;
			while(num!=0)
			{
			a=num%10;
			sum=sum+(a*a*a);
			num=num/10;
			}
			if(i==sum)
			{
				System.out.println(sum);
			}
		}
	}

}
