import java.util.Scanner;

public class FtoC {

    static float cel_value(float f){
       return (f-32)*5/9;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a fahrenheit:");
        float input = scanner.nextFloat();
        float celcius = cel_value(input);
        System.out.println("The celecius value of given f value is" +celcius);
    }

}
