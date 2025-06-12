public class ArrMinAndMax {
    public static void main(String[] args) {
        int[] a={30,50,66,12,10};
        int[] b={33,10,9,-1,6};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }System.out.println("The max number ib array is "+max);
        for(int j=1;j<b.length;j++){
            if(b[j]<min){
                min=b[j];
            }
        }
        System.out.println("The min number in array is "+min);

    }
}
