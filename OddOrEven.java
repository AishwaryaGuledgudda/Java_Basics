import java.util.Scanner;

public class OddOrEven {

    static int OddEve(int a){
        if(a%2==0){
            return 0;
        }
        else return 1;
    }
//   static StringBuilder ReverseString(String str){
//        StringBuilder sb = new StringBuilder(str);
//
//        return sb.reverse();
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int input = scanner.nextInt();
        int result = OddEve(input);
        if (result == 0) {
            System.out.println("The entered value is Even");
        } else System.out.println("The entered value is Odd");
//        String s = "helo";
//        System.out.println(ReverseString(s));
    }
}
