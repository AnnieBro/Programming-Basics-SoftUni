using System;

namespace House_Painting
{
    class Program
    {
        static void Main(string[] args)
        {
            double x = double.Parse(Console.ReadLine());
            double y = double.Parse(Console.ReadLine());
            double h = double.Parse(Console.ReadLine());

            double greenArea = 2 * (x * x - 1.2 + x * y - 1.5 * 1.5);
            double redArea = 2 * x * y + x * h;
            double greenPaint = greenArea / 3.4;
            double redPaint = redArea / 4.3;

            Console.WriteLine($"{greenPaint:F2} \n{redPaint:F2}");
        }
    }
}
