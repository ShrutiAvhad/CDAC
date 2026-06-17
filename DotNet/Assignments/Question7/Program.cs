namespace Question7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int BasSal = Convert.ToInt32(Console.ReadLine());

            double HRA = 0.20 * BasSal;
            double DA = 0.40 * BasSal;
            double Gross = BasSal + HRA + DA;
            double PF = 0.10 * Gross;
            double Net = Gross - PF;

            Console.WriteLine(Net);
        }
    }
}
