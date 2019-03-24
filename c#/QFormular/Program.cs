using System;

namespace QFormular {
    class Program {
        static void Main(string[] args) {
            double a, b, c;
            if (args.Length == 3) {
                a = Convert.ToDouble(args[0]);
                b = Convert.ToDouble(args[1]);
                c = Convert.ToDouble(args[2]);
            } else {
                Input(out a, out b, out c);
            }
            Console.WriteLine("x1=" + (-b + Math.Sqrt(Math.Pow(b, 2) - 4 * a * c)) / (2 * a));
            Console.WriteLine("x2=" + (-b - Math.Sqrt(Math.Pow(b, 2) - 4 * a * c)) / (2 * a));
        }

        private static void Input(out double a, out double b, out double c) {
            Console.Write("a: ");
            a = Convert.ToDouble(Console.ReadLine());
            Console.Write("b: ");
            b = Convert.ToDouble(Console.ReadLine());
            Console.Write("c: ");
            c = Convert.ToDouble(Console.ReadLine());
        }


    }
}
