using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using ThirdWebApp1.Models;
using sample;
namespace ThirdWebApp1.Controllers;

public class ProductsController : Controller
{
    private readonly ILogger<ProductsController> _logger;

    public ProductsController(ILogger<ProductsController> logger)
    {
        _logger = logger;
    }

    public IActionResult Product()
    {
        Product p1=new Product();
        //p1.Id=1;
        p1.Title="Mango";
        p1.Description="Fruit";
        p1.Quantity=25;
        p1.UnitPrice=50;
        p1.Imageurl="/images/Mango.jpg";

        ViewData["Fruit"]=p1;
        return View();
    }
 
   
}
