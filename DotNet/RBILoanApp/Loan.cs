using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RBILoanApp
{
    public abstract class Loan
    {
        public string Name;
        public string Age;
        public Loan(string name,string age)
        {
            Name = name;
            Age = age;
        }
        public void PrintRBIMessage()
        {
            Console.WriteLine("This is RBI Loan");
        }
        public abstract void PrintRBIMessage(string message);
        public abstract void PrintLoanDeatails();
    }
    public class HomeLoan : Loan 
    {
        public string Salary;
        public string cibilScore;
        public string PANCard;
        public HomeLoan(string name, string age) : base(name, age)
        { 
        }
        public HomeLoan(string salary, string cibilScore, string PANCard, string name, string age) : base(name, age)
        {
            this.Salary= salary;
            this.cibilScore= cibilScore;    
            this.PANCard= PANCard;
        }
        public override void PrintLoanDeatails()
        {
            Console.WriteLine("Name:-" + Name);
            Console.WriteLine("Age:-" + Age);
            Console.WriteLine("Salary:-" + Salary);
            Console.WriteLine("CibilScore:-" + cibilScore);
            Console.WriteLine("Pan Card:-" + PANCard);
        }
        public override void PrintRBIMessage(string message)
        {
            Console.WriteLine(message);
                }
    }
}
