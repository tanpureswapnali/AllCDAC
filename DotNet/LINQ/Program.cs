using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] salary = { 500,100,478,231, 200, 300, 5000 };
            int count = 0;
            foreach(int i in salary) 
            {
                if(i>3000)
                    count++;
            }
            Array.Sort(salary);
            foreach (int i in salary)
            {
                if (i > 3000)
                    count++;
            }
            Console.WriteLine(count);
            Console.ReadKey();
        }
    }
}
