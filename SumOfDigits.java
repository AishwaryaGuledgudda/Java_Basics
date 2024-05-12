public class SumOfDigits {
    public static void main(String[] args) {
        // accept the input
        //in a while loop find the reminder
        //find the que for n

        int n=123;
        int r;
        int sum=0;
        while(n>0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println(sum);

    }
}
