using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RBILoanApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            HomeLoan home = new HomeLoan("200", "783", "iop90", "test", "37");
            HomeLoan home1 = new HomeLoan("200", "783");

            home1.PrintRBIMessage("This is Home Loan");
            home1.PrintLoanDeatails();
            Console.ReadKey();
        }
    }
}    
