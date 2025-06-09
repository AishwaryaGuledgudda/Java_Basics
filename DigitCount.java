import java.util.Scanner;

public class DigitCount {
    static int countDigi(int num){
        StringBuffer str = new StringBuffer(String.valueOf(num));
        return str.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = scanner.nextInt();
        int count =  countDigi(input);
        System.out.println("The number if digit present in the input number is " +count);
    }
}
