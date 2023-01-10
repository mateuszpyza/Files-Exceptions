package apps;

public class Main {
    public static void main(String[] args) throws WrongTypeOfDataException, IllegalLengthException {
        System.out.println(PeselValidator.validatePesel("12345678k01"));

    }

}
