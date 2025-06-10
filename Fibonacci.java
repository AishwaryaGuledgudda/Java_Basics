import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number till where fib should be generated");
        int n = scanner.nextInt();
        int n1=0,n2=1,sum=0;
        System.out.print(+n1+" "+n2);
        for(int i=0;i<=(n-3);i++){ // (n-3) is imp because we are already printing two first digits
            sum=n1+n2;
            n1=n2;
            n2=sum;
            System.out.print(" "+sum);
        }

    }
}
