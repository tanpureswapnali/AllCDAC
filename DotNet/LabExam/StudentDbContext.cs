using Microsoft.EntityFrameworkCore;

namespace LabExam
{
    public class StudentDbContext : DbContext
    {
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            string con = "server=localhost;database=root;uid=root;pwd=Swap@123;";
            optionsBuilder.UseMySQL(con);
        }
        public DbSet<Student> Student { get; set; }
    }
}
