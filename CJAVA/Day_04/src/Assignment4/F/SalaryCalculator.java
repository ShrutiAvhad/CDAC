package Assignment4.F;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FullTimefaculty ft[] = new FullTimefaculty[2];
        PartTimefaculty pt[] = new PartTimefaculty[2];

        for(int i = 0; i < 1; i++) 
        {
            System.out.println("Enter Faculty ID, Basic, Allowance:");
            int id = sc.nextInt();
            int basic = sc.nextInt();
            int allowance = sc.nextInt();

            ft[i] = new FullTimefaculty(id, basic, allowance);
            
            int Tsal = 0;
            Tsal += basic + allowance;
            System.out.println(id+" = "+Tsal);
        }

        for(int i = 0; i < 2; i++)
        {
            System.out.println("Enter Faculty ID, Hours, Rate:");
            int id = sc.nextInt();
            int hour = sc.nextInt();
            int rate = sc.nextInt();

            pt[i] = new PartTimefaculty(id, hour, rate);
            
            int sal = 0;
            sal += rate * hour;
            System.out.println(id+" = "+sal);
            
        }

        System.out.println("\nFull-Time Faculty Details:");
        for(int i = 0; i < 2; i++) 
        {
            System.out.println(ft[i]);
        }

        System.out.println("\nPart-Time Faculty Details:");
        for(int i = 0; i < 2; i++) 
        {
            System.out.println(pt[i]);
        }

        sc.close();
    }
}