package logical;

public class Rectangle extends Shape
{
	int length;
	int breadth;
	String name;
	Rectangle(int length,int breadth,String name)
	{
		this.length=length;
		this.breadth=breadth;
		this.name=name;
	}
	@Override
	public void area() 
	{
		System.out.println("AREA OF Rectangle IS "+length*breadth);
	}

}
