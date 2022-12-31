package apps;

import exeptions.MyCustomException;

public class PeselValidator {

    public static void validatePesel(String pesel) throws MyCustomException {
        if (pesel.length() != 11) {
            throw new MyCustomException("Incorrect length PESEL");
        }
        checkChar(pesel);
    }

    public static void checkChar(String pesel) throws MyCustomException {
        char[] arrayPesel = pesel.toCharArray();
        for (int i = 0; i <= pesel.length() - 1; i++) {
            if (arrayPesel[i] != '0' && arrayPesel[i] != '1' && arrayPesel[i] != '2' &&
                    arrayPesel[i] != '3' && arrayPesel[i] != '4' && arrayPesel[i] != '5' &&
                    arrayPesel[i] != '6' && arrayPesel[i] != '7' && arrayPesel[i] != '8' &&
                    arrayPesel[i] != '9') {
                throw new MyCustomException("WrongTypeOfDataException");
            }
        }
    }

}
