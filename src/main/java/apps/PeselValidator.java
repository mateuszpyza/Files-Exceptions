package apps;

import exeptions.MyCustomException;

public class PeselValidator {

    public static void validatePesel(String pesel) throws MyCustomException {
        try {
            if (pesel.length() != 11) {
                throw new MyCustomException("Incorrect length PESEL");
            }
            checkChar(pesel);
        } catch (NullPointerException e) {
            throw new MyCustomException("Input data problems");
        }

    }

    public static void checkChar(String pesel) throws MyCustomException {
        char[] arrayPesel = pesel.toCharArray();
        for (int i = 0; i <= pesel.length() - 1; i++) {
            try {
                Integer.parseInt(String.valueOf(arrayPesel[i]));
            } catch (NumberFormatException nfe) {
                throw new MyCustomException("Input data problems");
            }
        }
    }
}


