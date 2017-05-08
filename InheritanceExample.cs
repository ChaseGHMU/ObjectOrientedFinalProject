using System;

namespace InheritanceExample
{
    public class Bird {
        //Fields
        public int Age = 1;
        public bool Alive = true;

        //Methods
        public void Eat() {
            Console.WriteLine("The bird eats");
        }

        public void Breathe() {
            Console.WriteLine("The bird breathes");
        }

        public void Sleep() {
            Console.WriteLine("The bird sleeps");
        }

        public void Die() {
            this.Alive = false;
        }
    }

    public class Penguin : Bird {
        public string Type = "Emperor";

        public void Waddle() {
            Console.WriteLine("The penguin waddles");
        }

        public void Swim() {
            Console.WriteLine("The penguin swims like a champion");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Penguin MyPenguin = new Penguin();
            MyPenguin.Waddle();
            MyPenguin.Eat();
        }
    }
}
