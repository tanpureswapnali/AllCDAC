using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentFeesStructure
{
    internal class Program
    {
        static void Main()
        {
            List<Student> students = new List<Student>();

            while (true)
            {
                Console.WriteLine("Student fees structure");
                Console.WriteLine("---------------------");
                Console.WriteLine("1. Enter student info");
                Console.WriteLine("2. Display fees info");
                Console.WriteLine("3. Calculate total fees");
                Console.WriteLine("4. C");
                Console.WriteLine("5. Exit");
                Console.WriteLine();

                Console.Write("Enter your choice (1-5): ");
                string choice = Console.ReadLine();
                Console.WriteLine();

                switch (choice)
                {
                    case "1":
                        EnterStudentDetails(students);
                        break;
                    case "2":
                        DisplayAllStudentInformation(students);
                        break;
                    case "3":
                        CalculateTotalFeesCollected(students);
                        break;
                    case "4":
                        CalculateAverageFeeAmountPaid(students);
                        break;
                    case "5":
                        Console.WriteLine("Exiting the program...");
                        return;
                    default:
                        Console.WriteLine("Invalid choice. Please enter a valid option (1-5).");
                        break;
                }

                Console.WriteLine();
            }
        }

        static void EnterStudentDetails(List<Student> students)
        {
            Console.WriteLine("Enter Student Details");
            Console.WriteLine("---------------------");

            Console.Write("Enter student name: ");
            string name = Console.ReadLine();

            Console.Write("Enter student grade: ");
            string grade = Console.ReadLine();

            double feesPaid = GetValidFeesPaid();

            Student student = new Student
            {
                Name = name,
                Grade = grade,
                FeesPaid = feesPaid
            };

            students.Add(student);

            Console.WriteLine("Student details entered successfully!");
        }

        static void DisplayAllStudentInformation(List<Student> students)
        {
            Console.WriteLine("All Student Information");
            Console.WriteLine("-----------------------");
            foreach (var student in students)
            {
                Console.WriteLine($"Name: {student.Name}");
                Console.WriteLine($"Grade: {student.Grade}");
                Console.WriteLine($"Fees Paid: {student.FeesPaid:C}");
                Console.WriteLine();
            }
        }

        static void CalculateTotalFeesCollected(List<Student> students)
        {
            double totalFeesCollected = 0;
            foreach (var student in students)
            {
                totalFeesCollected += student.FeesPaid;
            }

            Console.WriteLine($"Total Fees Collected: {totalFeesCollected:C}");
        }

        static void CalculateAverageFeeAmountPaid(List<Student> students)
        {
            double totalFeesCollected = 0;
            foreach (var student in students)
            {
                totalFeesCollected += student.FeesPaid;
            }

            double averageFeeAmountPaid = totalFeesCollected / students.Count;

            Console.WriteLine($"Average Fee Amount Paid: {averageFeeAmountPaid:C}");
        }

        static double GetValidFeesPaid()
        {
            double feesPaid;
            Console.Write("Enter fees paid: ");
            while (!double.TryParse(Console.ReadLine(), out feesPaid) || feesPaid < 0)
            {
                Console.WriteLine("Invalid input. Please enter a non-negative value for fees paid.");
                Console.Write("Enter fees paid: ");
            }
            return feesPaid;
        }
    }

    class Student
    {
        public string Name { get; set; }
        public string Grade { get; set; }
        public double FeesPaid { get; set; }
    }
}
