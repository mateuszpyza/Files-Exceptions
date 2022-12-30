package apps;

public class Main {
    public static void main(String[]args){
        int[] values = {3,6,4,9,9,9,4,9};
        DivisibilityByThree divisibility = new DivisibilityByThree();
        divisibility.validate(values);
    }
}
