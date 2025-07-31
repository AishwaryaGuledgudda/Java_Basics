public class RS_Question5 {
    //sort array using bubble sort
    // if I is zero J will always be 1 (i+1)
    public static void main(String[] args) {
        int[] a={9,0,2,5,7};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){ // j will always be i+1 as its the next digit in array
                if(a[j]<a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }for(int c:a){
            System.out.print(c);
        }
        System.out.println();
        swapWithoutTemp();

    }
    public static void swapWithoutTemp(){
        int[] a={9,0,2,5,7};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){ // j will always be i+1 as its the next digit in array
                if(a[j]<a[i]){
                    //a=a+b,b=a-b,a=a-b
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];

                }
            }
        }for(int c:a){
            System.out.print(c);
        }

    }
}
