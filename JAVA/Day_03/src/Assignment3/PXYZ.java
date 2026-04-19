package Assignment3;
import java.util.Scanner;

public class PXYZ {

    public static int totalAmount(Product p[]) {
        int total = 0;

        for(int i = 0; i < p.length; i++) {
            total += p[i].getPrice() * p[i].getQuantity();
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Product p[] = new Product[5];

        // a. Accept input
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter pid, price, quantity:");
            int id = s.nextInt();
            int price = s.nextInt();
            int qty = s.nextInt();

            p[i] = new Product(id, price, qty);
        }

        // b. Find product with highest price
        int maxPrice = p[0].getPrice();
        int maxPid = p[0].getPid();

        for(int i = 1; i < p.length; i++) {
            if(p[i].getPrice() > maxPrice) {
                maxPrice = p[i].getPrice();
                maxPid = p[i].getPid();
            }
        }

        System.out.println("Product ID with highest price: " + maxPid);

        // c. Total amount
        int total = totalAmount(p);
        System.out.println("Total amount spent: " + total);
    }
}