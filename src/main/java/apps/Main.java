package apps;

public class Main {
    public static void main(String[] args) {
        int[] dividends = {3, 6, 4, 9, 9, 9, 4, 9};
        int divisor = 3;
        Divisibility divisibility = new Divisibility();
        divisibility.validate(dividends, divisor);
    }
}
