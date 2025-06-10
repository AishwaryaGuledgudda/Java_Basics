import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to test id prime or no");
        int num = scanner.nextInt();
        if(num>1){
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }if(count==2)
            {
                System.out.println("Is Prime number");
            }else System.out.println("Is not prime");
        }else System.out.println("The number is not prime");

    }
}
