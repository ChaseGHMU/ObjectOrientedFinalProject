using System;
using System.IO;
using System.Reflection;

namespace ReflectionExample
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
    class Program
    {
        static void Main(string[] args)
        {
            //Get the Type for Bird
            Type MyType = typeof(Bird);

            //Request the methods
            MethodInfo[] m = MyType.GetMethods();

            //Print out each method
            foreach (MethodInfo method in m)
            {
                Console.WriteLine(method.Name);
            }
        }
    }
}
