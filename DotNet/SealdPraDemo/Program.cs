using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static SealdPraDemo.Employee;

namespace SealdPraDemo
{
    public class Employee
    {
        protected int empId;
        protected string Name;

        public virtual void GetEmp()
        {
            Console.WriteLine("Enter emp details");
            Console.WriteLine("Enter emp id");
            empId = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the Name of emp");
            Name = Console.ReadLine();

        }
        public virtual void disp()
        {
            Console.WriteLine("Emp details");
            Console.WriteLine($"Emp id:  {empId}");
            Console.WriteLine($"emp name:  {Name}");
        }
        public sealed class Manager : Employee 
        {
            double salary;
            public override void GetEmp()
            {
                Console.WriteLine("Enter emp Details ");
                Console.WriteLine("Enter emp id");
                empId = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter the Name of emp");
                Name = Console.ReadLine();
                Console.WriteLine("Enter salary");
                salary= Convert.ToDouble(Console.ReadLine());   

            }
            public override void disp() 
            {
                Console.WriteLine("Emp details");
                Console.WriteLine($"Emp id:  {empId}");
                Console.WriteLine($"emp name:  {Name}");
                Console.WriteLine($"emp salary: {salary}");
            }
        }
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            Manager man =new Manager();
            
            man.GetEmp();
            man.disp();
            Console.ReadKey();
        }
    }
}
