using System;

namespace Charity_Campaign
{
    class Program
    {
        static void Main(string[] args)
        {
            int days = int.Parse(Console.ReadLine());
            int bakers = int.Parse(Console.ReadLine());
            int cakes = int.Parse(Console.ReadLine());
            int waffles = int.Parse(Console.ReadLine());
            int pancakes = int.Parse(Console.ReadLine());

            double cakePrice = 45 * cakes;
            double wafflePrice = 5.8 * waffles;
            double pancakePrice = 3.2 * pancakes;
            double total = (cakePrice + wafflePrice + pancakePrice) * bakers * days;

            Console.WriteLine($"{total - total / 8:F2}");
        }
    }
}
