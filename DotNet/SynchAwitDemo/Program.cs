using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SynchAwitDemo
{
    internal class Program
    {
        static  void Main(string[] args)
        {
             CallingDB();
             APICall();
             FileCall();
            Console.ReadKey();
        }
        public static async Task CallingDB()
        {
            await Task.Run(() => { Console.WriteLine("I am DB");
            });
        }
        public static async Task APICall()
        {
            await Task.Run(() => {
                Console.WriteLine("I am API CALL");
            });
        }
        public static async Task FileCall()
        {
            await Task.Run(() => {
                Console.WriteLine("I am filecall ");
            });
        }
    }

}
