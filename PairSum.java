public class PairSum {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int num=9;
        int low=0;
        int high=a.length-1;
        while(a[low]<a[high]){
            if(a[low]+a[high] > num){
                high--;
            } else if (a[low]+a[high]<num) {
                low++;
            } else if (a[low]+a[high]==num) {
                System.out.println(a[low] +","+a[high]);
                low++;
                high--;
            }

        }
    }
}
