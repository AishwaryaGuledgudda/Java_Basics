import java.math.BigInteger;

import static java.lang.String.valueOf;

public class YT_FactorialOfBigInteger {

    public static void main(String[] args) {
        int a = 50;
        BigInteger fact = BigInteger.ONE;
        for(int i=1;i<a;i++) {
           // fact=fact*i;
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }

}
