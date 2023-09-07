using Session5;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Session5
{
    public  class BaseClass
    {
        public virtual  void PrintMessage()
        {
            Console.WriteLine("This is base class");
        }

    }
}public class DerivedClass : BaseClass
{
    public void PrintMessage()
    {
        Console.WriteLine("This is child class");
    }
}
public class FurtherDerivedClass : DerivedClass
{
    public new void PrintMessage()
    {
        Console.WriteLine("This is Sub Child class");
    }
}
