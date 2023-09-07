using System.ComponentModel.DataAnnotations;

namespace LabExam
{
    public class Student
    {
        [Key]
        public int Id { get; set; }
        public string? Name { get; set; }
        public string? MobileNo { get; set; }
        public string? Email { get; set; }

    }
}
