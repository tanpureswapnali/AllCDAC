using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
namespace IOFileDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filepath = @"D:\SWAP.txt";
              File.WriteAllText(filepath, "Hi Everyone");
              bool fileexist=File.Exists(filepath); 
            string filecontent=File.ReadAllText(filepath);  
            Console.WriteLine(filecontent);

            Console.ReadKey();
            File.Delete(filepath);
            Console.ReadKey();

            //string filepath = @"D:\SWAP.txt";
            File.WriteAllText(filepath, "Hi Everyone");
            FileInfo fileInfo = new FileInfo(filepath); 
            
            Console.WriteLine(fileInfo.FullName); ;
            Console.WriteLine(fileInfo.Length); 

        }
    }
}
