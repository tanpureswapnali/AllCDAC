using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VarDyamicDemo//demo of boxing n unboxing
{
    public class Calculator
    {
        public void Add<T>(T x, T y)
        {
            dynamic obj1 = x;
            dynamic obj2 = y;
            Console.WriteLine(obj1 +  obj2);   
        }
        public void Sub<T>(T x, T y)
        {
            dynamic obj1 = x;
            dynamic obj2 = y;
            Console.WriteLine(obj1 - obj2);
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Calculator obj=new Calculator();
            Console.WriteLine(obj.CompareToData(10, 20));
        
               }
    }
}
