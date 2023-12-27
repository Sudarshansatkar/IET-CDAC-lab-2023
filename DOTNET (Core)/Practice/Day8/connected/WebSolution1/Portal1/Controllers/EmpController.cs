using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Portal.Models;
using System.Collections.Generic;
using BOL;
using BLL;

namespace Portal1.Controllers;

public class EmpController : Controller
{
    private readonly ILogger<EmpController> _logger;

    public EmpController(ILogger<EmpController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        EmpManager emgr=new EmpManager();
        List<EmpDNET> Ename=new List<EmpDNET>();
        Ename=emgr.GetAllEMP();


        this.ViewData["Emp1"]=Ename;

        return View();
    }
}

