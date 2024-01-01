using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using BOL;
using DAL;
using BLL;

namespace HRPortal.Controllers;

public class EmployeesController : Controller
{
    private readonly ILogger<EmployeesController> _logger;

    public EmployeesController(ILogger<EmployeesController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        EmployeeManager emgr=new EmployeeManager();
        List<Employee> employees=new List<Employee>();
        employees=emgr.GetAllEMP();
        ViewData["employees"]=employees;
        return View();

    }
    static string msg=null;
    public IActionResult InsertEMP(int id, string username)
    {
            List<Employee> employees=new List<Employee>();
            Employee e=new Employee();
            e.Id=id;
            e.username=username;
            
           if(id!=0 && username!="")
          {
            EmployeeManager emgr=new EmployeeManager();
            bool x=emgr.Insert(e);
            Console.WriteLine(x);
            msg="Employee added successfully";
           }
            else
            {
               msg="Please enter Employee details";  
            }
            ViewData["Imsg"]=msg;
            return View();
    }

     public IActionResult EditEMP(int id, string name){
            //List<Employee> employees=new List<Employee>();
            Employee e=new Employee();
            e.Id=id;
            e.username=name;
            
            if(id!=0 && name!="")
            {
            bool x=HRDBManager.Update(e);
            Console.WriteLine(x);
            }
            

            return View();
    }

     public IActionResult DeleteEMP(int id){
            //List<Employee> employees=new List<Employee>();
            Employee e=new Employee();
            e.Id=id;
         
            
            if(id!=0)
            {
            bool x=HRDBManager.Delete(e);
            Console.WriteLine(x);
            }
            

            return View();
    }
    public IActionResult List(){
      
       List<Employee> employees=HRDBManager.GetAllEMP();
       //Attach model object using View inbuilt method
       return View(employees);

    }
    public IActionResult Insert(){
    
        return View();
     }

    public IActionResult Details(int id){

         List<Employee> employees=HRDBManager.GetAllEMP();
         var e= employees.Find((emp)=>emp.Id==id);    
        return View(e);
    }

[HttpGet]

    public IActionResult Login()
    {
        return View();
    }
static string log=null;
[HttpPost]

    public IActionResult Login(string username, string password)
    {
        Employee e=new Employee();
        e.username=username;
        e.Password=password;
        EmployeeManager emgr=new EmployeeManager();
        bool y=emgr.ValidateEmp(e);

        if(y==true)
        {
            return this.RedirectToAction("List");
        }
        else
        {
            log="Incorrect username or password";
        }

        ViewData["log"]=log;

        // Console.WriteLine(username+" "+password);
        // if(username=="SKS" && password=="VIK")
        // {
        //     return this.RedirectToAction("List");
        // }
      

        return View();
    }


    // public IActionResult Edit(int id){
    //      List<Employee> employees=HRDBManager.GetAllEMP();
    //      var e= employees.Find((emp)=>emp.Id==id);    
    //     return View(e);
    //     Console.WriteLine(e);
    //  }



    [HttpPost]
    public IActionResult Edit(Employee emp){   
        Console.WriteLine(emp.Id+ " " + emp.username);
        if (emp != null && ModelState.IsValid) { 
            return RedirectToAction("List");
        } 
        else      
        return View();
    }
//Partial View
    public IActionResult Dashboard(){
        return View();
    }
}
