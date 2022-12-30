package apps;


import exptions.MyCustomExceptions;

import java.io.IOException;

public class SquareRoot {
    public static double calculateSquareRoot(double number) throws MyCustomExceptions {
        if (number<0){
            throw new MyCustomExceptions("IllegalArgumentException");
        }
            return Math.sqrt(number);
    }

}
