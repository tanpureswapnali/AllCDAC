using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }
        [HttpGet]
       
    public IActionResult MyName()
        {
            return View();
        }
        
        public  string GetMyName(string name) 
        { 
            return $"{name}";
        }
        public IActionResult JsonResultData()
        {
            var data = new { name = "swap", Age = 20 };
            return Json(data);
        }
        public IActionResult FileResultDemo()
        {
            var path = "demo.png";
            return File(path, "image/jpg");
            
        }
        public IActionResult ContentResultDemo()
        {
            var conte = "hello World";
            return Content(conte, "text/plain"); ;
        }
        public IActionResult Index()
        {
            return Redirect("/Home/MyName");
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
}