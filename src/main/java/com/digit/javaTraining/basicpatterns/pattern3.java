package com.digit.javaTraining.basicpatterns;

public class pattern3 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
			
		}
		for(int i=0;i<3;i++)
		{
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println();
		}
		int k=1;
		int l=0;
		int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(count<10)
					System.out.print(l);
				System.out.print(k+ " ");
				k++;
				count++;
			}
			System.out.println();
		}	
		for(int i=0;i<3;i++)
		{
			System.out.println();
		}
		int c=1;
		int b=1;
		int a=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(c<10)
					System.out.print(a);
				System.out.println(b+ " ");
				b++;
				count++;
			}
			System.out.print("");
		}	
	}
}
