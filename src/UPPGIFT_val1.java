import java.util.Scanner;
public class UPPGIFT_val1 {


    public static void main(String[] args) {

        int[] employee;
        double salary;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ange antal anställda: ");

        int antal = scanner.nextInt();

        employee = new int[antal];

        for (int i = 0; i < employee.length; i++ ) {


            System.out.print("Ange lön: ");
            employee[i] = scanner.nextInt();



            double precentage = 0.3*employee[i];
            double skatt = (int) precentage + employee[i];
            salary = antal + precentage;
            System.out.println("Dragen Skatt är: " + precentage);


            System.out.println("Nettolön är: " + (employee[i] - precentage));

            System.out.println("-------------");
            }
        }
    }