package com.digit.javaTraining.basicpatterns;

public class patternA {
	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0||i==(n-1)/2||(j==n-1&&i<=(n-1)/2)||(i==j)&&(j>=(n-1)/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("       ");
			for(int j=0;j<n;j++)
			{
				if((j==0&&i!=0)||(j==(n-1)&&i!=0)||((i==0)&&j!=0&&j!=(n-1))||(i==(n-1)/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("       ");
			for(int j=0;j<n;j++)
			{
				if(j==0||j==(n-1)||(i==(n-1)/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("       ");
			for(int j=0;j<n;j++)
			{
				if(j==0||j==(n-1)||i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("       ");
			for(int j=0;j<n;j++)
			{
				if(j==0||i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("       ");
			for(int j=0;j<n;j++)
			{
				if(j==0&&i<=(3*n)/4||(i==0)&&j<=(3*n)/4||(i==(3*n)/4)&&(j<=(3*n)/4)&&(j!=0)||(j==(3*n)/4 && i<=(3*n)/4)||(i==j)&&i>=(n-1)/2)
				{
					System.out.print("* ");
					}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
