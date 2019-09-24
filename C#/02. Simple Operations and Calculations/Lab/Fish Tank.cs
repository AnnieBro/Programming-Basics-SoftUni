using System;

namespace Fish_Tank
{
    class Program
    {
        static void Main(string[] args)
        {
            int length = int.Parse(Console.ReadLine());
            int width = int.Parse(Console.ReadLine());
            int height = int.Parse(Console.ReadLine());
            double percentage = double.Parse(Console.ReadLine());

            double volume = (length * width * height) * 0.001;

            Console.WriteLine("{0:F3}", volume * (1 - (percentage / 100)));
        }
    }
}
