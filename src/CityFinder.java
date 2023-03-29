import java.util.Scanner;
public class CityFinder {
    static Scanner scanner=new Scanner(System.in);//
    public static void main(String[] args) {
        System.out.println("Enter any letter from a to f to find city accordingly");
        String alphabet = scanner.nextLine().toUpperCase();//to fix letter case.
        if (alphabet.equals("A")) {
            System.out.println("Ahmedabad, Amreli");//display city name
        } else if (alphabet.equals("B")) {
            System.out.println("Baroda");
        } else if (alphabet.equals("C")) {
            System.out.println("Chennai");
        } else if (alphabet.equals(("D"))) {
            System.out.println("Delhi, Diu, Daman");
        } else if (alphabet.equals("E")) {
            System.out.println("East Delhi");
        } else if (alphabet.equals("F")) {
            System.out.println("Faridabad");
        }else {
            System.out.println("Invalid entry");//for excepting letters atof
        }
      }
    }


