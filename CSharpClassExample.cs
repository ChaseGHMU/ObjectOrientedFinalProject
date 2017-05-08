using System;

namespace ProjectClassExample
{
    class Example
    {
        static void Main(string[] args)
        {
            //Make an instance of the Penguin class as an object
            Penguin MyPenguin = new Penguin(1,"Male","Royal");
            Console.WriteLine("The penguin is " + MyPenguin.Age + " years old");
            MyPenguin.GrowUp();
            Console.WriteLine("A year from now, the penguin will be " + MyPenguin.Age);

            //Have the penguin waddle
            MyPenguin.Waddle();
        }
    }
    public class Penguin {
        public bool IsInitialized;
        public int Age = 1;
        public string Gender = "Male";
        public string Type = "Emperor";

        //C# can also use the "this" keyword
        public Penguin(int age, string gender, string type) {
            IsInitialized = true;
            this.Age = age;
            this.Gender = gender;
            this.Type = type;
        }

        public void GrowUp(){
            Age += 1;
        }

        public void Waddle() {
            Console.WriteLine("The penguin waddles");
        }
    }
}
