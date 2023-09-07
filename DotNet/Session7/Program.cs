using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace Session7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string name = null;
            name ??= "swap";//not supported
            string dispalyname = name ?? "DAC";
            Console.WriteLine(dispalyname); //if value is null ony dispaly DAC otjerwise display name value
            //int? add=null;//nullable demo
            //if(add.HasValue) {
            //    int value = add.Value;
            //    Console.WriteLine(value);
            //}
            //else 
            //{ 
            //    Console.WriteLine("null");
            //}
            //string? add=null;
            //if (add.HasValue)
            //{
            //       int value = add.Value;
            //       Console.WriteLine(value);
            //}
            //else 
            // { 
            //        Console.WriteLine("null");
            // }
            //    Console.ReadLine();
            /*
            int add = 0;
            int multi = 0;
            int div= 0;
            int sub= 0;
            //Sum(1, 2,ref add,ref multi,ref div,ref sub);
            Sum1(4, 2, out add, out multi, out div, out sub);
            Console.WriteLine(add);
            Console.WriteLine(multi);
            Console.WriteLine(div);
            Console.WriteLine(sub);
            */
            Console.ReadKey();
            
        }
       /*
        public static void Sum(int x, int y, ref int add,ref int multi,ref int div,ref int sub )
        {
            add = x + y;
            multi = x * y;
            div = x / y;
            sub = x - y;
        }
        public static void Sum1(int x, int y, out int add, out int multi, out int div, out int sub)
        {
            add = x + y;
            multi = x * y;
            div = x / y;
            sub = x - y;
        }*/
    }
}
