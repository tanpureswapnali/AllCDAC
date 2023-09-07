using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace LINQDEMO
{  //immediate query
    public class Product
    {
        public string Category { get; set; }
        public decimal Price { get; set; }
        public bool IsAvailable { get; set; }
    }

    internal class Program
    {
        public static IEnumerable<Product> GetProducts(string cat, decimal min, decimal max, bool isAvail, List<Product> products)
        {
            var temp = products.AsQueryable();
            if (!string.IsNullOrEmpty(cat))

                temp = temp.Where(x => x.Category == cat);
            if (isAvail)
                temp = temp.Where(x => x.IsAvailable == isAvail);
            temp = temp.Where(x => x.Price == min && x.Price < max);
            return temp.ToList();
        }
        //immidate execution
        public static int GetCatagoryCount(string cat, List<Product> products)
        {
            return products.Where(x => x.Category == cat).Count();

        }


        static void Main(string[] args)
        {
            var products = new List<Product>()
            {
                new Product(){ Category="Books",IsAvailable=true,Price=100 },
                new Product(){ Category="Cloth",IsAvailable=false,Price=200 },
                new Product(){ Category="Books",IsAvailable=true,Price=3000 },
                new Product(){ Category="Books",IsAvailable=false,Price=4000 },
                new Product(){ Category="Cloth",IsAvailable=true,Price=5000 }
            };
            var tempproduct = GetProducts("Books", 200, 30000, true, products);
            foreach (var product in tempproduct)
            {
                Console.WriteLine(product.Price);
                Console.WriteLine(product.Category);
            }
            Console.WriteLine(GetCatagoryCount("Cloth", products));
            Console.ReadKey();

        }
    }
}