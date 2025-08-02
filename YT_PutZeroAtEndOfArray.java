public class YT_PutZeroAtEndOfArray {
    //Move all teh zeros at the end of the array
    public static void main(String[] args) {
        int[] a={1,0,2,0,3,0};
        int current;
        int nextSwap=0;
        for(current=0;current<a.length;current++){
            int temp;
            if(a[current]!=0){
                temp=a[nextSwap];
                a[nextSwap]=a[current];
                a[current]=temp;
                nextSwap++;
            }
        } for(int i:a){
            System.out.print(i);
        }
    }
}
