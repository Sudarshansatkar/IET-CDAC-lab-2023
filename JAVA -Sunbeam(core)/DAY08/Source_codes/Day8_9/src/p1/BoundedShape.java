package p1;

public abstract class BoundedShape
{
	// can a abstract class have some fileds? YES
	private int x,y;
	
	public BoundedShape(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	
	@Override
	public String toString() {
		return "BoundedShape [x=" + x + ", y=" + y + "]";
	}

	// area() is the abstract method , common method in super class
	// so simply we have supplied only declaration
	public abstract double area();
}
