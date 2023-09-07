using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ThradDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ParameterizedThreadStart parathread = new ParameterizedThreadStart(PrintMe);
            ThreadStart thread = new ThreadStart(Test1);
            ThreadStart thread1= new ThreadStart(thread);
            Thread thread2 = new Thread(parathread);
            Thread thread3=new Thread(PrintMe);


            //Thread thread1 = new Thread(PrintMe);
            //thread1.Start();
            thread2.Start("hI");
            thread3.Start("ROCk");
            Console.ReadKey();
        }
        public static void PrintMe(object obj)
        {
            string name=(string)obj;
            Console.WriteLine(name);
        }
        public static void Test1()
        {
            for (int i = 0; i < 10; i++)
            {
                if (i == 3)
                    Thread.Sleep(2000);
                Console.WriteLine("Tese 1 Threading---"+i);
            }

        }
        public static void Test2()
        {
            for (int i = 0; i < 10; i++)
            {
                 Console.WriteLine("Tese 2 Threading---" + i);
            }

        }
        public static void Test3()
        {
            for (int i = 0; i < 10; i++)
            {
                
               Console.WriteLine("Tese 3 Threading---" + i);
            }

        }
    }
}
