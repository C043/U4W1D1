import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class ES3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la misura dei due lati del rettangolo per favore");
        double primoLato = parseDouble(scanner.nextLine());
        double secondoLato = parseDouble(scanner.nextLine());
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo(primoLato, secondoLato));

        System.out.println("Inserisci un numero e scopri se è pari o dispari!");
        int num = parseInt(scanner.nextLine());
        System.out.println(pariDispari(num));

        System.out.println("Inserisci la lungezza dei tre lati del triangolo per calcolarne l'area");
        double l1 = parseDouble(scanner.nextLine());
        double l2 = parseDouble(scanner.nextLine());
        double l3 = parseDouble(scanner.nextLine());
        System.out.println("L'area del triangolo è " + perimetroTriangolo(l1, l2, l3));
    }

    public static double perimetroRettangolo(double primoLato, double secondoLato) {
        return primoLato * secondoLato;
    }

    public static byte pariDispari(int num) {
        if (num % 2 == 0) {
            return 0;
        }
        return 1;

    }

    public static double perimetroTriangolo(double latoUno, double latoDue, double latoTre) {
        double semiperimetro = (latoUno + latoDue + latoTre) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - latoUno) * (semiperimetro - latoDue) * (semiperimetro - latoTre));
    }
}
