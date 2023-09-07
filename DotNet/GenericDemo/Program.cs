using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GenericDemo
{
    public class Student
    {
        public string Name { get; set; }    
        public string Age { get; set; }
        public string RollNo { get; set;}
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Student> studentlist = new List<Student>();
            studentlist.Add(new Student { Name = "Ram", Age = "34", RollNo = "456" });
            studentlist.Add(new Student { Name = "Ramesh", Age = "44", RollNo = "46" });
            studentlist.Add(new Student { Name = "Rama", Age = "65", RollNo = "56" });
            studentlist.Add(new Student { Name = "Raj", Age = "32", RollNo = "446" });
           foreach(Student item in studentlist) 
            {
                Console.WriteLine($"{item.Name}:{item.Age}:{item.RollNo}");
                
            }
            Console.ReadKey();


            /*
            List<string> list = new List<string>();
            list.Add("Swapnali");
            list.Add("SWap");
            list.Add("Ram");
            list.Add("ritu");
            foreach (string item in list)
            {
                Console.WriteLine(item); 
            }
            Dictionary<int, string> obj = new Dictionary<int, string>();
            obj.Add(1, "swap");
            obj.Add(2, "swapna");
            obj.Add(3, "swa");
            obj.Add(4, "swapnali");
            foreach(KeyValuePair<int, string> kvp in obj) { }
            */
            Console.ReadKey();
        }
    }
}
