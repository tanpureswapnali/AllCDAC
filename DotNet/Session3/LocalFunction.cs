using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Session3
{
    internal class LocalFunction
    {
        public static void CalculateFee()
        { 
            void IdCardFee() 
            {
                Console.WriteLine("ID FEES");
            }
            void AdmFee()
            {
                Console.WriteLine("ADM FEES");
            }
            void TutionFee()
            {
                Console.WriteLine("Tution FEES");
            }
            Console.WriteLine("This is calculatedFee Logic");
            IdCardFee();
            AdmFee();
            TutionFee();
        }
    }
}
