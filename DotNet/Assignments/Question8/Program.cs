namespace Question8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int Y = Convert.ToInt32 (Console.ReadLine());

            if((Y%4 == 0) || (Y%400 == 0) && (Y%100 != 0))
            {
                Console.WriteLine(Y + " is a leap year ");
            }
            else
            {
                Console.WriteLine(Y + " is not a leap year");
            }

        }
    }
}
