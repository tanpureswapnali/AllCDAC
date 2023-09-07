using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace BankThread
{
    internal class Program
    {
        static void Main(string[] args)
        {

        }
    }
    public class BankAccount
    {
        private double balance = 0;
        private object lockobject = new object();
        public double Balance { get { return balance; } }

        public void Deposite(double amount)
        {
            lock (lockobject) 
            {
                balance += amount;
            }
        }
        public void WithDraw(double amount) 
        {
            Monitor.Enter(lockobject);
            try 
            {
                if (balance >= amount)
                {
                    balance -= amount;
                }
                else 
                {
                    throw new Exception("Invalid fund");
                }
            }
             catch(Exception ex) { }
            finally { Monitor.Exit(lockobject); }   

        }
        public void Transfer(double amount,BankAccount totransfer) 
        {
            double currentbalance = Interlocked.Exchange(ref amount, balance - amount);
            if (currentbalance >= balance)
            {
                totransfer.Deposite(amount);

            }
            else
            {
                Interlocked.Exchange(ref balance, currentbalance);
                throw new Exception("Invalid Fund");
            }

        }
    }
}
