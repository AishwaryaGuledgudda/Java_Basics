import java.util.Scanner;

public class ReverseNum {
    StringBuffer NumReverse(int a){
        //Convert the given number to stringbuffer class to use revrese method
        StringBuffer sb = new StringBuffer(String.valueOf(a));
        StringBuffer rev=sb.reverse();
        return rev;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be revresed");
        int num = scanner.nextInt();
        ReverseNum rn = new ReverseNum();
        StringBuffer reversed = rn.NumReverse(num);
        System.out.println("The revresed number is " +num);

    }
}
