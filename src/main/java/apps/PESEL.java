package apps;

import exeptions.MyCustomException;

public class PESEL {
    public void validatePESEL (String PESEL)throws MyCustomException{
        if(PESEL.length() != 11){
            throw new MyCustomException("Incorrect length PESEL");

        }

    }
}
