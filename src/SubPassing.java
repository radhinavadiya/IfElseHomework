
    import java.util.Scanner;
    public class SubPassing {
        static Scanner scanner = new Scanner(System.in);
       static String Student_name;
        int eng, math,sci;
        int total_marks;
        int Roll_no;
        public void score(){
            Student_name =scanner.nextLine();
        }
        public static void main(String[] args) { //
            System.out.println("Enter your name");
            Mark_sheet marksheet1 = new Mark_sheet();
            Student_name =scanner.nextLine();
            System.out.println("Enter your Roll no.");
            int roll_no=scanner.nextInt();
            System.out.println("Enter eng mark");
            int eng =scanner.nextInt();
            System.out.println("Enter science mark");
            int science =scanner.nextInt();
            System.out.println("Enter maths mark");
            int maths=scanner.nextInt();
            if ((eng>=34)&&(maths>=34)&&(science>=34))//All three should be passed
            {
                System.out.println("Pass");
            }else {
                System.out.println("Failed");   // if any one failed
            }
        }
    }


