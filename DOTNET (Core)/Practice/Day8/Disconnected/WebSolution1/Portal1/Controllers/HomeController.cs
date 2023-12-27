using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Portal.Models;
using System.Collections.Generic;

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
        Person pr1=new Person{Id=1, FirstName="SKS", LastName="SSS"};
        Person pr2=new Person{Id=2, FirstName="CRB", LastName="RRR"};
        List<Person> Name=new List<Person>();
        Name.Add(pr1);
        Name.Add(pr2);

        this.ViewData["Person1"]=Name;

        return View();
    }

    public IActionResult Privacy()
    {
        return View();
    }

  
}
