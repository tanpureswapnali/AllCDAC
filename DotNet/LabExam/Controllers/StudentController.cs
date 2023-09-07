using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using System.Data;

namespace LabExam.Controllers
{
    

        
        public class StudentController : Controller
        {
            [Route("StudentList")]
            public IActionResult Index()
            {
                StudentDbContext ob = new StudentDbContext();
                var Studentlist = ob.Student.ToList();
                return View(Studentlist);
            }
        }
    
}
