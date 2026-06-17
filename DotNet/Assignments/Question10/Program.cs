namespace Question10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a = Convert.ToInt32 (Console.ReadLine());
            int b = Convert.ToInt32 (Console.ReadLine());

            Console.WriteLine("1.Addition");
            Console.WriteLine("2.Substraction");
            Console.WriteLine("3.Division");
            Console.WriteLine("4.Multiplication");
            Console.WriteLine("5.Exit");

            int ch = Convert.ToInt32 (Console.ReadLine());

            switch(ch)
            {
                case 1:
                    Console.WriteLine("Addition = " + (a + b));
                    break;

                case 2:
                    Console.WriteLine("Substraction = "+ (a - b));
                    break;

                case 3:
                    Console.WriteLine("Division = " + (a / b));
                    break;

                case 4:
                    Console.WriteLine("Multiplication = " + (a - b));
                    break;

                case 5:
                    Console.WriteLine("Exit");
                    break;

                default:
                    Console.WriteLine("Invalid Choice !");
                    break;
            }
        }
    }
}
