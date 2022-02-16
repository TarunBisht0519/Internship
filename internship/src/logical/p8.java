//Write a method stringReverse that takes a character array containing a string as an argument and prints
//the string backwards.Try to provide both iterative and recursive implementations.

package logical;
import java.util.*;
public class p8 
{
	String h="";
	//through recursion
 void rec(String s,int start,int stop)
	{
		if(stop>start)
		{
			h=h+s.charAt(stop-1);
			stop=stop-1;
			rec(s,start,stop);
		}
	}
	public void print()
	{
		System.out.println(h);
	}
	public static void main(String[] args)
	{
		p8 obj=new p8();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("please enter a string");
			String s=sc.nextLine();
		
		    obj.rec(s, 0, s.length());
		    obj.print();
		
		//through loop
		    String f="";
		    for(int i=s.length()-1;i>=0;i--)
		    {
		    	f=f+s.charAt(i);
		    }
		    System.out.println(f);
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
