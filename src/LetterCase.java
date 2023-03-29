import java.util.Locale;
import java.util.Scanner;
public class LetterCase {
    static Scanner scanner = new Scanner(System.in);// scanner class creation
    public static void main(String[] args) {
        System.out.println("enter any alphabet");//Instruction for input
        String alphabet = scanner.next();//get input
        System.out.println(alphabet.toLowerCase(Locale.ROOT) );// convert in to lowercase
    }
}