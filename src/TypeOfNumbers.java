import java.util.Scanner;
public class TypeOfNumbers {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if (number<0){   // less than 0 will b negative
            System.out.println( number + " is Negative");}
        else if(number>0) {  // more than 0 will be positive
            System.out.println(number + " is Positive");}
        else if(number == 0) {  // if it equals  0
            System.out.println(0);
        }
    }
}

