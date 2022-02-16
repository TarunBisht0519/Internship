//Q->Write a comparison method that compare two int A and B, and returns true 
//1) if A is equal to B
//2) if A is in range of 10 percent less than or 10 percent greater than B, For example if if B is 100, A should be in range of 90 - 110 as 10 percent of 100 is 10
//else return false.


package logical;
import java.util.*;
public class p3 
{
	public boolean compare(int a,int b)
	{ 
		int c=0;
		try
		{
			c=(int)(b*(10/100.0f));
		}
		catch(Exception e)
		{
			System.out.println("NUMBER CANNOT BE DIVIDED BY ZERO");
			System.exit(0);
		}
		if(a==b)
		{
			return true;
		}
		else if(a>=b-c && a<=b+c)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		p3 obj=new p3();
		while(true)
		{
			System.out.println("ENTER FIRST NUMBER");
			int x=sc.nextInt();
			System.out.println("ENTER SECOND NUMBER");
			int y=sc.nextInt();
			System.out.println(obj.compare(x, y));
			System.out.println("ENTER 1 TO RESTART");
			System.out.println("ENTER 2 TO STOP");
			int a=sc.nextInt();
			switch(a)
			{
			case 1:
				continue;
			case 2:
				break;
			}
			
		}
		
	}

}
