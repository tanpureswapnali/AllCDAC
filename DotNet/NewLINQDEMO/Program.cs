using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Linq;
using System.Net.Cache;
using System.Text;
using System.Threading.Tasks;

namespace NewLINQDEMO
{
    public class Employee
    { 
        public string Name { get; set; }
        public int Age
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            var emps = new List<Employee>()
            { 
                new Employee(){name="Ram",Age="30",Salary=1340},
                new Employee(){name="Ram",Age="30",Salary=1340},
                new Employee(){name="Ram",Age="30",Salary=1340},
                new Employee(){name="Ram",Age="30",Salary=1340}
            };
            var filtersalary = from tempsal in emps
                               where tempsal.Salary >3000
                               select tempsal;
            var filtersalaryci = from tempsal in emps
                                 where tempsal.salary > 3000
                                 select new
                                 {
                                     FullDetails = "" + tempsal.Salary + ":" + tempsal.Age + ":" + tempsal.Name,
                                     FullName = tempsal.Name,
                                     FullAge = tempsal.Age,

                                 };
        }
    }
}
