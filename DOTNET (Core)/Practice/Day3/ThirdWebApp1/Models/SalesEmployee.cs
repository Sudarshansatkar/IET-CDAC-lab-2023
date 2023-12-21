namespace sample;

public sealed class SalesEmployee : WageEmployee
{
    public float incentive
    {
        get;
        set;
    }

    public float target
    {
        get;
        set;
    }

    public static int count;
    public SalesEmployee():this(499,"RAM SHARMA",50,8000,150000)
    {
        count++;
    }

    public SalesEmployee(int id, String Fullname, int hours,float incentive,float target):base(id,Fullname,hours)
    {
        this.incentive=incentive;
        this.target=target;
    }

    public override String ToString()
    {
        return base.ToString()+" "+"Incentive= "+this.incentive+" Target= "+this.target;
    }

    public override float ComputePay()
    {
        float totalSal;

        if(target>100000)
        {
            return totalSal=base.ComputePay() +incentive;
        }

        else
        {
            totalSal=base.ComputePay();
            return totalSal;
        }
    }

    ~ SalesEmployee()
    {
     //   count--;
    }

}