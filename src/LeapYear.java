import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Mata in ett årtal:");

        year = scanner.nextInt();

        boolean isLeapYear = false;

        if (year % 4==0);{
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }

            }// if = true
            if (isLeapYear){
                System.out.println(year + "är ett skottår");
            // annars är det falsk
            }else {
                System.out.println(year + "inte skott år");
            }
    }
}
