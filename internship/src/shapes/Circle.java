package shapes;

public class Circle extends Shape
{
	int radius;
	
	Circle(int radius,String n)
	{
		this.radius=radius;
		name=n;	
	}
	
	@Override
	public void area() 
	{
	    System.out.println("NAME OF SHAPE :"+name);
	    System.out.println("TYPE OF SHAPE: CIRCLE");
	    System.out.println("RADIUS :"+radius);
		int r=radius*radius;
		System.out.println("AREA OF CIRCLE IS "+Math.PI*r);	
	}

}
