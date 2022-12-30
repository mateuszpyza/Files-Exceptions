package apps;

import exeptions.MyCustomException;

public class Main {
    public static void main(String[]args) throws MyCustomException {
        String PESEL = "11111111111";
        apps.PESEL pesel = new PESEL();
        pesel.validatePESEL(PESEL);
    }
}
