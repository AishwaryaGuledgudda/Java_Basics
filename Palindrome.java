import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

    int isPalindrome(String str){
        int l=str.length();
        String rev="";
        for(int i=(l-1);i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str)){
            return 0;
        }else return 1;
    }

    public static void main(String[] args) {
        Palindrome pal = new Palindrome(); // creating an object as the ispalindrome method is not static
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.nextLine();
        int result = pal.isPalindrome(input);
        if (result == 0) {
            System.out.println("The entered string is a palindrome");
        } else System.out.println("The entered string is not a palindrome");
    }
}
