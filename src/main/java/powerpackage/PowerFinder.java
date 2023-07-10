package powerpackage;

public class PowerFinder {
    public static int power(int number, int pow) {
        int result = 1;
        for (int i = 0; i<pow; i++) {
            result *= number;
        }
        return result;
    }
}
