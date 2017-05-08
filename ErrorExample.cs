using System;
using System.IO;

namespace ErrorExample
{
    class Program
    {
        static void Main(string[] args)
        {
            FileInfo file = new FileInfo("/fakefile.txt");   
            try {
                StreamReader read = file.OpenText();
            }
            catch (IOException e) {
                Console.WriteLine(e.ToString());
            }
            finally {
                Console.WriteLine("This will happen no matter what");
            }
            
        }
    }
}
