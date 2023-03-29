import java.util.Scanner;
public class SalarySlip {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//scanner initialisation
        System.out.println("Enter employee ID");
        int id= scanner.nextInt();  //input id
        System.out.println("Enter employee name");
        String name = scanner.next();    //input name
        System.out.println("Enter basic salary");
        float salary = scanner.nextFloat();   //input salary
        float hra=salary*10/100;//calculation
        float da=salary*8/100;
        float ta=salary*9/100;
        float pf=salary*20/100;
        System.out.println("HRA = "+hra);
        System.out.println("DA = "+da);
        System.out.println("TA = "+ta);
        System.out.println("PF = "+pf);
        float grossSalary = salary+hra+da+ta+pf;//gross salary calculation
        System.out.println("Gross salary = "+grossSalary);
    }
}
