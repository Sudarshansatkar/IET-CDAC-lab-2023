using hardware;
using transflower.drawing;


public class Circle: Shape,IPrinter
{
    public Point Center{get;set;}
    public int radius{get; set;}

    public Circle():base()
    {
        this.Center=new Point(0,0);
        this.radius=4;
    }

    public Circle(Point Center,int radius,int w, string Color):base(w,Color)
    {
        this.Center=Center;
        this.radius=radius;
    }

    public override void Draw()
    {
        Console.WriteLine("Drawing Circle:");
        Console.WriteLine(this);
    }

    public override string ToString()
    {
        const float pi=3.14f;
        float area  =pi*radius*radius;
        return base.ToString() + this.Center + ",Radius: "+this.radius+", Area: "+area;
    }

    void IPrinter.Print()
    {
        Console.WriteLine("Printing Circle");
        Console.WriteLine(this);
    }



}