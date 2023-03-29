import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter year ");
        int year;
        year=scanner.nextInt();// leap year if divisible by 400 with no reminder
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year. ");
            // not a leap year if divisible by 100
        }else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year. ");
            // leap year if not divisible by 100 but divisible by 4
        }else if (year % 4 == 0) {
            System.out.println(year + " is a leap year. ");
            // other years are not leap years
        }else {System.out.println(year+" is not a leap year. ");
        }
    }
}