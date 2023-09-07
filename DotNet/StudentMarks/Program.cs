using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentMarks
{
    internal class Program
    {
        static void Main()
        {
            int numStudents;
            Console.Write("Enter the number of students: ");
            while (!int.TryParse(Console.ReadLine(), out numStudents) || numStudents <= 0)
            {
                Console.WriteLine("Invalid input. Please enter a positive integer.");
                Console.Write("Enter the number of students: ");
            }

            Console.WriteLine();

            List<Student> students = new List<Student>();

            for (int i = 0; i < numStudents; i++)
            {
                Console.WriteLine($"Student #{i + 1}");
                Console.Write("Enter student name: ");
                string name = Console.ReadLine();

                int mathScore = GetValidScore("Math");
                int englishScore = GetValidScore("English");
                int scienceScore = GetValidScore("Science");

                Student student = new Student
                {
                    Name = name,
                    Scores = (mathScore, englishScore, scienceScore)
                };

                students.Add(student);

                Console.WriteLine();
            }

            Console.WriteLine("Grades:");
            Console.WriteLine("--");
            Console.WriteLine(" ");
            Console.WriteLine("--");
            foreach (var student in students)
            {
                Console.WriteLine(student.GetGradeDetails());
            }
            Console.WriteLine("-");
            Console.ReadKey();
        }

        static int GetValidScore(string subject)
        {
            int score;
            Console.Write($"Enter {subject} score: ");
            while (!int.TryParse(Console.ReadLine(), out score) || score < 0 || score > 100)
            {
                Console.WriteLine("Invalid input. Please enter a score between 0 and 100.");
                Console.Write($"Enter {subject} score: ");
            }
            return score;
        }
    }

    class Student
    {
        public string Name { get; set; }
        public (int math, int english, int science) Scores { get; set; }

        public double GetAverageScore()
        {
            double averageScore = (Scores.math + Scores.english + Scores.science) / 3.0;
            return averageScore;
        }

        public string GetGrade()
        {
            double averageScore = GetAverageScore();
            if (averageScore >= 90)
                return "A";
            else if (averageScore >= 80)
                return "B";
            else if (averageScore >= 70)
                return "C";
            else if (averageScore >= 60)
                return "D";
            else
                return "F";
            Console.ReadKey();
        }

        public string GetGradeDetails()
        {
            double averageScore = GetAverageScore();
            string grade = GetGrade();
            return $"| {Name,-7} | {Scores.math,-4} | {Scores.english,-7} | {Scores.science,-7} | {averageScore,-7:F2} | {grade,-5} |";
        }
    }
}