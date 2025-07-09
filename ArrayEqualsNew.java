import java.util.Arrays;

public class ArrayEqualsNew {
    // check if two given arrays are equal


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
