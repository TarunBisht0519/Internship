package shapes;

public class Square extends Shape 
{
	int side;
	Square(String n,int side)
	{
		name=n;
		this.side=side;
	}
	@Override
	public void area() 
	{
	    System.out.println("NAME OF SHAPE  :"+name);
	    System.out.println("TYPE OF SHAPE  : SQUARE");
	    System.out.println("SIDE LENGTH  :"+side);
		System.out.println("AREA OF Square IS "+side*side);
	}

}
