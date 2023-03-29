import java.util.Scanner;

public class InterchangedValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number1");
        int number1 = scanner.nextInt(); //Inpul number1
        System.out.println("Enter any Number2");
        int number2 = scanner.nextInt(); //Input Number2
        System.out.println("Number1 " + number1);// display Number1
        System.out.println("Number2 " + number2);// displya Number2
        int temp;
        temp = number1;// store number1 value temporary in variable temp
        number1=number2;//
        number2=temp;
        System.out.println("Interchanged Number1 =" + number1);// display Number2
        System.out.println("Interchanged Number2 =" + number2);// displya Number1

    }
}
