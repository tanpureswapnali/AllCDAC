using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Cache;
using System.Text;
using System.Threading.Tasks;

namespace TupleDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {//creating tuple
            var person =(name :"swap" ,Age : 34,City : "Shirdi"); 
            Console.WriteLine(person.name);
            Console.WriteLine(person.Age);
            Console.WriteLine(person.City);
            //Console.ReadKey();

            //DeContruct tuple

            var (name,age,city)=person;
            Console.WriteLine(name);
            Console.WriteLine(age);
            Console.WriteLine(city);
            Console.ReadKey();
            var 

            (string,int,double) GetDetails()
            {
                return ("Ram", 65, 67000);
            }
        }
    }
}
