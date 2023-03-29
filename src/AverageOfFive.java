import java.util.Scanner;
public class AverageOfFive {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in); // scanner class
     System.out.println("Enter five value"); //  get input
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int e = scanner.nextInt();
            double total = ((a + b + c + d + e)/5.0);//total of five value and divided by 5
            System.out.println("The average of entered five value ="+ total);// print average in double if it is
   }
}

