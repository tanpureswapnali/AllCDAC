using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SchoolDemo
{
    public abstract class School
    {
        public string ID;
        public DateTime InsertDate;
        public DateTime UpdateDate;
        public string IUserId;
        public string UUserId;
        public string IPAddress;
    }
    public School(string ID, DateTime InsertDate, DateTime UpdateDate, string IUserId, string UUserId, string IPAddress)
    { 
    }
    public void PrintStudInfo()
    {
        Console.WriteLine("This is ");
    }
}
