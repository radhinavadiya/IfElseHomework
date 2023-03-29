import java.util.Scanner;
public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age to check eligibility for vote"); // get input as age
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible for vote."); // for  18 or above 18
        } else {
            System.out.println("Sorry, You are not eligible for vote."); // for below 18
        }
    }
}