//question->Do a program to find average from an array of integers.

package logical;
import java.util.*;
public class p1 
{
	public void check(int n) throws ArithmeticException
	{
		if(n<=0)
		{
			throw new ArithmeticException("PLEASE ENTER NUMBER GREATER THAN 0");
			
			
		}
	}
	public static void main(String[] args) 
	{
		p1 obj=new p1();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("ENTER SIZE OF ARRAY");
			
			int n=sc.nextInt();
			try
			{
				obj.check(n);
			} 
			catch(Exception e)
			{
				System.out.println(e);
				System.exit(0);
			}
			int [] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				System.out.println("enter element");
				arr[i]=sc.nextInt();
			}
			System.out.println("your entered array is "+Arrays.toString(arr));
			
			float sum=0;
			for(int c:arr)
			{
				sum=sum+c;
			}
			int h=0;
			System.out.println("THE AVERAGE IS "+(sum/arr.length));
			System.out.println("ENTER 1 FOR RESTART");
			System.out.println("ENTER 2 FOR EXIT");
			int x=sc.nextInt();
			switch(x)
			{
			case 1:
				continue;
			case 2:
				System.out.println("THANKYOU");
				h++;
				System.exit(0);
				default:
					break;
			}
			
			if(h!=0)
			{
				break;
			}
		}
		
	}

}
