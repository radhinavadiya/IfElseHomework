import java.util.Scanner;
public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number from 1-7");//only up to 7 because 7 days in week
        int day = scanner.nextInt();//input number
        if (day==1){
            System.out.println("Monday"); // prints day of week
        } else if (day==2) {
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("Wednesday");
        } else if (day==4) {
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("sunday");
        }
    }
}