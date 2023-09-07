using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
namespace FileStreamDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filepath = @"D:\Example\Sample.txt";
            FileStream fileStream = new FileStream(filepath, FileMode.OpenOrCreate, FileAccess.ReadWrite);
            string datatowriter = "Hellow from Filestream";

            byte[] Bytowrite = System.Text.Encoding.UTF8.GetBytes(datatowriter);//string to byte
            fileStream.Write(Bytowrite, 0, Bytowrite.Length);
            //Reset the postion to begining of file
            fileStream.Seek(0, SeekOrigin.Begin);

            byte[] bytestoread = new byte[fileStream.Length];
            fileStream.Read(bytestoread, 0, bytestoread.Length);
            string dateraed = System.Text.Encoding.UTF8.GetString(bytestoread);//byte to string
            Console.WriteLine(dateraed);
            fileStream.Close();
            //Directory.Delete(folderpath,true);
            Console.ReadKey();
        }
    }
}
