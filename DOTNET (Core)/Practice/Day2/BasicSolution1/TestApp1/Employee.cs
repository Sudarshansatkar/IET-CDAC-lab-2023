namespace HR;

public class Employee
{
    
    public int id
    {
        get;
        set;
    }
    public String Fullname
    {
        get; 
        set;
    }
    public Employee()
    {
        this.id=56;
        this.Fullname="JIVAN";
    }

    public Employee(int id,String Fullname)
    {
        this.id=id;
        this.Fullname=Fullname;
    }

    public override String ToString()
    {
        return this.id+"  "+this.Fullname;
    }

    public virtual float ComputePay()
    {
        return 56000;
    }

}