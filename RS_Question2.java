public class RS_Question2 {

    //Multiply two numbers without using * operator
    public static void main(String[] args) {
        int result;
        result= multiply(5,10);
        tables(5,10);
        System.out.println(result);
    }
    //5 tables
    private static void  tables(int i, int j) {
        int k=1;
        int mul;
        while(k<=j){
            mul=(i*k);
            System.out.println(i+" x "+k+ " = " +mul );
            k++;
        }
    }

    private static int multiply(int i, int j) {
        int k=1;
        int sum=0;
        while(k<=j){
            sum=sum+i;
            k++;
        }
        return sum;
    }

}
