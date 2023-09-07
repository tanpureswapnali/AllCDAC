using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterfacePrac
{
    public interface IEmployee
    {      
       int empId { get; set; }
       string name { get; set; }
       string add { get; set; }
        void show();
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            IEmployee Iem = new PartEmployee
            {
                empId = 1,
                name = "swap",
                add="Shirdi",
                shift="morning"

            };
            Iem.show();
           
            IEmployee FullTime = new FullTime
            {
                empId=2,
                name="sai",
                add="ssss",
                shift="3pm"
            };
            FullTime.show();
            Console.ReadKey();
        }
    }
    class PartEmployee : IEmployee 
    {
        public int empId { get; set;}
        public string name { get; set; }
        public string add { get; set; }
        public string shift { get; set; }

        public void show() 
        {
            Console.WriteLine($"EmployeeId {empId}");
            Console.WriteLine($"EmployeeName {name}");
            Console.WriteLine($"Employeeadd {add}");
            Console.WriteLine($"Employeeshift {shift}");
        }
    }

    class FullTime : IEmployee
    {
        public int empId { get; set;}
        public string name { get; set; }
        public string add { get; set; }
        public string shift { get; set; }
        public void show()
        {
            Console.WriteLine($"EmployeeID {empId}");
            Console.WriteLine($"EmployeeName {name}");
            Console.WriteLine($"Employeeadd {add}");
            Console.WriteLine($"EmployeeSift {shift}");
        }
    }

}
