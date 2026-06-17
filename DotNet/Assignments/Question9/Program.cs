namespace Question9
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double Bsal = Convert.ToDouble(Console.ReadLine());
            double Samt = Convert.ToDouble(Console.ReadLine());

            double com = 0;

            if (Samt >= 5000 && Samt <= 7500)
            {
                com = 3;
            }
            else if (Samt > 7500 && Samt <= 10500)
            {
                com = 8;
            }
            else if (Samt > 10500 && Samt <= 15000)
            {
                com = 11;
            }
            else if (Samt > 15000)
            {
                com = 15;
            }
            else
            {
                Console.WriteLine("Invalid Sales Amount");
                return;
            }

            double comE = Samt * com / 100;
            double Net = Bsal + comE;

            Console.WriteLine("Net Salary = " + Net);
        }
    }
}