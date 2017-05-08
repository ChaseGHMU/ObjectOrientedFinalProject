using System;

namespace PropertyExample
{
    public class Penguin {
        //backing variable
        private int age  = 1;

        //property
        public int Age {
            get {
            return age;
            }
            set {
            age = value;
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            //Initialize the object
            Penguin MyPenguin = new Penguin();

            //Use the getter to get the name. (Note how unlike Java, we don't need a method call!)
            Console.WriteLine("My penguin is " + MyPenguin.Age + " years old");

            MyPenguin.Age = 3;

            Console.WriteLine("After using the setter, my penguin is " + MyPenguin.Age + " years old");
        }
    }
}
