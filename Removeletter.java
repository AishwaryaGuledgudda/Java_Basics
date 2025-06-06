import java.util.Scanner;

public class Removeletter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String inputString= scanner.nextLine();
        System.out.println("Enter the char to eliminate");
        String eliminateChar= scanner.nextLine();
        String removedChar = inputString.replace(eliminateChar,"");
        System.out.printf(removedChar);
    }
}
