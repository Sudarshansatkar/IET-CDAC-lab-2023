using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using HRPortal.Models;

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

    [HttpPost]
      public IActionResult Register(string CompanyName, string ContactName)
    {
         Console.WriteLine(CompanyName + "#"+ ContactName);
        return View();
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

    public IActionResult Welcome()
    {
        return View();
    }
}
