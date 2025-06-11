import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        int f = 1,x=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}
