﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InheritanceDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Student student = new Student();


            student.Course = "BTECH";
            student.PrintData();
        }

    }
}
