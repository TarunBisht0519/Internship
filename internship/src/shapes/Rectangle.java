package shapes;

public class Rectangle extends Shape
{
	int length;
	int breadth;
	Rectangle(int length,int breadth,String n)
	{
		this.length=length;
		this.breadth=breadth;
		name=n;
	}
	@Override
	public void area() 
	{
	    System.out.println("NAME OF SHAPE :"+name);
        System.out.println("TYPE OF SHAPE: RECTANGLE");
        System.out.println("LENGTH  :"+length);
        System.out.println("BREADTH  :"+breadth);
		System.out.println("AREA OF RECTANGLE IS "+length*breadth);
	}

}
