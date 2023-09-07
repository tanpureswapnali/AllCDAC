using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ThreadDemoQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for (int i = 0; i < 100; i++)
            {
                
                int task = 1;
                ThreadPool.QueueUserWorkItem(
                    state =>
                    {
                        Console.WriteLine($"Task id {task} is {Thread.CurrentThread.ManagedThreadId}");
                        Thread.Sleep(3000);
                        Console.WriteLine($"Task Id{task} Completed {Thread.CurrentThread.ManagedThreadId}");
                        
                    }
                    );
                Console.WriteLine("Task In QUEUE");
                Console.ReadKey();
            }
        }
    }
}
