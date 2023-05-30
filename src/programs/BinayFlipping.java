package programs;

import java.util.Arrays;

public class BinayFlipping {
    public static void main(String[] args) {

    }

    public static void test(int[] arr) {
        long onesCount = Arrays.stream(arr).filter( a -> a==1).count();
        long zerosCount = Arrays.stream(arr).filter( a -> a==0).count();

        if(onesCount > zerosCount) {
            //convert zeros to one and check if valid
        } else {
            //convert ones to zeros and check if valid
        }
    }

    public boolean checkIfValid() {

        return false;
    }
}
