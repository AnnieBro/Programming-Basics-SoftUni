using System;

namespace Weather_Forecast
{
    class Program
    {
        static void Main(string[] args)
        {
            string weather = Console.ReadLine();

            if (weather == "sunny")
                Console.WriteLine("It's warm outside!");
            else
                Console.WriteLine("It's cold outside!");
        }
    }
}
