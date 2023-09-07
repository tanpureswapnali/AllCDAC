using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Session3
{
    internal class NameParameterDemo
    {
        public static void TestMethod(int x, int y, bool z)
        {
            Console.WriteLine("The value of x: "+x);
            Console.WriteLine("The value of y : " + y);
            Console.WriteLine("The value of z:  " + z);
        }
    }
}
