namespace HR;

public class WageEmployee:Employee
{
    public int WorkingHours
    {
        get;
        set;
    }

     public WageEmployee():this(99,"RAGHU MOR",5)
    {
        
    }

     public WageEmployee(int id, String Fullname,int hours):base(id,Fullname)
    {
        this.WorkingHours=hours;
    }

    public override String ToString()
    {
        return base.ToString() + " WorkingHours="+WorkingHours;
    }

   public override float ComputePay()
   {
    return base.ComputePay() + WorkingHours*600;
   }

   

}