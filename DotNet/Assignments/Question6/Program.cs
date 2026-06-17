namespace Question6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter a character: ");
            char ch = Convert.ToChar(Console.ReadLine());

            int asciiValue = (int)ch;

            Console.WriteLine("Ascii value = " + asciiValue);
        }
    }
}
