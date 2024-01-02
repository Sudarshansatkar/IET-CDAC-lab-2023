using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using HRPortal.Models;
using BOL;
using BLL;

namespace HRPortal.Controllers;

public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        return View();
    }

    public IActionResult Privacy()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
[HttpGet]
      public IActionResult Register()
    {
        
        return View();
    }
        static string msg=null;
    [HttpPost]
      public IActionResult Register(string username, string Password)
    {
        Employee e=new Employee();
        e.username=username;
        e.Password=Password;
        EmployeeManager emgr=new EmployeeManager();
        if( username!="" && Password!="")
        {
            bool y=emgr.RegisterEMP(e);
            msg="Registered Sucessfully !!! - Login with details";
        }
        
        ViewData["Imsg"]=msg;

        return View();
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

    public IActionResult Welcome()
    {
        return View();
    }
}
