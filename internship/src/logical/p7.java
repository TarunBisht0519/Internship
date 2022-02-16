//Given a non-negative int n, return the sum of its digits using
//1: recursion
//2: loops ( without recursions )

package logical;
import java.util.*;
public class p7 
{
	int sums=0;
	//with recursion
	public void rec(String s,int start,int stop)
	{
		if(start<stop)
		{
			String h=""+s.charAt(start);
			sums=sums+Integer.valueOf(h);
			start++;
			rec(s,start,stop);
		}
	}
	public void print()
	{
		System.out.println("WITH RECURSION "+sums);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x<0)
		{
			System.out.println("PLEASE ENTER A POSITIVE NUMBER ");
			System.exit(0);
		}
		String s=String.valueOf(x);
		int sum=0;
		//without recursion
		long start1=System.nanoTime();
		for(int i=0;i<s.length();i++)
		{
			String h=""+s.charAt(i);
			sum=sum+Integer.valueOf(h);
		}
		long stop1=System.nanoTime();
		System.out.println("WITHOUT RECURSION "+sum);
		System.out.print("time taken without recursion:->");
		System.out.printf("%.6fs",(float)(stop1-start1)/1000000000);
		System.out.println();
		p7 obj=new p7();
		long start2=System.nanoTime();
		obj.rec(s, 0, s.length());
		long stop2=System.nanoTime();
		obj.print();
		
		System.out.print("time taken with recursion:->");
		System.out.printf("%.6fs",(float)(stop2-start2)/1000000000);
	}

}
