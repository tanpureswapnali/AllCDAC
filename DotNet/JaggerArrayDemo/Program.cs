using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JaggerArrayDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[][] jarray = new int[2][];
            jarray[0]= new int[5] { 1,2,3,4,5};
            jarray[1] = new int[2] { 1, 3 };

            Console.WriteLine(jarray[0][0]);
            Console.WriteLine(jarray[0][1]);
            Console.WriteLine(jarray[0][2]);
            Console.WriteLine(jarray[0][3]);
            Console.WriteLine(jarray[1][0]);
            Console.WriteLine(jarray[1][1]);
            
            Console.ReadKey();
        }
    }
}
