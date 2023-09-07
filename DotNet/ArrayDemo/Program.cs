using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Single Dimension Array
            int[] salary = new int[5];//first way of aarey declaration
            int[] salary2 = new int[5] { 23, 43, 54, 67, 89 };//second way
            int[] salary3 = new int[] { 21, 32, 42, 52, 11 };//third way
            int[] salary4 =  { 12,21,32,42,12 };
            salary[0] = 100;
            salary[1] = 102;
            salary[2] = 103;
            salary[3] = 104;
            salary[4] = 105;
            for (int i = 0; i < salary.Length; i++)
            {
                Console.WriteLine(salary[i]);
            }
            Console.WriteLine(salary[4]);
            foreach(int i in salary2) 
            {
                Console.WriteLine(i);
            }
            Console.ReadKey();
            */
            string[,] timetable = new string[2, 4]
             {
                { "Monday", "Tuesday", "Wednesday", "Thursday" },
                 { "Physics", "Mathematic", "Biology", "English" },
             };
            Console.WriteLine("timetable");
            Console.WriteLine("**********");
            for (int row = 0; row < timetable.GetLength(0); row++)
            {
                for (int col = 0; col < timetable.GetLength(1); col++)
                {
                    Console.Write(timetable[row, col] + "\t");
                }
                Console.WriteLine();

            }
            Console.ReadKey();
        }

    }
}

