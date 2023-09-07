using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.NetworkInformation;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTypeDemo
{
    internal class Program
    {
        static bool IsGreaterThenZero(int x)
        {
            if (x <= 0) return false;
            else
                return true;
        }
        static void Main(string[] args)
        {
            Predicate<int> Isvalid = IsGreaterThenZero;
            bool result = Isvalid(10);
            Console.WriteLine(result);


            Action<string> printName = (message) => Console.WriteLine(message);
            Action<int, int> printAdd = (a, b) => Console.WriteLine(a + b);
            printName.Invoke("Swap");
            printAdd.Invoke(2, 3);
            Func<int, int, int> PrintAddReturn = (a, b) => (a + b);
            Console.WriteLine(PrintAddReturn.Invoke(1, 2));
            Console.ReadKey();



        }
    }
}
