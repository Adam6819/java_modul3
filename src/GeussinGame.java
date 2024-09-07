import java.util.Random;
import java.util.Scanner;

public class GeussinGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int intcorrectNumber = random.nextInt(100) + 1;

        int guess = 0;
        int tries = 0;

        System.out.println("jag har slumpat ett tal mellan 1 - 100 gissa vilket");
        //guess = scanner.nextInt();

        while (guess != intcorrectNumber) {
            System.out.println("ange din gissning:");
            guess = scanner.nextInt();
            tries++;
            if (guess < intcorrectNumber) {
                System.out.println("för lågt, försök igen");
            } else if (guess > intcorrectNumber) {
                System.out.println("för högt, försök igen");
            } else {
                System.out.println("rätt! du gissade rätt nummer på " + tries);
                break;
            }

        }
    }
}
