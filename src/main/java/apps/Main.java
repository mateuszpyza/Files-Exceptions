package apps;

import exeptions.MyCustomException;

public class Main {
    public static void main(String[]args) throws MyCustomException {
    PeselValidator.validatePesel("11111160111");
    }

}
