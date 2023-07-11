package Test;

import java.util.Scanner;

public class AS {
public static void main(String[] args) {
	System.out.println("enter a number to check it is prime number or not");
	
	Scanner sc=new Scanner(System.in);
	
	int num=sc.nextInt();
	int flag=0;
	
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			flag++;
		}
	}
	if(flag==2)
	{
		System.out.println(num+" this is prime");
	}
	else
	{
		System.out.println(num+ "this number is not");
	}
}
}
