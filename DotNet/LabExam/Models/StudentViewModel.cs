using Microsoft.AspNetCore.Mvc;


namespace LabExam.Models
{
   
    public class StudentViewModel
    {
        public int Id { get; set; }
        public string? Name { get; set; }
        public string? MobileNo { get; set; }
        public string? Email { get; set; }
    }
}
