import java.sql.SQLOutput;
import java.util.Scanner;

public class StringReverse {
   static String RevStr(String str){
       String rev="";
        int n = str.length();
       System.out.println(n);
        for(int i=(n-1);i>=0;i--){
            rev= rev + str.charAt(i);
        }
        return rev ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to be reversed");
        String Input = scanner.nextLine();
        String ReversedString = RevStr(Input);
        System.out.println("The reversed string is " +ReversedString);
    }
}
