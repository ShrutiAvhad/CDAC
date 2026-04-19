package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListCRUDOperation {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<String> l = new ArrayList<>();

        int ch;

        do {
            System.out.println("1. Create Element");
            System.out.println("2. Display Elements");
            System.out.println("3. Update Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            ch = s.nextInt();

            switch (ch) {

                case 1:
                	
                    System.out.println("-------------------------------");

                    System.out.print("Enter element to add : ");
                    String a = s.next();
                    
                    l.add(a);
                    System.out.println(a);
                    
                    System.out.println("-----------------------------");
                    break;

                case 2: 
                	
                    System.out.println("-------------------------------");
                	
                    System.out.println("Display Elements : ");
                    
                    Iterator<String> itr = l.iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    
                    System.out.println("------------------------------");
                    break;

                case 3:
                	
                    System.out.println("-------------------------------");

                    System.out.print("Enter i to update: ");
                    int i = s.nextInt();

                    if (i >= 0 && i < l.size()) {
                        System.out.print("Enter new value: ");
                        
                        String newVal = s.next();
                        l.set(i, newVal);
                        
                    } else {
                        System.out.println("Invalid index");
                    }
                    
                    System.out.println("-------------------------------");

                    break;
                    

                case 4:
                	
                    System.out.println("-------------------------------");

                	System.out.print("Enter index to delete: ");
                    int di = s.nextInt();

                    if (di >= 0 && di < l.size()) {
                        l.remove(di);
                        System.out.println("Element deleted");
                    } else {
                        System.out.println("Invalid index");
                    }
                    
                    System.out.println("-------------------------------");

                    break;
                    

                case 5:
                	
                    System.out.println("-------------------------------");

                    System.out.println(" Byeee..");
                    
                    System.out.println("-------------------------------");

                    break;

                default:
                    System.out.println("-------------------------------");

                    System.out.println("Invalid choice");
                    
                    System.out.println("-------------------------------");

            }

        } while (ch != 5);

        s.close();
    }
}