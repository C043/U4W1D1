public class ES1 {
    public static void main(String[] args) {
        System.out.println("Il risultato della moltiplicazione è " + moltiplica(2, 30));
        System.out.println(concatena("count", 10));
        String[] test = {"test1", "test2", "test3", "test4", "test5"};
        String[] testResult = inserisciInArray(test, "PROVA");
        for (String s : testResult) {
            System.out.println(s);
        }

    }

    public static int moltiplica(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatena(String stringa, int number) {
        return (stringa + number);
    }

    public static String[] inserisciInArray(String[] oldArray, String stringa) {
        String[] newArray = new String[6];
        for (int i = 0; i < newArray.length; i++) {
            if (i == 2) {
                newArray[i] = stringa;
            } else if (i > 2) {
                newArray[i] = oldArray[i - 1];
            } else {
                newArray[i] = oldArray[i];
            }
        }
        return newArray;
    }
}
