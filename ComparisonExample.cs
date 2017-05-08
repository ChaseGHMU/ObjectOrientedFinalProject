using System;

namespace ComparisonExample
{
    public class Bird {
        //Fields
        public int Age = 1;
        public bool Alive = true;

        public string Family = "Cardinal";
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
        public static string FirstName = "Aaron";
        public static string LastName = "Smith";
        public static string Name = "Aaron";
        static void Main(string[] args)
        {
            //Initialize objects for comparison
            Bird a = new Bird();
            Bird b = new Bird();
            Bird c = a;

            //Compare references
            if(System.Object.ReferenceEquals(a,b)) {
                Console.WriteLine("Bird a and Bird b have the same reference");
            }
            else {
                Console.WriteLine("Bird a and Bird b have different references");
            }

            //Compare references
            if(System.Object.ReferenceEquals(a,c)) {
                Console.WriteLine("Bird a and Bird c have the same reference");
            }
            else {
                Console.WriteLine("Bird a and Bird c have different references");
            }

            //Compare int
            if(FirstName == Name) {
                Console.WriteLine("The values are equal");
            } else {
                Console.WriteLine("The values are not equal");
            }

            //Compare strings
            if(FirstName == LastName) {
                Console.WriteLine("The values are equal");
            }
            else {
                Console.WriteLine("The values are not equal");
            }
        }
    }
}
