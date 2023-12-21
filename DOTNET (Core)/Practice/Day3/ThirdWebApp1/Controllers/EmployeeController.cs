using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using ThirdWebApp1.Models;
using sample;
namespace ThirdWebApp1.Controllers;

public class EmployeeController : Controller
{
    private readonly ILogger<EmployeeController> _logger;

    public EmployeeController(ILogger<EmployeeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Emp()
    {
        
        Employee e1=new Employee();

        ViewData["Emp"]=e1;


    return View();

    }
     public IActionResult Wemp()
    {
    
    WageEmployee w1=new WageEmployee();
    
    ViewData["Wemp"]=w1;
    
    return View();

    }
     public IActionResult Semp()
    {
        SalesEmployee s1=new SalesEmployee();

    ViewData["Semp"]=s1;
    

    return View();

    }
 
   
}
