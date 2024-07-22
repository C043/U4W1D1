import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ES3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la misura dei due lati del rettangolo per favore");
        double primoLato = parseDouble(scanner.nextLine());
        double secondoLato = parseDouble(scanner.nextLine());
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo(primoLato, secondoLato));
    }

    public static double perimetroRettangolo(double primoLato, double secondoLato) {
        return primoLato * secondoLato;
    }
}
