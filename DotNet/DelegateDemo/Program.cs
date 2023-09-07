using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateDemo
{  
    public delegate void DelTest(int x , int y);
    public delegate void Display();
    internal class Program
    {
        static void Main(string[] args)
        {
            Calculator calculator = new Calculator();
           // Display display = new Display(calculator.show);
            //display.Invoke();
            DelTest de =new DelTest(calculator.Add);



            de += calculator.Sub;
            de += calculator.mul;
            de += calculator.div;
            de(2, 3);
           // de = calculator.Sub;
           // de(3,4);
            //de.Invoke(2, 3);
            Console.ReadKey();
        
        
        }
    }
    public class Calculator
    {
        public void show()
        {
            Console.WriteLine("Hello");
        }
        public void  Add(int a,int b) 
        {
            Console.WriteLine("The sum is " + (a + b));

        }
        public void Sub(int a, int b)
        {
            Console.WriteLine("The sub is " + (a + b));

        }
        public void div(int a, int b)
        {
            Console.WriteLine("The div is " + (a + b));

        }
        public void mul(int a, int b)
        {
            Console.WriteLine("The mul is " + (a + b));

        }
    }
}
