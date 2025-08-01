public class YT_FindTheMissingNumArraySeq {
    //Find the missing number in the array (number in sequence)
    public static void main(String[] args) {
        int[] a={1,2,4,5,6};
        int endVar = a[a.length-1];
        int sumExpected;
        int sumActual = 0;
        int missingNum;
        sumExpected = endVar*(endVar+1)/2;
        System.out.println(sumExpected);
        for(int i=0;i<=a.length-1;i++){
            sumActual+=a[i];
        }
        System.out.println(sumActual);
        missingNum=sumExpected-sumActual;
        System.out.println(missingNum);
    }



}
