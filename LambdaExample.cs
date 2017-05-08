using System;

namespace LambdaExample
{
    delegate void Walk();
    delegate void Run();
    class Program
    {
        static void Main(string[] args)
        {
            Walk PenguinWalk = delegate() {
                Console.WriteLine("Walking slowly");
            };

            PenguinWalk();

            Run PenguinRun = () => {
                Console.WriteLine("Penguins don't run");
            };

            PenguinRun();
        }
    }
}
