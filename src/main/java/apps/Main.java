package apps;

import exptions.MyCustomExceptions;

public class Main {
    public static void main(String []args) {
        try {
            SquareRoot.calculateSquareRoot(-8);
        }catch (MyCustomExceptions e){
            System.out.println("IllegalArgumentException");
        }
    }
}
