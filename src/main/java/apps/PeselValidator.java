package apps;

import exeptions.MyCustomException;

public class PeselValidator {

    public static boolean validatePesel(String pesel) throws MyCustomException {
        try {
            if (pesel.length() != 11) {
                System.out.println("Incorrect length PESEL");
                return false;
            }
            return checkChar(pesel);
        } catch (NullPointerException e) {
            System.out.println("Input data problems");
            return false;
        }

    }

    public static boolean checkChar(String pesel) throws MyCustomException {
        char[] arrayPesel = pesel.toCharArray();
        for (int i = 0; i <= pesel.length() - 1; i++) {
            try {
                Integer.parseInt(String.valueOf(arrayPesel[i]));
            } catch (NumberFormatException nfe) {
                System.out.println("Input data problems");
                return false;
            }
        }
        return true;
    }
}


