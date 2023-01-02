package apps;

import exeptions.MyCustomException;

public class Main {
    public static void main(String[]args) throws MyCustomException {
        System.out.println(PeselValidator.validatePesel("11111160117"));

    }

}
