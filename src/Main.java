import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci tre stringhe per favore:");
        String primaStringa = scanner.nextLine();
        String secondaStringa = scanner.nextLine();
        String terzaStringa = scanner.nextLine();
        System.out.println(primaStringa + " " + secondaStringa + " " + terzaStringa);
        System.out.println(terzaStringa + " " + secondaStringa + " " + primaStringa);
    }
}