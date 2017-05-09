using System;

namespace SingletonExample
{
    public sealed class PenguinSingleton
    {
        //The variable will be set to read only
        private static readonly PenguinSingleton instance = new PenguinSingleton();

        private PenguinSingleton() { }

        public string name = "Larry";
        //There will be no instance until a call is made to Instance
        public static PenguinSingleton Instance
        {
            get
            {
                return instance;
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            //Ask for the penguin instance
            PenguinSingleton Penguin = PenguinSingleton.Instance;
            Console.WriteLine("The penguin's name is " + Penguin.name);

            //Try to make another
            PenguinSingleton AnotherPenguin = PenguinSingleton.Instance;

            //They are the same.
            if(System.Object.ReferenceEquals(Penguin,AnotherPenguin))
            {
                Console.WriteLine("The penguins are the same object");
            }
        }
    }
}

