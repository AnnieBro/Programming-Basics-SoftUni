using System;

namespace Dance_Hall
{
    class Program
    {
        static void Main(string[] args)
        {
            double L = double.Parse(Console.ReadLine()) * 100;
            double W = double.Parse(Console.ReadLine()) * 100;
            double A = double.Parse(Console.ReadLine()) * 100;

            double hallArea = L * W ;
            double benchArea = hallArea / 10;
            double wardrobeArea = A * A ;

            hallArea -= (benchArea + wardrobeArea);
            Console.WriteLine(Math.Floor(hallArea / (40 + 7000)));
        }
    }
}
