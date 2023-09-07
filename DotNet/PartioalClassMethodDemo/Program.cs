using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PartioalClassMethodDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Finance finance = new Finance(23, "swap");
            finance.ShowInfo();
            Console.ReadKey();
        
        }
    }
    public partial class Finance
    {
        public decimal Income { get; set; } 
        public string CmpName { get; set; }
    }
    public partial class Finance
    {
        public Finance(decimal income, string cmpName)
        {
            this.Income= income;
            this.CmpName= cmpName;
        }
        public void ShowInfo()
        {
            Console.WriteLine(Income + " " + CmpName);
        }
         partial void PrintTestData();
    }
}
