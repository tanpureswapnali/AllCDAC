using Microsoft.AspNetCore.Mvc;
using WebApplication1.Models;
using System.Data;
using MySql.Data.MySqlClient;

namespace WebApplication1.Controllers
{
    public class AccountController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        [HttpPost]
        public IActionResult Login(LoginViewModel loginViewModel)

        {
            string myConnectionString = "server=localhost;database=java_ee;uid=root;pwd=Swap@123;";


            MySqlConnection sqlConnection = new MySqlConnection(myConnectionString);///
            MySqlCommand sql = new MySqlCommand("SELECT * FROM LOGIN", sqlConnection);
            sqlConnection.Open();
            MySqlDataReader sqlDataReader = sql.ExecuteReader();

            DataTable dt = new DataTable();
            dt.Load(sqlDataReader);
            foreach (DataRow dr in dt.Rows)
            {
                string Uanme = dr["Email"].ToString();
                string Password = dr["Password"].ToString();
            }
            if (loginViewModel.Email == "Test" & loginViewModel.Password == "Demo@123")
            {
                return Redirect("/Account/Dashboard");
            }
            else
            {
                return Redirect("/Account/Dashboard");
            }
        }
        public IActionResult ChangePassword()
        {
            return View();
        }
        [HttpPost]
        public IActionResult ChangePassword(ChangePasswordViewModel vw)
        {

            if (vw.NewPassword != vw.RetypePassword)
            {
                ViewData["MSG"] = "New Password Not match";
                return View(vw);
            }
            else
            {
                ViewData["MSG"] = "Password Changed";
                ModelState.Clear();
                return View(null);

            }
        }
        [HttpPost]
        public IActionResult SignUp(SignUpViewModel signUpViewModel)
        {
            
            string myConnectionString = "server=localhost;database=java_ee;uid=root;pwd=;";
            string sqlquery = "INSERT INTO users(Email, Password, MobileNo, Name, UserType) VALUES (@Email, @Password, @MobileNo, @Name, @UserType)";
            MySqlConnection sqlConnection = new MySqlConnection(myConnectionString);///
            MySqlCommand command = new MySqlCommand(sqlquery, sqlConnection);
            sqlConnection.Open();
            command.CommandType = CommandType.Text;
            command.Parameters.Add("@Email", MySqlDbType.VarChar).Value = signUpViewModel.Email;
            command.Parameters.Add("@Password", MySqlDbType.VarChar).Value = signUpViewModel.Password;
            command.Parameters.Add("@MobileNo", MySqlDbType.VarChar).Value = signUpViewModel.MobileNo;
            command.Parameters.Add("@Name", MySqlDbType.VarChar).Value = signUpViewModel.Name;
            command.Parameters.Add("@UserType", MySqlDbType.VarChar).Value = "STUDENT";
            int result = command.ExecuteNonQuery();
            if (result > 0)
            {
                ViewData["MSG"] = "Account Created";
                ModelState.Clear();
                return View(null);
            }
            else
            {
                ViewData["MSG"] = "Network error";
                return View(signUpViewModel);
            }
        }
        

        public IActionResult Changepassword()
        {
            return View();
        }
    }
}
