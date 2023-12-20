namespace HR;

public class Student
{

    //private int id;
     private String name;

    public int id
    {
        get;
        set;
    }

   public String Name
   {
        get{
             return this.name;
             }
        set{
             this.name=value;
             }
   }


    public Student():this(4,"ERE")
    {

    }

    public Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    
    public override String ToString()
    {
        return this.name+" "+this.id;
    }

}