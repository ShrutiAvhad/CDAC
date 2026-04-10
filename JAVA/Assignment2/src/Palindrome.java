import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int o = num;
        
        int rev = 0;

        while(num != 0) {
            int digit = num % 10;   
            rev = rev * 10 + digit; 
            num = num / 10;         
        }

        if(o == rev) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is NOT Palindrome");
        }

        s.close();
    }
}