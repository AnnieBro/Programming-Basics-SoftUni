using System;

namespace Training_Lab
{
    class Program
    {
        static void Main(string[] args)
        {
            double w = double.Parse(Console.ReadLine()) * 100;
            double h = double.Parse(Console.ReadLine()) * 100;

            h -= 100;
            double rows = Math.Floor(h / 70);
            double columns = Math.Floor(w / 120);
            double workingPlaces = rows * columns - 3;

            Console.WriteLine(workingPlaces);
        }
    }
}
