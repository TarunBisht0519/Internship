package shapes;

public class Circle extends Shape
{
	int radius;
	String name;
	Circle(int radius,String name)
	{
		this.radius=radius;
		this.name=name;	
	}
	
	@Override
	public void area() 
	{
		int r=radius*radius;
		System.out.println("AREA OF Circle IS "+Math.PI*r);	
	}

}
