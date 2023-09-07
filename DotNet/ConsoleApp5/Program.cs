using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string path = @"D:\DOTNETPRACTICAL\DAY1\ClassLibrary1\bin\Debug\ClassLibrary1.dll";
            try
            {
                Assembly obj = Assembly.LoadFile(path);
                Console.WriteLine(obj.GetName().Name);
                Console.WriteLine(obj.GetName().Version);
                Console.WriteLine(obj.GetName().FullName);
                Console.WriteLine(obj.GetName().ContentType);
                Console.WriteLine(obj.GetName().CodeBase);
                Console.WriteLine(obj.GetName().CultureName);
                Console.WriteLine(obj.GetName().KeyPair);
                Console.WriteLine(obj.GetName().Flags);
                Console.WriteLine(obj.GetName().HashAlgorithm);
                Console.WriteLine(obj.GetName().KeyPair);
                Console.WriteLine(obj.GetName().ProcessorArchitecture);
                Console.WriteLine(obj.GetName().VersionCompatibility);
                Console.WriteLine(obj.GetName().CultureInfo);
                foreach (Type type in obj.GetTypes())
                {
                    Console.WriteLine(type.FullName);   
                }
                //Type type = obj.GetType();

            }catch(Exception ex) { }    
            Console.ReadKey();  
        }
    }
}
