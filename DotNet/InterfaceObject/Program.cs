using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterfaceObject
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IProduct product = new Electronics
            {
                Brand = "SAMSUNG",
                Name = "AC",
                Description = "MODEL456",
                Price = "200"
            };
            product.DisplayProductInfo();
            Console.ReadKey();
        }
        public interface IProduct
        {
            string Name { get; set; }
            string Price { get; set; }
            string Description { get; set; }
            void DisplayProductInfo();
        }
        public class Electronics : IProduct
        {
            public string Brand { get; set; }
            public string Name { get; set; }
            public string Price { get; set; }
            public string Description { get; set; } 
            public void DisplayProductInfo()
            {
                    Console.WriteLine($"Product Name {Name}");
                    Console.WriteLine($"Product Price {Price}");
                    Console.WriteLine($"Product Description {Description}");
                    Console.WriteLine($"Product Brand {Brand}");
            }

        }
        public class Cloth : IProduct
        {
            public string Size { get; set; }
            public string Name { get; set; }
            public string Price { get; set; }
            public string Description { get; set; }

            public void DisplayProductInfo()
            {
                Console.WriteLine($" Product Name {Name}");
                Console.WriteLine($" Product Price {Price}");
                Console.WriteLine($" Product Description {Description}");
                Console.WriteLine($" Product Size {Size}");
            }
        }
        public class Books : IProduct
        {
            public string Author { get; set; }
            public string Name { get; set; }
            public string Price { get; set; }
            public string Description { get; set; }

            public void DisplayProductInfo()
            {
                Console.WriteLine($" Product Name {Name}");
                Console.WriteLine($" Product Price {Price}");
                Console.WriteLine($" Product Description {Description}");
                Console.WriteLine($" Product Author {Author}");
            }
        }


    }
}
