using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Policy;
using System.Text;
using System.Threading.Tasks;

namespace Demo2
{
    internal class Student
    {
        public String StudentName;
        public String MobileNo;
        public int Age;
        public String Course;
        public double Fees;

        public void TakeInput()
        {
            Console.WriteLine("Enter your name");
            StudentName = Console.ReadLine();
            Console.WriteLine("Enter your age");
            Age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter your MobileNo");
            MobileNo = Console.ReadLine();
            Console.WriteLine("Enter your Course");
            Course = Console.ReadLine();
            Console.WriteLine("Enter your Fees");
            Fees = Convert.ToInt32(Console.ReadLine());

        }
        public void PrintData()
        {
            Console.WriteLine(StudentName);
            Console.WriteLine(Age);
            Console.WriteLine(MobileNo);
            Console.WriteLine(Course);
            Console.WriteLine(Fees);

        }
    }
}
