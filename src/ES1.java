public class ES1 {
    public static void main(String[] args) {
        int result = moltiplica(2, 3);
        System.out.println("Il risultato della moltiplicazione è " + result);
        String concatenazione = concatena("count", 4);
        System.out.println(concatenazione);
    }

    public static int moltiplica(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatena(String stringa, int number) {
        return (stringa + number);
    }
}
