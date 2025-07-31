public class RS_Question3 {

    //Find out Max difference between any adjacent index of an array
    public static void main(String[] args) {
        int[] a = {17,1,4,8,15};  //16,3,4,7
        int maxdifference = MaxDiff(a);
        System.out.println(maxdifference);

    }

    private static int MaxDiff(int[] a) {
        int diff, large=0;
        for(int i=1;i<a.length;i++){
            diff=Math.abs(a[i]-a[i-1]);
            //System.out.println(diff);
            if(diff>large){
                large=diff;
            }

        }
        return large;
    }
}
