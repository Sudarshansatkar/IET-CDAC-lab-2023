using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace SecondWebApp.Pages;

public class SRSModel : PageModel
{
    private readonly ILogger<SRSModel> _logger;

    public SRSModel(ILogger<SRSModel> logger)
    {
        _logger = logger;
    }

    public void OnGet()
    {
            //logic
    }
}
