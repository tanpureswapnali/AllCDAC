using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TupleClassDemo1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Tuple<int, string, string> person = Tuple.Create(33, "swap", "shirdi");
           Console.WriteLine(person.Item1);
            Console.WriteLine(person.Item2);    
            Console.WriteLine(person.Item3);    
            Console.ReadKey();
        }
    }
}
