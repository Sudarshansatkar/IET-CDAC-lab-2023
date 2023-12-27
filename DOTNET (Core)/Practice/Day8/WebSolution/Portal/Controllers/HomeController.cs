using System.Diagnostics;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Portal.Models;

namespace Portal.Controllers;

public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        Person per1 = new Person{Id=7, FirstName ="Mahendra Singh", LastName = "Dhoni"};
        Person per2 = new Person{Id=8, FirstName ="Ravindra", LastName = "Jadeja"};

        List<Person> plist = new  List <Person> ();
        plist.Add(per1);
        plist.Add(per2);
        this.ViewData ["Person1"] = plist;
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
}
