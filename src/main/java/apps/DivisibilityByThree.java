package apps;

import exeptions.MyCustomExceptions;

public class DivisibilityByThree {


    public void validate(int[] values){

        for (int i =0;i<=values.length-1;i++) {
            try {
                isDivisibleByThree(values[i]);
            } catch (MyCustomExceptions e) {
                System.out.println("IllegalArgumentException");
            }
        }
    }
    public boolean isDivisibleByThree(int value) throws MyCustomExceptions {
        if(value%3!=0)
        {
            throw new MyCustomExceptions("IllegalArgumentException");
        }
        return true;
    }
}
