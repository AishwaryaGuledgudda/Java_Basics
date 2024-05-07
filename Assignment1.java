public class Assignment1 {

    int sumArray(int[] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum =  sum+ a[i];
        }
        return sum;

    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        Assignment1 as = new Assignment1();
        System.out.println("The sum of the array is "+ as.sumArray(a));
    }
}
