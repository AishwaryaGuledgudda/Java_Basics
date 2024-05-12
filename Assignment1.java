import java.util.Scanner;

public class Assignment1 {

    int sumArray(int[] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum =  sum+ a[i];
        }
        return sum;
    }

    public static boolean isPalindrome(String s) {
        StringBuilder reversed = new StringBuilder(s).reverse();
        return s.equals(reversed.toString());
    }

    public static int minMoves(String s) {
        if (!isPalindrome(s)) return -1;

        int moves = 0;
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                moves++;
            }
        }
        return moves;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            int moves = minMoves(input);
            System.out.println("Minimum moves to make it non-palindrome: " + moves);
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
    }


//int[] a = {1,2,3,4};
//        Assignment1 as = new Assignment1();
//System.out.println("The sum of the array is "+ as.sumArray(a));
