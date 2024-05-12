import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] a={2,4,5,6};
        int[] b={2,4,5,6};
        boolean equalsOrNot = true;
        if(a.length == b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    equalsOrNot = false;
                    break;
                }
            }
        }equalsOrNot = false;
        if(equalsOrNot){
            System.out.println("It is equal");
        }
        else System.out.println(" It is not");

        Boolean equal = Arrays.equals(a,b);
        System.out.println(equal);
    }
}
