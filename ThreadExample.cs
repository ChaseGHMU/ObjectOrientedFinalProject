using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;

namespace ThreadExample
{
    class ThreadPenguin
    {
        public void Walk()
        {
            int x = 0;
            while(x < 5000)
            {
                Console.WriteLine("The penguins waddles in the thread");
                x++;
            }
        }

        public void Swim()
        {
            int x = 0;
            while(x < 5000)
            {
                Console.WriteLine("The penguin swims like a champion");
                x++;
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            ThreadPenguin MyPenguin = new ThreadPenguin();

            Thread MyThread = new Thread(new ThreadStart(MyPenguin.Walk));
            Thread MySecondThread = new Thread(new ThreadStart(MyPenguin.Swim));

            MyThread.Start();
            MySecondThread.Start();
        }
    }
}
