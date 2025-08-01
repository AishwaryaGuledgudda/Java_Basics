import java.util.Arrays;

public class YT_SwapTwoNO {

    //Swap using bitwise manipulation
    public static void main(String[] args) {
        int a=15,b=10;
        System.out.println("a= " +a+ " " +"b= "+b );
        a = a^b;
        System.out.println(a);
        b=a^b;
        System.out.println("b= " +b);
        a=a^b;
        System.out.println("a= " +a);
    }
}
