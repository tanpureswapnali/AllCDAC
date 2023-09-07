using System;
using System.Collections;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CollectionDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
           /* ArrayList arrayList = new ArrayList();
            Console.WriteLine(arrayList.Capacity);
                arrayList.Add(23);
                arrayList.Add(34);
            arrayList.Add(32);
            arrayList.Add("swap");
            
            arrayList.Insert(3, 76);

            Console.WriteLine(arrayList);
            foreach(object i in  arrayList)
            {
                Console.WriteLine(i);   
            }*/
           Hashtable ht = new Hashtable();
            ht.Add("name", "Ram");
            ht.Add("Age", "34");
            ht.Add("City", "pune");
            foreach (object key in ht.Keys)
            { Console.WriteLine($"{key} \t {ht[key]}"); }
            Console.ReadKey();
        }
    }
}
