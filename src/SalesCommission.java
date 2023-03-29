import java.util.Scanner;
public class SalesCommission {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Sales ID");
        int id = Integer.parseInt(scanner.next());//get input
        System.out.println("Enter seller's name");
        String name = scanner.next();
        System.out.println("Enter sales amount");
        int sales_amount = scanner.nextInt();
        System.out.println("Enter salary basic");
        int salary = scanner.nextInt();
        if (sales_amount>=50000) {
            System.out.println("Commission is " + sales_amount*35/100); // for above 50000
        }else if (sales_amount>=30000) {
            System.out.println("Commission is "+ sales_amount*20/100);// for 30000-49999
        } else if (sales_amount>=20000) {
            System.out.println("Commission is "+ sales_amount*10/100); // for 20000-29999
        } else if (sales_amount>=10000) {
            System.out.println("Commission is "+ sales_amount*5/100); // for 10000-19999
        }else System.out.println("Commission is "+ sales_amount*2/100); //for less than 10000
    }
}
