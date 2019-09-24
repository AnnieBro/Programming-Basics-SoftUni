using System;

namespace Tailoring_Workshop
{
    class Program
    {
        static void Main(string[] args)
        {
            int tables = int.Parse(Console.ReadLine());
            double length = double.Parse(Console.ReadLine());
            double width = double.Parse(Console.ReadLine());

            double tableclothPrice = (length + 0.30 * 2) * (width + 0.30 * 2) * 7;
            double tablesquarePrice = (length * length / 4) * 9;

            double USD = tableclothPrice + tablesquarePrice;
            double BGN = USD * 1.85;

            Console.WriteLine($"{USD * tables:F2} USD");
            Console.WriteLine($"{BGN * tables:F2} BGN");
        }
    }
}
