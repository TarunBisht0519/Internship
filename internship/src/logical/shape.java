package logical;
import java.util.*;
class circle 
{
	String name;
	String color;
	int radius;

	circle(String name,String color,int radius)
	{
		this.name=name;
		this.color=color;
		this.radius=radius;
	}

}
class square 
{
	int sides;
	String name;
	square(int sides,String name)
	{
		this.sides=sides;
		this.name=name; 
	}
}
class rectangle 
{
	int length;
	int breadth;
	String name;
	rectangle(int length,int breadth,String name)
	{
		this.length=length;
		this.breadth=breadth;
		this.name=name;
	}
}

public class shape 

{
	public static void main(String[] args) 
	{
		ArrayList<circle>list=new ArrayList<circle>();
		ArrayList<square>list2=new ArrayList<square>();
		ArrayList<rectangle>list3=new ArrayList<rectangle>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("ENTER THE SHAPE YOU WANT TO FEED");
			System.out.println("PRESS 1 FOR CIRCLE");
			System.out.println("PRESS 2 FOR SQUARE");
			System.out.println("PRESS 3 FOR RECTANGLE");
			System.out.println("PRESS 4 FOR EXIT");
			int m=sc.nextInt();
			switch(m)
			{
			case 1:
				System.out.println("ENTER NUMBER OF CIRCLES YOU WANT TO STORE");
				int n=sc.nextInt();
				sc.nextLine();
				for(int i=0;i<n;i++)
				{
					System.out.println("ENTER NAME OF CIRCLE");
					String s=sc.nextLine();
					System.out.println("ENTER COLOR OF CIRCLE");
					String c=sc.nextLine();
					System.out.println("ENTER RADIUS OF CIRCLE");
					int r=sc.nextInt();
					sc.nextLine();
					circle ob=new circle(s,c,r);
					list.add(ob);
				}
				System.out.println("ENTER THE NAME OF CIRCLE FOR AREA CALCULAION");
				String h=sc.nextLine();
				int count=0;
				for(circle x:list)
				{
					if(x.name.equals(h))
					{
						int y=x.radius;
						
						System.out.println("THE AREA OF CIRCLE IS "+Math.PI*(y*y));
						count++;
					}
				}
				if(count==0)
				{
					System.out.println("CIRCLE NOT ADDED IN THE LIST");
				}
				continue;
			case 2:
				System.out.println("ENTER NUMBER OF SQUARES YOU WANT TO ENTER");
				int n1=sc.nextInt();
				sc.nextLine();
				for(int i=0;i<n1;i++)
				{
					System.out.println("ENTER THE SIDE");
					int s=sc.nextInt();
					sc.nextLine();
					System.out.println("ENTER THE NAME OF SQUARE");
					String j=sc.nextLine();
					square obj2=new square(s,j);
					list2.add(obj2);
				}
					System.out.println("ENTER NAME YOU WANT TO SQUARE");
					String r=sc.nextLine();
					int counts=0;
					for(square x:list2)
					{
						if(x.name.equals(r))
						{
							int b=x.sides;
							counts++;
							System.out.println("THE AREA OF SQUARE IS "+b*b);
						}
					}
					if(counts==0)
					{
						System.out.println("SQUARE NOT PRESENT");
					}	
				
				continue;
			case 3:
				System.out.println("ENTER NUMBER OF RECTANGLE YOU WANT TO ENTER");
				int n2=sc.nextInt();
				sc.nextLine();
				for(int i=0;i<n2;i++)
				{
					System.out.println("ENTER THE LENGTH");
					int l=sc.nextInt();
					sc.nextLine();
					System.out.println("ENTER THE BREADTH");
					int b=sc.nextInt();
					sc.nextLine();
					System.out.println("ENTER THE NAME OF RECTANGLE");
					String j=sc.nextLine();
					rectangle obj2=new rectangle(l,b,j);
					list3.add(obj2);
				}
					System.out.println("ENTER NAME YOU WANT TO SEARCH");
					String r1=sc.nextLine();
					int countss=0;
					for(rectangle x:list3)
					{
						if(x.name.equals(r1))
						{
							int b1=x.length;
							int b2=x.breadth;
							countss++;
							System.out.println("THE AREA OF RECTANGLE IS "+b1*b2);
						}
					}
					if(countss==0)
					{
						System.out.println("RECTANGLE NOT PRESENT");
					}	
				
			case 4:
				System.exit(0);
			}
			
		
		}
	}		
}
