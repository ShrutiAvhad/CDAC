import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        
        int rev = 0;

        while(num != 0) {
            int digit = num % 10;   // get last digit
            rev = rev * 10 + digit; // build reverse
            num = num / 10;         // remove last digit
        }

        System.out.println("Reversed number = " + rev);
   s.close();
    }
}