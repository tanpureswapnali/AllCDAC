using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace DirectoryDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string folderpath= @":D:\Example\1020";
            Directory.CreateDirectory(folderpath);
            Console.WriteLine(folderpath);

            string[] files= Directory.GetFiles(folderpath); 
            foreach (string file in files)
            {
                Console.WriteLine(file);    
            }
            Directory.Exists(folderpath);
            DirectoryInfo directoryInfo = new DirectoryInfo(folderpath);
            if(directoryInfo.Exists)
            {
                FileInfo[] fileInfos = directoryInfo.GetFiles();
                foreach (FileInfo fileInfo in fileInfos) { 
                   Console.WriteLine($"{fileInfo.Name}:{fileInfo.CreationTime} : {fileInfo.Extension}");
                }
            }
            Console.ReadKey();

        }

    }
}
