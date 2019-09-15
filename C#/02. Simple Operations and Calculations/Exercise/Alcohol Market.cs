using System;

namespace Alcohol_Market
{
    class Program
    {
        static void Main(string[] args)
        {
            double whiskeyPrice = double.Parse(Console.ReadLine());
            double beer = double.Parse(Console.ReadLine());
            double wine = double.Parse(Console.ReadLine());
            double rakiya = double.Parse(Console.ReadLine());
            double whiskey = double.Parse(Console.ReadLine());

            double rakiyaPrice = whiskeyPrice / 2;
            double winePrice = rakiyaPrice * (1 - 0.4);
            double beerPrice = rakiyaPrice * (1 - 0.8);

            double total = whiskeyPrice * whiskey + rakiyaPrice * rakiya + winePrice * wine + beerPrice * beer;
            Console.WriteLine($"{total:F2}");
        }
    }
}
