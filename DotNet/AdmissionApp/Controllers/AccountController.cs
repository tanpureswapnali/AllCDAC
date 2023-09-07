using AdmissionApp.Models;
using Microsoft.AspNetCore.Authentication.Cookies;
using Microsoft.AspNetCore.Authentication;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using System.Data;
using System.Security.Claims;

namespace AdmissionApp.Controllers
{
    public class AccountController : Controller
    {

        public IActionResult SignUp()
        {
            return View();
        }
        public IActionResult Login()
        {
            return View();
        }
        public IActionResult AccessDenied()
        {
            return View();
        }

        public IActionResult Profile()
        {
            return View();

        }
        public IActionResult ChangePassword()
        {
            return View();
        }
        
        
        
    }
}
