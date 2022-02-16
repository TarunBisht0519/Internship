//Write a java program to print the pattern as depicted below. 
//01 0011 000111 00001111 0000011111 ... so on

package logical;
import java.util.*;
public class p4 
{
	public void rec(int a,int b)
	{
		if(b<=a)
		{
			for(int i=0;i<b;i++)
			{
				System.out.print("0");
			}
			for(int i=0;i<b;i++)
			{
				System.out.print("1");
			}
			System.out.print(" ");
			b++;
			rec(a,b);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x<=0)
		{
			System.out.println("PLEASE ENTER NUMBER GREATER THAN ZERO");
		}
		p4 obj=new p4();
		obj.rec(x,1);
	}

}
