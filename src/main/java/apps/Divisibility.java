package apps;

import exeptions.MyCustomExceptions;

public class Divisibility {
    public void validate(int[] dividends, int divisor) {

        for (int i = 0; i <= dividends.length - 1; i++) {
            try {
                isDivisible(dividends[i], divisor);
            } catch (MyCustomExceptions e) {
                System.out.println("IllegalArgumentException");
            }
        }
    }

    public boolean isDivisible(int dividend, int divisor) throws MyCustomExceptions {
        if (dividend % divisor != 0) {
            throw new MyCustomExceptions("IllegalArgumentException");
        }
        return true;
    }
}
