using Microsoft.AspNetCore.Mvc;
using MySql.Data.MySqlClient;
using System.Data;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    public class AdminController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        public IActionResult SignUp()
        { 
            ProDBContext proDBContext = new ProDBContext();
            List<UserDBModel> signUpViewModels = new List<UserDBModel>();
            var userlist = proDBContext.users.ToList();
            return View(userlist);
            
            /*
                        List<SignUpViewModel> signUpViewModels = new List<SignUpViewModel>();
                        string myConnectionString = "server=localhost;database=java_ee;uid=root;pwd=Swap@123;";
                        MySqlConnection sqlConnection = new MySqlConnection(myConnectionString);///
                        MySqlCommand sql = new MySqlCommand("SELECT * FROM users", sqlConnection);
                        sqlConnection.Open();
                        MySqlDataReader sqlDataReader = sql.ExecuteReader();

                        DataTable dt = new DataTable();
                        dt.Load(sqlDataReader);
                        foreach (DataRow dr in dt.Rows)
                        {
                            //, Password, MobileNo, Name, UserType
                            signUpViewModels.Add(new SignUpViewModel
                            {
                                Name = dr["Name"].ToString(),
                                Email = dr["Email"].ToString(),
                                MobileNo = dr["MobileNo"].ToString(),
                                Password = dr["Password"].ToString(),
                                UserType = dr["UserType"].ToString()

                            });
                        }
                        return View(signUpViewModels);
            */
           





        }
    }
} 

