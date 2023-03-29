import java.util.Scanner;
public class Operators {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter value1");
        int value1 = scanner.nextInt();
        System.out.println("enter value2");
        int value2 = scanner.nextInt();
        System.out.println("enter any operator from *,/,-,+");//operation between two values
        String operator = scanner.next();
        if (operator.equals("*")){   // multiplication
        System.out.println(value1*value2);}
        else if (operator.equals("+"))   //addition
        {System.out.println(value1+value2);}
        else if (operator.equals("-")) {    //subtraction
            System.out.println(value1-value2);}
        else if (operator.equals("/"))  //division
            System.out.println((value1/value2));
        }
    }

