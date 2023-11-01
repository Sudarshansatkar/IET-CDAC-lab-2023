
public class TestDraw 
{
	public static void main(String[] args)
	{
		Drawing d=new Rectangle();
		d.draw();
		Colour c=new Rectangle();
		c.Shade();
		
		System.out.println();
		
		Drawing d1=new Circle();
		d1.draw();
		Colour c1=new Circle();
		c1.Shade();
	}

}
