﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //classname classVarname classname()
            Student student = new Student();
            student.TakeInput();
            student.PrintData();

            Console.ReadKey();

        }
    }
}
