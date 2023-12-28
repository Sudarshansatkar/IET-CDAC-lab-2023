using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using HRPortal.Models;
using DAL;

namespace HRPortal.Controllers;

public class EmployeesController : Controller
{
    private readonly ILogger<EmployeesController> _logger;

    public EmployeesController(ILogger<EmployeesController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index(){
       List<Employee> employees=HRDBManager.GetAllEMP();
        ViewData["employees"]=employees;
       return View();

    }

    public IActionResult InsertEMP(int id, string name){
            //List<Employee> employees=new List<Employee>();
            Employee e=new Employee();
            e.Id=id;
            e.Name=name;
            
            if(id!=0 && name!="")
            {
            bool x=HRDBManager.Insert(e);
            Console.WriteLine(x);
            }
            

            return View();
    }

     public IActionResult EditEMP(int id, string name){
            //List<Employee> employees=new List<Employee>();
            Employee e=new Employee();
            e.Id=id;
            e.Name=name;
            
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

[HttpPost]

    public IActionResult Login(string username, string password)
    {
        Console.WriteLine(username+" "+password);
        if(username=="SKS" && password=="VIK")
        {
            return this.RedirectToAction("List");
        }
      

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
        Console.WriteLine(emp.Id+ " " + emp.Name);
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
