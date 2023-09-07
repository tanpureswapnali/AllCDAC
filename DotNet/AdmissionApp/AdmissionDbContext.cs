using Microsoft.EntityFrameworkCore;

namespace AdmissionApp
{
    public class AdmissionDbContext : DbContext
    {
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            string con = "server=localhost;database=swap;uid=root;pwd=Swap@123;";
            optionsBuilder.UseMySQL(con);
        }
        public DbSet<Users> Users { get; set; }
    }
}
