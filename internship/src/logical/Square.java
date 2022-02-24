package logical;

public class Square extends Shape 
{
	String name;
	int side;
	Square(String name,int side)
	{
		this.name=name;
		this.side=side;
	}
	@Override
	public void area() 
	{
		System.out.println("AREA OF Square IS "+side*side);
	}

}
