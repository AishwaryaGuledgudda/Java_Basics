import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeRevised {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = input.nextInt();
//        int F=0,S=1,fib;
//        for(int i=0;i<=(n-2);i++){
//            fib=F+S;
//            F=S;
//            S=fib;
//            System.out.print(fib);
//        }
//    }

    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={1,2,3,4};
        boolean e = Arrays.equals(a,b);
        if(e){
            System.out.println("Equal");
        }else System.out.println("Not Equal");
    }
}
