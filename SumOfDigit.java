import java.util.Scanner;

public class SumOfDigit {
   static int SumDigit(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = scanner.nextInt();
        int sumOfDigits = SumDigit(input);
        System.out.println("The sum of digits are " +sumOfDigits);
    }
}
