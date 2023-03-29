import java.util.Scanner;
public class Mark_sheet {
    static Scanner scanner = new Scanner(System.in);
    static String Student_name;
    int eng, math, sci;
    int total_marks;
    int Roll_no;
    public static void main(String[] args) {
        System.out.println("Enter your name");//get input
        Student_name = scanner.nextLine();
        System.out.println("Enter your Roll no.");
        int roll_no = scanner.nextInt(); //
        System.out.println("enter eng marks");
        int eng = scanner.nextInt();
        System.out.println("enter science mark");
        int science = scanner.nextInt();
        System.out.println("enter maths mark");
        int maths = scanner.nextInt();
        int total = (eng + science + maths);//total of three subject
        float percentage = (total / 3.0f);// to get answer in float
        System.out.println("your total marks " + total + " and you got " + percentage + "%");//percentage calculation
        if (percentage >= 80)
            System.out.println("congratulation you got garde A+");//80 or above that than a+
        else if (percentage >= 60)
            System.out.println("congratulation you got garde A"); //60 to 79 than a
        else if (percentage >= 50)
            System.out.println("congratulation you got garde B+");//50 to 59 than b+
        else if (percentage >= 35)
            System.out.println("you got garde C");// 35 to 49 than c
        else
        System.out.println("you are failed"); // below 34 than fail
    }
}
