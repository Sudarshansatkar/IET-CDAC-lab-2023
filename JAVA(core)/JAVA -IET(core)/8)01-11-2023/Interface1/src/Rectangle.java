
public class Rectangle implements Drawing,Colour
{
	public void draw()
	{
		System.out.println("Rectangle");
	}

	@Override
	public void Shade() 
	{
		System.out.println("RED");
	}
	

}
