using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using ProductApp.Models;
using BLL;

namespace ProductApp.Controllers;

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

    public IActionResult Login()
    {
        return View();
    }

    [HttpPost]
    public IActionResult Login(string username,string pass)
    {
        ProductFun pf = new ProductFun();
        bool status=pf.UserVerify(username,pass);
        if(status==true){
          return this.RedirectToAction("Index","Product");
        }
        return View();
    }

    public IActionResult Signup()
    {
        return View();
    }

    [HttpPost]
    public IActionResult Signup(string email,string username,string pass)
    {
        ProductFun pf = new ProductFun();
        pf.signup(email,username,pass);
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
