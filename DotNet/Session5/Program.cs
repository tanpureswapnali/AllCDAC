﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Session5
{
    internal class Program
    {
        static void Main(string[] args)
        {
          DerivedClass obj = new DerivedClass(); 
            obj.PrintMessage(); 
            Console.ReadKey();  
        }
    }
}
