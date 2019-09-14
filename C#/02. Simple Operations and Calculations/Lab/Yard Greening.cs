using System;

namespace Yard_Greening
{
    class Program
    {
        static void Main(string[] args)
        {
            double area = double.Parse(Console.ReadLine());

            double price = area * 7.61 * (1 - 0.18);
            Console.WriteLine("The final price is: {0:F2} lv.", price);
            Console.WriteLine("The discount is: {0:F2} lv.", area * 7.61 * 0.18);
        }
    }
}
