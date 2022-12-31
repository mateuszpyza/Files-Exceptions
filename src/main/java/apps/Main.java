package apps;

import exeptions.MyCustomException;

public class Main {
    public static void main(String[]args) throws MyCustomException {
    PeselValidator.validatePesel("111111%1111");
    }
}
