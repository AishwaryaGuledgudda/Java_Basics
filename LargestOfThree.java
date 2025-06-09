import java.util.Scanner;

public class LargestOfThree {
   static int LarOfThree(int a, int b, int c){
    int large= a>b?a:b; //is a greater than b ? if yes then return "a" else return "b"
    int largest = Math.max(c, large);
    return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println("Enter the third number");
        int c = scanner.nextInt();
        int largest = LarOfThree(a,b,c);
        System.out.println("The largest number is " +largest);
    }
}
