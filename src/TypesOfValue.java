import java.util.Scanner;
public class TypesOfValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value");
        String key = scanner.next();
        //Identifying Digit
        if (Character.isDigit(key.charAt(0))) { // inbuilt method used
            System.out.println("Entered key is Number");
            //Identifying Alphabet
        } else if (Character.isLetter(key.charAt(0))) { // inbuilt method used
            System.out.println("Entered key is Alphabet");
         } else
             System.out.println("enter key is symbol");// rest are declare as a symbols
    }
}