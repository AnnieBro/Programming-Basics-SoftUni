using System;

namespace Celsius_to_Fahrenheit
{
    class Program
    {
        static void Main(string[] args)
        {
            double Celsius = double.Parse(Console.ReadLine());

            double Fahrenheit = Celsius * 1.8 + 32;
            Console.WriteLine($"{Fahrenheit:F2}");
        }
    }
}
