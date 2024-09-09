import java.util.Scanner;

public class UPPGIFT1_val2 {

    public static void main(String[] args) {


        int accountAmount = 30000;
        int[] employee;
        int[] invoice;
        int amount;
        double salary;
        boolean run = true;
        int choiseinput;


        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("Val 1.\nVal 2.\nVal 3.");
            try {
                choiseinput = scanner.nextInt();
                switch (choiseinput) {

                    case 1:
                        System.out.println("Ange antal anställda: ");

                        int antal = scanner.nextInt();

                        employee = new int[antal];

                        for (int i = 0; i < employee.length; i++) {

                            System.out.print("Ange lön: ");
                            employee[i] = scanner.nextInt();

                            double precentage1 = 0.3 * employee[i];
                            double skatt = (int) precentage1 + employee[i];
                            salary = antal + precentage1;
                            System.out.println("Dragen Skatt är: " + precentage1);

                            System.out.println("Nettolön är: " + (employee[i] - precentage1));
                            break;

                        }
                            case 2:
                                System.out.println("Ange totala summan för fakturan");
                                int faktura = scanner.nextInt();

                                double precentage = 0.25 * faktura;
                                double Netto = (int) precentage + faktura;

                                System.out.println("Brutto summan: " + faktura);
                                System.out.println("Moms summan: " + precentage);
                                System.out.println("Netto summan: " + (precentage + faktura));
                                System.out.println("Konto saldo: " + (Netto + accountAmount));
                                break;

                            case 3:
                                System.out.println("Ange antal fakturor: ");

                                int inAmount = scanner.nextInt();

                                invoice = new int[inAmount];


                                for (int i = 0; i < invoice.length; i++) {

                                    System.out.println("Ange summa: ");
                                    invoice[i] = scanner.nextInt();

                                    if (accountAmount < invoice[i]) {
                                        System.out.println("Inte tillräckligt med pengar på kontot");
                                        break;
                                    } else {
                                        double precentage2 = 0.25 * invoice[i];
                                        double moms = (int) precentage2 + invoice[i];


                                        double kontosaldo = accountAmount - (precentage2 + inAmount);
                                        System.out.println("Moms är: " + precentage2);

                                        System.out.println("Kontosaldo: " + kontosaldo);

                                        System.out.println("Betald");


                                    }
                                }
                        }




            }finally {

            }
        }
    }
}