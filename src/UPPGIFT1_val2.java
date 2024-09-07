import java.util.Scanner;

public class UPPGIFT1_val2 {

    public static void main (String[] args){

        int kontosaldo= 10000;
        int moms;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange totala summan för fakturan");
        int faktura = scanner.nextInt();

        double precentage = 0.25*faktura;
        double Netto = (int) precentage + faktura;

        System.out.println("Brutto summan: " + faktura);
        System.out.println("Moms summan: " + precentage);
        System.out.println("Netto summan: " + (precentage + faktura));
        System.out.println("Konto saldo: " + (Netto + kontosaldo));


    }
}
