public class YT_ReverseADigit {
    public static void main(String[] args) {
        int a=123;
        int lastDigit;
        int revrseDigit = 0;
        while(a!=0) {
            lastDigit = a % 10;
            revrseDigit = revrseDigit * 10 + lastDigit;
            a = a / 10;
        }
        System.out.println(revrseDigit);

    }
}
