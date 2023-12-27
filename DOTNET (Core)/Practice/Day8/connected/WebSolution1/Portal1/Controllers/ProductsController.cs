using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Portal1.Models;
using System.Collections.Generic;
using BOL;
using BLL;
namespace Portal1.Controllers;

public class ProductsController : Controller
{
    private readonly ILogger<ProductsController> _logger;

    public ProductsController(ILogger<ProductsController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        CatalogManager mgr=new CatalogManager();
        List<ProductsDNET> products=mgr.GetAllProducts();
        ViewData["allProducts"]=products;
        return View();
    }

     
}
