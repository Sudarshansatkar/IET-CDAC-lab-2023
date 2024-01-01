namespace BLL;
using BOL;
using DAL;


public class EmployeeManager
{

    public List<Employee> GetAllEMP()
    {
        List<Employee> list=new List<Employee>();
        list=HRDBManager.GetAllEMP();
        return list;
    }


    public bool RegisterEMP(Employee e)
    {
        bool y=HRDBManager.RegisterEMP(e);
        return y;
    }

    public bool ValidateEmp(Employee e)
    {
        bool y=HRDBManager.ValidateEmp(e);
        return y;
    }

        public bool Insert(Employee e)
    {
        bool y=HRDBManager.Insert(e);
        return y;

    }



}