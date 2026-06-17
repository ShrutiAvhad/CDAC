namespace Question5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a = 10;
            int b = 20;
            int c;

            c = a;
            a = b;
            b = c;

            Console.WriteLine("a = "+ a);
            Console.WriteLine("b = "+ b);
        }
    }
}
