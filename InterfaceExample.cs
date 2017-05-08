using System;

namespace InterfaceExample
{

    public interface NonFlyingBird {
        void walk();
        void swim();

        int Age {
            get;
            set;
        }
    }

    public class Penguin : NonFlyingBird {
        private int penguinAge = 1;
        public int Age {
            get{
                return penguinAge;
            }
            set {
                penguinAge = value;
            }
        }
        public void walk() {
            Console.WriteLine("The penguin waddles");
        }

        public void swim() {
            Console.WriteLine("The penguin swims like a champion");
        }
    }

    public class Duck : NonFlyingBird {
        private int duckAge = 2;
        public int Age {
            get{
                return duckAge;
            }
            set {
                duckAge = value;
            }
        }
        public void walk() {
            Console.WriteLine("The duck walks like a normal bird");
        }

        public void swim() {
            Console.WriteLine("The duck swims, but not as well as the penguin");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Penguin MyPenguin = new Penguin();

            Duck MyDuck = new Duck();

            Console.WriteLine("Check first method:");
            MyPenguin.swim();
            MyDuck.swim();

            Console.WriteLine("Check second method:");
            MyPenguin.walk();
            MyDuck.walk();

            Console.WriteLine("The penguin is " + MyPenguin.Age + " years old");
            Console.WriteLine("The duck is " + MyDuck.Age + " years old");

        }
    }
}
