using System;

namespace Fishland
{
    class Program
    {
        static void Main(string[] args)
        {
            double mackerelPrice = double.Parse(Console.ReadLine());
            double spratPrice = double.Parse(Console.ReadLine());
            double chamois= double.Parse(Console.ReadLine());
            double horseMackerel = double.Parse(Console.ReadLine());
            int mussels = int.Parse(Console.ReadLine());

            double chamoisPrice = mackerelPrice * (1 + 0.6);
            double horseMackerelPrice = spratPrice* (1 + 0.8);
            double total = chamoisPrice * chamois + horseMackerelPrice * horseMackerel + 7.5 * mussels;
            Console.WriteLine($"{total:F2}");
        }
    }
}
