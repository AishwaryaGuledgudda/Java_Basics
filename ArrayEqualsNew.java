import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualsNew {


    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={1,2,3,4};
        boolean equal;
        equal = Arrays.equals(a, b);
        if(equal){
            System.out.println("The arrays are equal");
        }else System.out.println("The arrays are not equal");
    }
}
