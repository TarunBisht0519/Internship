//Write a program to print the following pattern:
//54321
//4321
//321
//21
//1
//Further try that it should take a positive integer n as input and print the pattern accordingly.
//In above example n=5.


package logical;
import java.util.*;
public class p6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("PLEASE ENTER A POSITIVE NUMBER");
		int x=sc.nextInt();
		if(x<=0)
		{
			System.out.println("PLEASE ENTER NUMBER GREATR THAN ZERO");
		}
		for(int i=0;i<x;i++)
		{
			for(int j=x-i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("PRESS 1 FOR RE-RENTERING THE NUMBER");
		System.out.println("PRESS 2 FOR EXITING PROGRAMME");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
			continue;
		case 2:
			System.exit(0);
		}
		}
	}

}
