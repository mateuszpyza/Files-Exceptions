package apps;

public class PeselValidator {

    public static boolean validatePesel(String pesel) throws IllegalLengthException, WrongTypeOfDataException {
        if (pesel != null) {
            if (pesel.length() != 11) {
                throw new IllegalLengthException("Incorrect length PESEL!");
            }
            return checkChar(pesel);
        } else {
            System.out.println("Input data is null!");
            return false;
        }

    }

    public static boolean checkChar(String pesel) throws WrongTypeOfDataException {
        char[] arrayPesel = pesel.toCharArray();
        for (int i = 0; i <= pesel.length() - 1; i++) {
            try {
                Integer.parseInt(String.valueOf(arrayPesel[i]));
            } catch (NumberFormatException nfe) {
                throw new WrongTypeOfDataException("Character isn't digit!");
            }
        }
        return true;
    }
}


