using Microsoft.EntityFrameworkCore;
using System.Collections.Generic;
using WebApplication1.Models;

namespace WebApplication1
{
    public class ProDBContext : DbContext
    {
         protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
            {
                string con = "server=localhost;database=java_ee;uid=root;pwd=Swap@123;";
                optionsBuilder.UseMySql(con, ServerVersion.AutoDetect(con));
            }
           public DbSet<UserDBModel> users { get; set; }//what table you are going to use

    }

}

