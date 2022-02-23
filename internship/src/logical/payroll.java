package logical;
import java.util.*;
public class payroll 
{
	public static void main(String[] args) 
	{
		int fixed=10000;
		int hourly=500;
		int base=12000;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("SELELCT OPTION FOR PAYMENT TYPE");
			System.out.println("SELECT 1 FOR SALARIED TYPE ");
			System.out.println("SELECT 2 FOR HOURLY TYPE ");
			System.out.println("SELECT 3 FOR COMMISSIONED TYPE ");
			System.out.println("SELECT 4 FOR BASE SALARIED COMMISSION TYPE ");
			System.out.println("SELECT 5 for exiting ");
			int x=sc.nextInt();
			switch(x)
			{
			case 1:
				System.out.println("THE SALARY IS "+fixed);
				continue;
			case 2:
				System.out.println("PLEASE ENTER NUMBER OF HOURS worked in a week");
				int g=sc.nextInt();
				if(g>40)
				{
					int sal=(hourly*15)/10;
					System.out.println("SALARY :"+sal*g);
					continue;
				}
				else
				{
					System.out.println("SALARY: "+hourly*g);
					continue;
				}
			case 3:
				System.out.println("PLEASE ENTER THE SALES RECORDED INT THE WEEK");
				int c=sc.nextInt();
				int sal=(int)(c*(15/100.0f));
				System.out.println("SALARY :"+sal);
				continue;
			case 4:
				System.out.println("PLEASE ENTER THE SALES RECORDED INT THE WEEK");
				int b=sc.nextInt();
				int sals=(int)(b*(12/100.0f));
				int inc=(int)(base*(10/100.0f));
				sals=base+inc+sals;
				System.out.println("COMPANY DECIDED TO GIVE INCREMENT OF 10% OF YOUR CURRENT BASE SALARY");
			
				System.out.println("NEW SALARY IS"+sals);
				continue;
			case 5:
				break;
				default:break;
			}
			sc.close();
		}
		
		
	}

}
