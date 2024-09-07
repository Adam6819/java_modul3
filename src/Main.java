import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int age;

boolean isStudent;

        System.out.println("agne din ålder:");
        age = scanner.nextInt();

        System.out.println(age);


        System.out.println("är du student? true/fasle ");

        isStudent = scanner.nextBoolean();

        boolean getDiscount = false;

        if (age < 18|| age >= 65 || isStudent) {
            getDiscount = true;
        }
        if (getDiscount) {
            System.out.println("Du är berittigad till rabatt");

        } else {
            System.out.println("du är inte berttigad till rabatt");

        }

}

}