import java.util.Scanner;
public class UPPGIFT1_val3 {


    public static void main(String[] args) {

        int accountAmount = 20000;
        int[] invoice;
        double amout;

        Scanner scr = new Scanner(System.in);

        System.out.println("Ange antal fakturor: ");

        int inAmount = scr.nextInt();

        invoice = new int[inAmount];


            for (int i = 0; i < invoice.length; i++) {

                System.out.println("Ange summa: ");
                invoice[i] = scr.nextInt();

                if (accountAmount < invoice[i]) {
                    System.out.println("Inte tillräckligt med pengar på kontot");
                    break;
                } else {
                double precentage = 0.25 * invoice[i];
                double moms = (int) precentage + invoice[i];


                double kontosaldo = accountAmount - (precentage + inAmount);
                System.out.println("Moms är: " + precentage);

                System.out.println("Kontosaldo: " + kontosaldo);


                }
                    System.out.println("Betald");
                System.out.println("-----------");
                }
            }
    }

